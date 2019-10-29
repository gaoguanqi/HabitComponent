package com.maple.main.view.activity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.maple.baselibrary.base.BaseActivity;
import com.maple.baselibrary.router.RouterActivityPath;
import com.maple.main.BR;
import com.maple.main.R;
import com.maple.main.databinding.ActivitySplashBinding;
import com.maple.main.viewmodel.SplashViewModel;


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
