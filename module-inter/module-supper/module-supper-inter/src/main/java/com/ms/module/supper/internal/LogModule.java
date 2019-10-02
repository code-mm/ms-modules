package com.ms.module.supper.internal;

import com.ms.module.supper.inter.log.ILog;
import com.ms.module.supper.inter.log.IlogAdapter;
import com.ms.module.supper.inter.module.ModuleAdapter;

public class LogModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.log.impl.LogImpl";


    private ILog ilog;

    @Override
    public ILog get() {
        if (ilog == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof ILog) {
                    ilog = (ILog) o;

                    if (ilog != null) {
                        return ilog;
                    } else {
                        return new IlogAdapter();
                    }

                }
            }
        }
        return ilog;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}