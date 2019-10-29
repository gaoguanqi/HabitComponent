package com.maple.baselibrary.base;

import android.content.res.Configuration;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

import com.gyf.immersionbar.ImmersionBar;
import com.gyf.immersionbar.OSUtils;
import com.maple.baselibrary.R;

import me.goldze.mvvmhabit.base.BaseViewModel;

public abstract class BaseActivity<V extends ViewDataBinding, VM extends BaseViewModel> extends me.goldze.mvvmhabit.base.BaseActivity<V,VM> {
    protected ImmersionBar mImmersionBar;

    @Override
    public void initParam() {
        super.initParam();

        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.fitsSystemWindows(true);
        mImmersionBar.statusBarColor(R.color.colorPrimaryDark);
        mImmersionBar.navigationBarColor(R.color.white);
        mImmersionBar.navigationBarDarkIcon(true);
        mImmersionBar.init();
    }


    @Override
    protected void onResume() {
        super.onResume();
        // 非必加
        // 如果你的app可以横竖屏切换，适配了华为emui3系列系统手机，并且navigationBarWithEMUI3Enable为true，
        // 请在onResume方法里添加这句代码（同时满足这三个条件才需要加上代码哦：1、横竖屏可以切换；2、华为emui3系列系统手机；3、navigationBarWithEMUI3Enable为true）
        // 否则请忽略
        if (OSUtils.isEMUI3_x() && mImmersionBar != null) {
            mImmersionBar.init();
        }
    }


    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // 非必加
        // 如果你的app可以横竖屏切换，适配了4.4或者华为emui3.1系统手机，并且navigationBarWithKitkatEnable为true，
        // 请务必在onConfigurationChanged方法里添加如下代码（同时满足这三个条件才需要加上代码哦：1、横竖屏可以切换；2、android4.4或者华为emui3.1系统手机；3、navigationBarWithKitkatEnable为true）
        // 否则请忽略
        if(mImmersionBar != null){
            mImmersionBar.init();
        }
    }
}
