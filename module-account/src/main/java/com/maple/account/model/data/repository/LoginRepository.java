package com.maple.account.model.data.repository;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;


import com.maple.account.model.data.source.http.LoginHttpDataSource;
import com.maple.account.model.data.source.local.LoginLocalDataSource;
import com.maple.account.model.entity.UserInfoEntity;
import com.maple.baselibrary.http.BaseResponse;

import io.reactivex.Observable;
import me.goldze.mvvmhabit.base.BaseModel;

public class LoginRepository extends BaseModel implements LoginHttpDataSource, LoginLocalDataSource {

    private volatile static LoginRepository INSTANCE = null;
    private final LoginHttpDataSource mHttpDataSource;

    private final LoginLocalDataSource mLocalDataSource;

    private LoginRepository(@NonNull LoginHttpDataSource httpDataSource,
                            @NonNull LoginLocalDataSource localDataSource) {
        this.mHttpDataSource = httpDataSource;
        this.mLocalDataSource = localDataSource;
    }

    public static LoginRepository getInstance(LoginHttpDataSource httpDataSource,
                                              LoginLocalDataSource localDataSource) {
        if (INSTANCE == null) {
            synchronized (LoginRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LoginRepository(httpDataSource, localDataSource);
                }
            }
        }
        return INSTANCE;
    }

    @VisibleForTesting
    public static void destroyInstance() {
        INSTANCE = null;
    }

    @Override
    public Observable<BaseResponse<UserInfoEntity>> login(String userName, String password) {
        return mHttpDataSource.login(userName,password);
    }

    @Override
    public void setUserName(String userName) {
        mLocalDataSource.setUserName(userName);
    }

    @Override
    public void setPassword(String password) {
        mLocalDataSource.setPassword(password);
    }

    @Override
    public String getUserName() {
        return mLocalDataSource.getUserName();
    }

    @Override
    public String getPassword() {
        return mLocalDataSource.getPassword();
    }


}
