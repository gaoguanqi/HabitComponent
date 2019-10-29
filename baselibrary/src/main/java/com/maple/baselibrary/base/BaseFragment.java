package com.maple.baselibrary.base;

import androidx.databinding.ViewDataBinding;

import me.goldze.mvvmhabit.base.BaseViewModel;

public abstract class BaseFragment<V extends ViewDataBinding, VM extends BaseViewModel> extends me.goldze.mvvmhabit.base.BaseFragment<V, VM> {

    @Override
    public void initParam() {
        super.initParam();

    }
}
