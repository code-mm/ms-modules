package com.ms.module.supper.inter.data;

import com.ms.module.supper.inter.supper.ISupper;

public interface IUserData extends ISupper {


    void setUserId(String userId);

    String getUserId();

    void setUserName(String userName);

    String getUserName();


}
