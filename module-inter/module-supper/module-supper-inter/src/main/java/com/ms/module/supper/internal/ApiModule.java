package com.ms.module.supper.internal;

import com.ms.module.supper.inter.api.IAPI;
import com.ms.module.supper.inter.module.ModuleAdapter;

public class ApiModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.api.impl.ApiImpl";


    private IAPI iapi;


    @Override
    public IAPI get() {
        if (iapi == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IAPI) {
                    iapi = (IAPI) o;
                }
            }
        }
        return iapi;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}