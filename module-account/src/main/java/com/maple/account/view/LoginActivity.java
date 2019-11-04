package com.maple.account.view;


import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.maple.account.BR;
import com.maple.account.R;
import com.maple.account.app.global.ViewModelFactory;
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

    @Override
    public LoginViewModel initViewModel() {
        //使用自定义的ViewModelFactory来创建ViewModel，如果不重写该方法，则默认会调用LoginViewModel(@NonNull Application application)构造方法
        ViewModelFactory factory = ViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this, factory).get(LoginViewModel.class);
    }

    @Override
    public void initViewObservable() {
        super.initViewObservable();
        //监听ViewModel中pSwitchObservable的变化, 当ViewModel中执行【uc.pSwitchObservable.set(!uc.pSwitchObservable.get());】时会回调该方法
        viewModel.uc.pSwitchEvent.observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(@Nullable Boolean aBoolean) {
                //pSwitchObservable是boolean类型的观察者,所以可以直接使用它的值改变密码开关的图标
                if (viewModel.uc.pSwitchEvent.getValue()) {
                    //密码可见
                    //在xml中定义id后,使用binding可以直接拿到这个view的引用,不再需要findViewById去找控件了
                    binding.etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    //密码不可见
                    binding.etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                binding.etPassword.setSelection(binding.etPassword.getText().toString().length());
            }
        });
    }
}
