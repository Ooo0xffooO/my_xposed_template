package com.lili.test;

import android.util.Log;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class r0hook implements IXposedHookLoadPackage {
    private static final String TAG = "r0hook";
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        XposedBridge.log(loadPackageParam.packageName);
        // Using different log levels
        Log.v(TAG, "Verbose log: " + loadPackageParam.packageName);
        Log.d(TAG, "Debug log: " + loadPackageParam.packageName);
        Log.i(TAG, "Info log: " + loadPackageParam.packageName);
        Log.w(TAG, "Warn log: " + loadPackageParam.packageName);
        Log.e(TAG, "Error log: " + loadPackageParam.packageName);
    }
}
