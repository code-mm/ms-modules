package com.ms.module.supper.inter.mmkv;

import com.ms.module.supper.inter.supper.ISupper;

public interface IMMKV extends ISupper {

    void put(String k, String v);

    String get(String k);

    void removeKey(String key);

    void removeValuesForKeys(String[] keys);

}
