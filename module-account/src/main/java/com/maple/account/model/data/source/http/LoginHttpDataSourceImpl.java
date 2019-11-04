package com.maple.account.model.data.source.http;

import com.maple.account.model.api.AccountService;
import com.maple.account.model.entity.UserInfoEntity;
import com.maple.baselibrary.http.BaseResponse;


import io.reactivex.Observable;

public class LoginHttpDataSourceImpl implements LoginHttpDataSource {
    private AccountService apiService;
    private volatile static LoginHttpDataSourceImpl INSTANCE = null;

    public static LoginHttpDataSourceImpl getInstance(AccountService apiService) {
        if (INSTANCE == null) {
            synchronized (LoginHttpDataSourceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LoginHttpDataSourceImpl(apiService);
                }
            }
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    private LoginHttpDataSourceImpl(AccountService apiService) {
        this.apiService = apiService;
    }

    @Override
    public Observable<BaseResponse<UserInfoEntity>> login(String userName, String password) {
        return apiService.login(userName,password);
    }
}
