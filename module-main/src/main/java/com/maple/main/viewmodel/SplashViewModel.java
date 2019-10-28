package com.maple.main.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.alibaba.android.arouter.launcher.ARouter;
import com.maple.baselibrary.router.RouterActivityPath;
import com.maple.baselibrary.utils.LogUtils;
import com.maple.reslibrary.widget.timer.MyCountDownTimer;

import me.goldze.mvvmhabit.base.BaseViewModel;


public class SplashViewModel extends BaseViewModel {

    public ObservableField<String> timeText = new ObservableField<>();
    private MyCountDownTimer timer;

    public SplashViewModel(@NonNull Application application) {
        super(application);
    }




    public void timerTask() {
            timer = new MyCountDownTimer(3000, 1000, new MyCountDownTimer.MyCountDownTimerListener() {
                @Override
                public void onStart() {
                    timeText.set("3");
                }

                @Override
                public void onTick(long millisUntilFinished) {
                    timeText.set(String.valueOf(millisUntilFinished / 1000));
                }

                @Override
                public void onFinish() {
                    launchTarget();
                }
            });
    }


    private void launchTarget() {
        LogUtils.logGGQ("launchTarget");
        ARouter.getInstance().build(RouterActivityPath.Account.PAGER_LOGIN).navigation();
        this.finish();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(timer != null){
            timer.cancel();
            timer = null;
        }
    }
}
