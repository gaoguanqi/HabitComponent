package com.maple.account.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.maple.account.R;
import com.maple.baselibrary.router.RouterActivityPath;

@Route(path = RouterActivityPath.Account.PAGER_Login)
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
