package com.example.baibaka.salers.http;

import com.example.baibaka.salers.domain.Address;
import com.example.baibaka.salers.viewmodel.AddressViewModel;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;
import com.example.baibaka.salers.viewmodel.ProductViewModel;

import java.util.List;

/**
 * Created by baibak.a on 16.10.2017.
 */

public interface IHttp {

    void getAddresses(Callback<List<AddressViewModel>> callback);

    void getAddressCategories(Integer addrID, Callback<List<CategoryViewModel>> callback);

    void getCategoryProducts(Integer categoryID,Callback<List<ProductViewModel>> callback );


    interface Callback<T> {
        void onData(T str);
    }
}
