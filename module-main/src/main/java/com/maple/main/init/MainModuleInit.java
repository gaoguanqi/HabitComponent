package com.maple.main.init;

import android.app.Application;

import com.maple.baselibrary.base.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

public class MainModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("主业务模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("主业务模块初始化 -- onInitLow");
        return false;
    }
}
