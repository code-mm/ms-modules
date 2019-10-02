package com.ms.module.base.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    /**
     * View
     */
    protected View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // 实例化View
        view = inflater.inflate(getLayout(), container, false);
        // 初始化控件
        initView();
        // 返回视图
        return view;
    }

    protected abstract void initView();

    protected abstract int getLayout();


    public <T> T findViewById(int viewID) {
        return (T) view.findViewById(viewID);
    }
}
