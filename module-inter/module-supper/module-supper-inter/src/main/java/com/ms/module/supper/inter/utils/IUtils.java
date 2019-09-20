package com.ms.module.supper.inter.utils;

import com.ms.module.supper.inter.api.IAPI;
import com.ms.module.supper.inter.supper.ISupper;

public interface IUtils extends ISupper {


    IApkUtils getApkUtils();

    IToastUtils getToastUtils();

}
