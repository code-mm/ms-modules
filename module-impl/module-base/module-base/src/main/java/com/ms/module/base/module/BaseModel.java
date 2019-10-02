package com.ms.module.base.module;

import com.ms.module.base.inter.IModel;
import com.ms.module.base.inter.IPresenter;

public abstract class BaseModel<P extends IPresenter> implements IModel {

    protected P presenter;

    public BaseModel(P presenter) {
        this.presenter = presenter;
    }

}
