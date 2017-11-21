package com.example.baibaka.salers.di;


import com.example.baibaka.salers.http.IHttp;
import com.example.baibaka.salers.http.MockHttp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetModule {

    @Singleton
    @Provides
    public IHttp getHttp(){
        return new MockHttp();
    }
}
