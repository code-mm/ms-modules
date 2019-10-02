package com.ms.module.supper.inter.utils;

import com.ms.module.supper.inter.supper.ISupper;

public interface IEncryptionUtils  extends ISupper {

    String encode(String src);

    String decode(String src);

}
