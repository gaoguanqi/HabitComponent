package com.maple.account.app.global;

import com.maple.account.model.api.AccountService;
import com.maple.account.model.data.repository.LoginRepository;
import com.maple.account.model.data.source.http.LoginHttpDataSource;
import com.maple.account.model.data.source.http.LoginHttpDataSourceImpl;
import com.maple.account.model.data.source.local.LoginLocalDataSource;
import com.maple.account.model.data.source.local.LoginLocalDataSourceImpl;
import com.maple.baselibrary.http.RetrofitClient;


/**
 * 注入全局的数据仓库，可以考虑使用Dagger2。（根据项目实际情况搭建，千万不要为了架构而架构）
 * Created by goldze on 2019/3/26.
 */
public class Injection {
    public static LoginRepository provideLoginRepository() {
        //网络API服务
        AccountService apiService = RetrofitClient.getInstance().create(AccountService.class);
        //网络数据源
        LoginHttpDataSource httpDataSource = LoginHttpDataSourceImpl.getInstance(apiService);
        //本地数据源
        LoginLocalDataSource localDataSource = LoginLocalDataSourceImpl.getInstance();
        //两条分支组成一个数据仓库
        return LoginRepository.getInstance(httpDataSource, localDataSource);
    }
}
