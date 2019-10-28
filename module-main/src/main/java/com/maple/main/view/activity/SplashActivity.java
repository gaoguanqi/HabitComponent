package com.maple.main.view.activity;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.maple.baselibrary.router.RouterActivityPath;
import com.maple.baselibrary.utils.LogUtils;
import com.maple.main.BR;
import com.maple.main.R;
import com.maple.main.databinding.ActivitySplashBinding;
import com.maple.main.viewmodel.SplashViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

@Route(path = RouterActivityPath.Main.PAGER_SPLASH)
public class SplashActivity extends BaseActivity<ActivitySplashBinding, SplashViewModel> {


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_splash;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();
        viewModel.timerTask();
    }
}
