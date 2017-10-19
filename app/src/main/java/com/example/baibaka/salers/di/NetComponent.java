package com.example.baibaka.salers.di;

import com.example.baibaka.salers.activity.AddressesActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={NetModule.class})
public interface NetComponent {
   void inject(AddressesActivity activity);
}