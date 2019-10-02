package com.ms.module.base.presenter;

import com.ms.module.base.inter.IModel;
import com.ms.module.base.inter.IPresenter;
import com.ms.module.base.inter.IView;

public abstract class BasePresenter<M extends IModel, V extends IView> implements IPresenter, IView {

    protected V view;
    protected M model;


    public BasePresenter(V view) {
        this.view = view;
        model = initModel();
    }

    protected abstract M initModel();

}
