package com.maple.main.view.activity;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.maple.baselibrary.router.RouterActivityPath;
import com.maple.baselibrary.utils.LogUtils;

@Route(path = RouterActivityPath.Main.PAGER_SPLASH)
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                launchTarget();
            }
        }, 3 * 1000);
    }


    private void launchTarget() {

        LogUtils.logGGQ("launchTarget");
        ARouter.getInstance().build(RouterActivityPath.Account.PAGER_Login).navigation();
        this.finish();
    }
}
