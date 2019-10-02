package com.ms.module.supper.inter.utils;

import com.ms.module.supper.inter.supper.ISupper;

public interface IGsonUtils extends ISupper {
    void toJson(Object object);


    <T> T format(String json,T t);
}

