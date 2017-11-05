package com.example.baibaka.salers.http;


import com.example.baibaka.salers.domain.Address;
import com.example.baibaka.salers.viewmodel.AddressViewModel;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;

import java.util.List;

/**
 * Created by baibak.a on 16.10.2017.
 */

public class Http implements IHttp {


    @Override
    public void getAddresses(Callback<List<AddressViewModel>> callback) {

    }

    @Override
    public void getAddressCategories(Integer addrID, Callback<List<CategoryViewModel>> callback) {

    }

    public interface Callback<T> {
        void onData(T str);
    }
}
