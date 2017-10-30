package com.example.baibaka.salers.activity;

import android.app.Application;

import com.example.baibaka.salers.di.*;


public class CustomApp extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = com.example.baibaka.salers.di.DaggerNetComponent.builder().build();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
