package com.amx001.perfcontroller;

public class PerfRes {
    public final static int PERF_RES_CPUFREQ_MIN_CLUSTER_0 = 0x00400000;
    public final static int PERF_RES_CPUFREQ_MIN_CLUSTER_1 = 0x00400100;
    public final static int PERF_RES_CPUFREQ_MIN_CLUSTER_2 = 0x00400200;
    public final static int PERF_RES_CPUFREQ_MAX_CLUSTER_0 = 0x00404000;
    public final static int PERF_RES_CPUFREQ_MAX_CLUSTER_1 = 0x00404100;
    public final static int PERF_RES_CPUFREQ_MAX_CLUSTER_2 = 0x00404200;

    public final static int PERF_RES_CPUCORE_MIN_CLUSTER_0 = 0x00800000;
    public final static int PERF_RES_CPUCORE_MIN_CLUSTER_1 = 0x00800100;
    public final static int PERF_RES_CPUCORE_MIN_CLUSTER_2 = 0x00800200;
    public final static int PERF_RES_CPUCORE_MAX_CLUSTER_0 = 0x00804000;
    public final static int PERF_RES_CPUCORE_MAX_CLUSTER_1 = 0x00804100;
    public final static int PERF_RES_CPUCORE_MAX_CLUSTER_2 = 0x00804200;

    public final static int PERF_RES_SCHED_UCLAMP_MIN_ROOT = 0x01408000;
    public final static int PERF_RES_SCHED_UCLAMP_MIN_FG = 0x01408100;
    public final static int PERF_RES_SCHED_UCLAMP_MIN_BG = 0x01408200;
    public final static int PERF_RES_SCHED_UCLAMP_MIN_TA = 0x01408300;
    public final static int PERF_RES_SCHED_UCLAMP_MIN_RT = 0x01408400;
    public final static int PERF_RES_SCHED_UCLAMP_MIN_SYS = 0x01408500;
    public final static int PERF_RES_SCHED_UCLAMP_MAX_ROOT = 0x01408600;
    public final static int PERF_RES_SCHED_UCLAMP_MAX_FG = 0x01408700;
    public final static int PERF_RES_SCHED_UCLAMP_MAX_BG = 0x01408800;
    public final static int PERF_RES_SCHED_UCLAMP_MAX_TA = 0x01408900;
    public final static int PERF_RES_SCHED_UCLAMP_MAX_RT = 0x01408a00;
    public final static int PERF_RES_SCHED_UCLAMP_MAX_SYS = 0x01408b00;
    public final static int PERF_RES_SCHED_UCLAMP_MIN_SYSBG = 0x01408c00;
    public final static int PERF_RES_SCHED_UCLAMP_MAX_SYSBG = 0x01408d00;

    public final static int PERF_RES_POWERHAL_SCREEN_OFF_STATE = 0x03400000;

    public final static int MTKPOWER_SCREEN_OFF_DISABLE = 0;
    public final static int MTKPOWER_SCREEN_OFF_ENABLE = 1;
    public final static int MTKPOWER_SCREEN_OFF_WAIT_RESTORE = 2;
    public final static int MTKPOWER_SCREEN_OFF_ALWAYS_VALID = 3;

    public final static int MTKPOWER_CMD_GET_CLUSTER_NUM = 0;
    public final static int MTKPOWER_CMD_GET_CLUSTER_CPU_NUM = 1;
    public final static int MTKPOWER_CMD_GET_CLUSTER_CPU_FREQ_MIN = 2;
    public final static int MTKPOWER_CMD_GET_CLUSTER_CPU_FREQ_MAX = 3;
}
