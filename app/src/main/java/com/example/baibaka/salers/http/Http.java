package com.example.baibaka.salers.http;


import com.example.baibaka.salers.domain.Address;

import java.util.List;

/**
 * Created by baibak.a on 16.10.2017.
 */

public class Http implements IHttp {


    @Override
    public void getAddresses(Callback<List<Address>> callback) {

    }

    public interface Callback<T> {
        void onData(T str);
    }
}
