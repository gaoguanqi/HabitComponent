package com.maple.account.model.data.source.local;

public interface LoginLocalDataSource {
    /**
     * 保存用户名
     */
    void setUserName(String userName);

    /**
     * 保存用户密码
     */

    void setPassword(String password);

    /**
     * 获取用户名
     */
    String getUserName();

    /**
     * 获取用户密码
     */
    String getPassword();
}
