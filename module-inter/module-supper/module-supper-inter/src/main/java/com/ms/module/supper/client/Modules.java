package com.ms.module.supper.client;

import com.ms.module.supper.inter.api.IAPI;
import com.ms.module.supper.inter.log.ILog;
import com.ms.module.supper.inter.utils.IUtils;
import com.ms.module.supper.internal.ModuleClient;

public class Modules {

    public static ILog getLogModule() {
        return ModuleClient.getLogModule().get();
    }

    public static IAPI getApiModule() {
        return ModuleClient.getApiModule().get();
    }

    public static IUtils getUtilsModule() {
        return ModuleClient.getUtilsModule().get();
    }
}
