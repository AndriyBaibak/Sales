package com.example.baibaka.salers.http;

import com.example.baibaka.salers.domain.Address;
import com.example.baibaka.salers.viewmodel.AddressViewModel;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

/**
 * Created by baibak.a on 19.10.2017.
 */

public class MockHttp implements IHttp {

    @Override
    public void getAddresses(Http.Callback<List<AddressViewModel>> callback) {


        Gson gson = new Gson();
        AddressViewModel[] a = gson.fromJson(jsonAddresses, AddressViewModel[].class);
        callback.onData(Arrays.asList(a));
    }

    @Override
    public void getAddressCategories(Address address, Http.Callback<List<AddressViewModel>> callback) {

    }

    private String jsonAddresses = "  [{\"id\":1,\"addrName\":\"Магазин 1\",\"addrInfo\":\"Краснова 36\" },\n" +
                    "    { \"id\":2,\"addrName\":\"Магазин 2\",\"addrInfo\":\"Краснова 26\"},\n" +
                    "    {\"id\":3,\"addrName\":\"Магазин 2\",\"addrInfo\":\"Краснова 16\"}]";
}
