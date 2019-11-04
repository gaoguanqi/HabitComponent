package com.maple.account.model.data.source.local;

import me.goldze.mvvmhabit.utils.SPUtils;

public class LoginLocalDataSourceImpl implements LoginLocalDataSource {

    private volatile static LoginLocalDataSourceImpl INSTANCE = null;

    public static LoginLocalDataSourceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (LoginLocalDataSourceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LoginLocalDataSourceImpl();
                }
            }
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    private LoginLocalDataSourceImpl() {
        //数据库Helper构建
    }

    @Override
    public void setUserName(String userName) {
        SPUtils.getInstance().put("UserName", userName);
    }

    @Override
    public void setPassword(String password) {
        SPUtils.getInstance().put("password", password);
    }

    @Override
    public String getUserName() {
        return SPUtils.getInstance().getString("UserName");
    }

    @Override
    public String getPassword() {
        return SPUtils.getInstance().getString("password");
    }
}
