package com.ms.module.supper.inter.utils;

import com.ms.module.supper.inter.supper.ISupper;

public interface IThreadPoolUtils  extends ISupper {


    void runOnMainThread(Runnable runnable);

    void runSubThread(Runnable runnable);

    void kill();



}
