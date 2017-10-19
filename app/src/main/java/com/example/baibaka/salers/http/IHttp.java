package com.example.baibaka.salers.http;

import com.example.baibaka.salers.domain.Address;

import java.util.List;

/**
 * Created by baibak.a on 16.10.2017.
 */

public interface IHttp {

    void getAddresses(Http.Callback<List<Address>> callback);

}
