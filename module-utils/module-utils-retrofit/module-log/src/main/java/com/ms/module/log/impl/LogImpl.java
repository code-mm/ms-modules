package com.ms.module.log.impl;

import android.util.Log;

import com.ms.module.supper.inter.log.IlogAdapter;

public class LogImpl extends IlogAdapter {


    @Override
    public void i(String tag, String log) {
        Log.i(tag, log);
    }

    @Override
    public void d(String tag, String log) {
        Log.d(tag, log);
    }

    @Override
    public void e(String tag, String log) {
        Log.e(tag, log);
    }
}


