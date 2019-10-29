package com.maple.account.view;


import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.maple.account.R;
import com.maple.account.BR;
import com.maple.account.databinding.ActivityLoginBinding;
import com.maple.account.viewmodel.LoginViewModel;
import com.maple.baselibrary.base.BaseActivity;
import com.maple.baselibrary.router.RouterActivityPath;


@Route(path = RouterActivityPath.Account.PAGER_LOGIN)
public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginViewModel> {


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_login;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


}
