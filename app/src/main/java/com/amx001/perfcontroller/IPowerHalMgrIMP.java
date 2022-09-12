/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.amx001.perfcontroller;
// Declare any non-default types here with import statements

public interface IPowerHalMgrIMP extends android.os.IInterface
{
  /** Default implementation for IPowerHalMgrIMP. */
  public static class Default implements IPowerHalMgrIMP
  {
    @Override public int scnReg() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void hideMethod1() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod2() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod3() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod4() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod5() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod6() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod7() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod8() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod9() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod10() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod11() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod12() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod13() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod14() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod15() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod16() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod17() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod18() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod19() throws android.os.RemoteException
    {
    }
    @Override public void hideMethod20() throws android.os.RemoteException
    {
    }
    @Override public int perfLockAcquire(int handle, int duration, int[] list) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void perfLockRelease(int handle) throws android.os.RemoteException
    {
    }
    @Override public int querySysInfo(int cmd, int param) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements IPowerHalMgrIMP
  {
    private static final String DESCRIPTOR = "com.mediatek.powerhalmgr.IPowerHalMgr";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.amx001.perfcontroller.IPowerHalMgrIMP interface,
     * generating a proxy if needed.
     */
    public static IPowerHalMgrIMP asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof IPowerHalMgrIMP))) {
        return ((IPowerHalMgrIMP)iin);
      }
      return new Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_scnReg:
        {
          data.enforceInterface(descriptor);
          int _result = this.scnReg();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hideMethod1:
        {
          data.enforceInterface(descriptor);
          this.hideMethod1();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod2:
        {
          data.enforceInterface(descriptor);
          this.hideMethod2();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod3:
        {
          data.enforceInterface(descriptor);
          this.hideMethod3();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod4:
        {
          data.enforceInterface(descriptor);
          this.hideMethod4();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod5:
        {
          data.enforceInterface(descriptor);
          this.hideMethod5();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod6:
        {
          data.enforceInterface(descriptor);
          this.hideMethod6();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod7:
        {
          data.enforceInterface(descriptor);
          this.hideMethod7();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod8:
        {
          data.enforceInterface(descriptor);
          this.hideMethod8();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod9:
        {
          data.enforceInterface(descriptor);
          this.hideMethod9();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod10:
        {
          data.enforceInterface(descriptor);
          this.hideMethod10();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod11:
        {
          data.enforceInterface(descriptor);
          this.hideMethod11();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod12:
        {
          data.enforceInterface(descriptor);
          this.hideMethod12();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod13:
        {
          data.enforceInterface(descriptor);
          this.hideMethod13();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod14:
        {
          data.enforceInterface(descriptor);
          this.hideMethod14();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod15:
        {
          data.enforceInterface(descriptor);
          this.hideMethod15();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod16:
        {
          data.enforceInterface(descriptor);
          this.hideMethod16();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod17:
        {
          data.enforceInterface(descriptor);
          this.hideMethod17();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod18:
        {
          data.enforceInterface(descriptor);
          this.hideMethod18();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod19:
        {
          data.enforceInterface(descriptor);
          this.hideMethod19();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_hideMethod20:
        {
          data.enforceInterface(descriptor);
          this.hideMethod20();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_perfLockAcquire:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int[] _arg2;
          _arg2 = data.createIntArray();
          int _result = this.perfLockAcquire(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_perfLockRelease:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.perfLockRelease(_arg0);
          return true;
        }
        case TRANSACTION_querySysInfo:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.querySysInfo(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements IPowerHalMgrIMP
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public int scnReg() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_scnReg, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().scnReg();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void hideMethod1() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod1, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod1();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod2();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod3() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod3, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod3();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod4() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod4, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod4();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod5() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod5, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod5();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod6() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod6, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod6();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod7() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod7, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod7();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod8() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod8, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod8();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod9() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod9, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod9();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod10() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod10, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod10();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod11() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod11, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod11();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod12() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod12, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod12();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod13() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod13, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod13();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod14() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod14, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod14();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod15() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod15, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod15();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod16() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod16, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod16();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod17() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod17, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod17();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod18() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod18, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod18();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod19() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod19, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod19();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void hideMethod20() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hideMethod20, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().hideMethod20();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int perfLockAcquire(int handle, int duration, int[] list) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(handle);
          _data.writeInt(duration);
          _data.writeIntArray(list);
          boolean _status = mRemote.transact(Stub.TRANSACTION_perfLockAcquire, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().perfLockAcquire(handle, duration, list);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void perfLockRelease(int handle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(handle);
          boolean _status = mRemote.transact(Stub.TRANSACTION_perfLockRelease, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().perfLockRelease(handle);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public int querySysInfo(int cmd, int param) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cmd);
          _data.writeInt(param);
          boolean _status = mRemote.transact(Stub.TRANSACTION_querySysInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().querySysInfo(cmd, param);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static IPowerHalMgrIMP sDefaultImpl;
    }
    static final int TRANSACTION_scnReg = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_hideMethod1 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_hideMethod2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_hideMethod3 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_hideMethod4 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_hideMethod5 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_hideMethod6 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_hideMethod7 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_hideMethod8 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_hideMethod9 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_hideMethod10 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_hideMethod11 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_hideMethod12 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_hideMethod13 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_hideMethod14 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_hideMethod15 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_hideMethod16 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_hideMethod17 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_hideMethod18 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_hideMethod19 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_hideMethod20 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_perfLockAcquire = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_perfLockRelease = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_querySysInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    public static boolean setDefaultImpl(IPowerHalMgrIMP impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static IPowerHalMgrIMP getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  public int scnReg() throws android.os.RemoteException;
  public void hideMethod1() throws android.os.RemoteException;
  public void hideMethod2() throws android.os.RemoteException;
  public void hideMethod3() throws android.os.RemoteException;
  public void hideMethod4() throws android.os.RemoteException;
  public void hideMethod5() throws android.os.RemoteException;
  public void hideMethod6() throws android.os.RemoteException;
  public void hideMethod7() throws android.os.RemoteException;
  public void hideMethod8() throws android.os.RemoteException;
  public void hideMethod9() throws android.os.RemoteException;
  public void hideMethod10() throws android.os.RemoteException;
  public void hideMethod11() throws android.os.RemoteException;
  public void hideMethod12() throws android.os.RemoteException;
  public void hideMethod13() throws android.os.RemoteException;
  public void hideMethod14() throws android.os.RemoteException;
  public void hideMethod15() throws android.os.RemoteException;
  public void hideMethod16() throws android.os.RemoteException;
  public void hideMethod17() throws android.os.RemoteException;
  public void hideMethod18() throws android.os.RemoteException;
  public void hideMethod19() throws android.os.RemoteException;
  public void hideMethod20() throws android.os.RemoteException;
  public int perfLockAcquire(int handle, int duration, int[] list) throws android.os.RemoteException;
  public void perfLockRelease(int handle) throws android.os.RemoteException;
  public int querySysInfo(int cmd, int param) throws android.os.RemoteException;
}
