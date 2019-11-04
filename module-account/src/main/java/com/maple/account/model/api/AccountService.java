package com.maple.account.model.api;

import com.maple.account.model.entity.UserInfoEntity;
import com.maple.baselibrary.http.BaseResponse;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AccountService {
    @FormUrlEncoded
    @POST("user/login")
    Observable<BaseResponse<UserInfoEntity>> login(@Field("username") String username, @Field("password") String password);
}
