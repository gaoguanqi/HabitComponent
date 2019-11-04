package com.maple.account.model.data.source.http;

import com.maple.account.model.entity.UserInfoEntity;
import com.maple.baselibrary.http.BaseResponse;

import io.reactivex.Observable;

public interface LoginHttpDataSource {
    //模拟登录
    Observable<BaseResponse<UserInfoEntity>> login(String userName, String password);
}
