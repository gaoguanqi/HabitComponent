package com.maple.baselibrary.router;

/**
 * 用于组件开发中，ARouter单Activity跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 * Created by goldze on 2018/6/21
 */

public class RouterActivityPath {
    /**
     * 主业务组件
     */
    public static class Main {
        private static final String MAIN = "/main";
        /*主业务界面*/
        public static final String PAGER_SPLASH = MAIN +"/Splash";
    }



    /**
     * 用户组件
     */
    public static class Account {
        private static final String ACCOUNT = "/account";
        /*用户登陆*/
        public static final String PAGER_LOGIN = ACCOUNT + "/Login";
    }
}
