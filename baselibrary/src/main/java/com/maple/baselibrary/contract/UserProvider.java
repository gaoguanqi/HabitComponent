package com.maple.baselibrary.contract;

/**
 * 登录完成后，组件间通信的契约类
 * Created by goldze on 2018/6/21.
 */

public class UserProvider {
    private Object user;

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }
}
