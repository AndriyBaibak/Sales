package com.example.baibaka.salers;

import android.app.Application;

import com.example.baibaka.salers.di.NetComponent;


public class CustomApp extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent
                .builder()
                .build();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
