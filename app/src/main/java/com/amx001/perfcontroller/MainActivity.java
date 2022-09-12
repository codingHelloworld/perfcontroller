package com.amx001.perfcontroller;

import static com.amx001.perfcontroller.PerfRes.PERF_RES_CPUCORE_MAX_CLUSTER_0;
import static com.amx001.perfcontroller.PerfRes.PERF_RES_CPUCORE_MAX_CLUSTER_1;
import static com.amx001.perfcontroller.PerfRes.PERF_RES_CPUCORE_MAX_CLUSTER_2;
import static com.amx001.perfcontroller.PerfRes.PERF_RES_CPUFREQ_MAX_CLUSTER_0;
import static com.amx001.perfcontroller.PerfRes.PERF_RES_CPUFREQ_MAX_CLUSTER_1;
import static com.amx001.perfcontroller.PerfRes.PERF_RES_CPUFREQ_MAX_CLUSTER_2;
import static com.amx001.perfcontroller.PerfRes.PERF_RES_POWERHAL_SCREEN_OFF_STATE;
import static com.amx001.perfcontroller.PerfRes.PERF_RES_SCHED_UCLAMP_MAX_FG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.text.Editable;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

@SuppressLint("UseSwitchCompatOrMaterialCode")
public class MainActivity extends AppCompatActivity {
    private final static String TAG = "PerfCtl";
    private final static int MSG_START = 1;
    private final static int MSG_STOP = 2;
    private final static int POWER_DUR_MS = 12000;
    private final static int MSG_DELAY_MS = 10000;

    private Spinner mC0NumSpinner;
    private Spinner mC1NumSpinner;
    private Spinner mC2NumSpinner;
    private Spinner mC0MaxFreqSpinner;
    private Spinner mC1MaxFreqSpinner;
    private Spinner mC2MaxFreqSpinner;
    private Switch mc0CoreSwitch;
    private Switch mc1CoreSwitch;
    private Switch mc2CoreSwitch;
    private Switch mc0FreqSwitch;
    private Switch mc1FreqSwitch;
    private Switch mc2FreqSwitch;
    private Switch mFgUtilSwitch;
    private EditText mFgUtilMaxEdit;

    private HandlerThread mHandlerThread;
    private Handler mSubHandler;

    private IPowerHalMgrIMP mPowerMgr;
    private int mPowerHandle = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        initHandler();
        mPowerMgr = IPowerHalMgrIMP.Stub.asInterface(
                ServiceManager.getService("power_hal_mgr_service"));
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy");
        mHandlerThread.quitSafely();
        super.onDestroy();
    }

    private void addViews() {
        mc0CoreSwitch = findViewById(R.id.c0CoreMaxNum);
        mc1CoreSwitch = findViewById(R.id.c1CoreMaxNum);
        mc2CoreSwitch = findViewById(R.id.c2CoreMaxNum);
        mc0FreqSwitch = findViewById(R.id.c0MaxFreq);
        mc1FreqSwitch = findViewById(R.id.c1MaxFreq);
        mc2FreqSwitch = findViewById(R.id.c2MaxFreq);
        mC0NumSpinner = findViewById(R.id.c0CoreNums);
        mC1NumSpinner = findViewById(R.id.c1CoreNums);
        mC2NumSpinner = findViewById(R.id.c2CoreNums);
        mC0MaxFreqSpinner = findViewById(R.id.c0Freqs);
        mC1MaxFreqSpinner = findViewById(R.id.c1Freqs);
        mC2MaxFreqSpinner = findViewById(R.id.c2Freqs);
        mFgUtilSwitch = findViewById(R.id.fgUtilSwitch);
        mFgUtilMaxEdit = findViewById(R.id.fgUtilMax);
        SeekBar fgUtilSbar = findViewById(R.id.fgUtilSbar);
        fgUtilSbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mFgUtilMaxEdit.setText(i + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        Button startBtn = findViewById(R.id.startBtn);
        startBtn.setOnClickListener(view -> mSubHandler.sendEmptyMessage(MSG_START));
        Button stopBtn = findViewById(R.id.stopBtn);
        stopBtn.setOnClickListener(view -> mSubHandler.sendEmptyMessage(MSG_STOP));
    }

    private void initHandler() {
        mHandlerThread = new HandlerThread("perfCtlThread");
        mHandlerThread.start();
        mSubHandler = new Handler(mHandlerThread.getLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                switch (msg.what) {
                    case MSG_START:
                        removeMessages(MSG_START);
                        startCtl();
                        sendEmptyMessageDelayed(MSG_START, MSG_DELAY_MS);
                        break;
                    case MSG_STOP:
                        removeMessages(MSG_START);
                        stopCtl();
                        break;
                    default:
                        break;
                }
            }
        };
    }

    private int[] getPowerParams() {
        List<Integer> params = new ArrayList<>();
        // cpu cluster max core limit:
        if (mc0CoreSwitch.isChecked()) {
            params.add(PERF_RES_CPUCORE_MAX_CLUSTER_0);
            params.add(Integer.parseInt((String) mC0NumSpinner.getSelectedItem()));
        }
        if (mc1CoreSwitch.isChecked()) {
            params.add(PERF_RES_CPUCORE_MAX_CLUSTER_1);
            params.add(Integer.parseInt((String) mC1NumSpinner.getSelectedItem()));
        }
        if (mc2CoreSwitch.isChecked()) {
            params.add(PERF_RES_CPUCORE_MAX_CLUSTER_2);
            params.add(Integer.parseInt((String) mC2NumSpinner.getSelectedItem()));
        }
        // cpu cluster max freq limit:
        if (mc0FreqSwitch.isChecked()) {
            params.add(PERF_RES_CPUFREQ_MAX_CLUSTER_0);
            params.add(Integer.parseInt((String) mC0MaxFreqSpinner.getSelectedItem()) * 1000);
        }
        if (mc1FreqSwitch.isChecked()) {
            params.add(PERF_RES_CPUFREQ_MAX_CLUSTER_1);
            params.add(Integer.parseInt((String) mC1MaxFreqSpinner.getSelectedItem()) * 1000);
        }
        if (mc2FreqSwitch.isChecked()) {
            params.add(PERF_RES_CPUFREQ_MAX_CLUSTER_2);
            params.add(Integer.parseInt((String) mC2MaxFreqSpinner.getSelectedItem()) * 1000);
        }
        // FG UTIL MAX:
        if (mFgUtilSwitch.isChecked()) {
            int uclamp = -1;
            Editable et = mFgUtilMaxEdit.getText();
            if (et != null) {
                String fgUtilStr = et.toString();
                try {
                    uclamp = Integer.parseInt(fgUtilStr.substring(0, fgUtilStr.length() - 1));
                } catch (Exception e) {}
            }
            if (uclamp > -1) {
                params.add(PERF_RES_SCHED_UCLAMP_MAX_FG);
                params.add(uclamp);
            }
        }
        if (params.size() > 0) {
            params.add(PERF_RES_POWERHAL_SCREEN_OFF_STATE);
            params.add(3);
            Log.i(TAG, params.toString());
            return params.stream().mapToInt(Integer::intValue).toArray();
        }
        return null;
    }

    private boolean checkPowerInvalid() {
        return null == mPowerMgr || !mPowerMgr.asBinder().isBinderAlive();
    }

    private void startCtl() {
        int[] params = getPowerParams();
        if (null == params)
            return;
        if (checkPowerInvalid())
            return;
        try {
            mPowerHandle = mPowerMgr.perfLockAcquire(
                    mPowerHandle, POWER_DUR_MS, params);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "start");
    }

    private void stopCtl() {
        if (-1 == mPowerHandle)
            return;
        if (checkPowerInvalid())
            return;
        try {
            mPowerMgr.perfLockRelease(mPowerHandle);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "stop");
    }
}