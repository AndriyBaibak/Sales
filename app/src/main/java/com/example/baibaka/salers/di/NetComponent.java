package com.example.baibaka.salers.di;

import com.example.baibaka.salers.activity.AddressesActivity;
import com.example.baibaka.salers.activity.CategoryActivity;
import com.example.baibaka.salers.activity.ItemListActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={NetModule.class})
public interface NetComponent {
   void inject(AddressesActivity activity);
   void inject(CategoryActivity activity);
   void inject(ItemListActivity activity);
}