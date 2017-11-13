package com.example.baibaka.salers.di;

import com.example.baibaka.salers.activity.AddressesActivity;
import com.example.baibaka.salers.activity.CategoryActivity;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={NetModule.class})
public interface NetComponent {
   void inject(AddressesActivity activity);
   void inject(CategoryActivity activity);
}