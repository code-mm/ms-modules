package com.ms.module.supper.inter.module;

import com.ms.module.supper.inter.supper.ISupper;

public interface Module extends ISupper {

    ISupper get();

    String name();

}
