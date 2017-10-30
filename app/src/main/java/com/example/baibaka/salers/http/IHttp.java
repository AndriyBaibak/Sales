package com.example.baibaka.salers.http;

import com.example.baibaka.salers.domain.Address;
import com.example.baibaka.salers.viewmodel.AddressViewModel;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;

import java.util.List;

/**
 * Created by baibak.a on 16.10.2017.
 */

public interface IHttp {

    void getAddresses(Http.Callback<List<AddressViewModel>> callback);

    void getAddressCategories(Address address, Http.Callback<List<CategoryViewModel>> callback);

}
