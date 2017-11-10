package com.example.baibaka.salers.http;


import com.example.baibaka.salers.domain.Address;
import com.example.baibaka.salers.viewmodel.AddressViewModel;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;
import com.example.baibaka.salers.viewmodel.ProductViewModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public void getCategoryProducts(Integer categoryID, Callback<Map<Integer,List<ProductViewModel>>> callback) {

    }

}
