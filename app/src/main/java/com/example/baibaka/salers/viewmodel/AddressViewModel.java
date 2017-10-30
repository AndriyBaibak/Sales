package com.example.baibaka.salers.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ObservableInt;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.databinding.Bindable;

import com.example.baibaka.salers.R;
import com.example.baibaka.salers.domain.Address;
import com.example.baibaka.salers.http.Http;
import com.example.baibaka.salers.http.IHttp;

import java.util.List;

/**
 * Created by baibak.a on 23.10.2017.
 */

public class AddressViewModel extends BaseObservable {

    public Integer id;
    public String addrInfo, addrName;
    public ObservableInt imgScrId = null;

    public AddressViewModel(String addrInfo, String addrName) {
        this.addrInfo = addrInfo;
        this.addrName = addrName;
       // http.getAddresses(callback);
        Log.i("AddressViewModel", "Use non-empty constructor");
    }
    public AddressViewModel(){
        this.imgScrId = new ObservableInt(R.drawable.ic_create_black_24dp);
        Log.i("AddressViewModel", "Use empty constructor");
    }

    @Bindable
    public String getAddrName() {
        return addrName;
    }

    @Bindable
    public String getAddrInfo() {
        return addrInfo;
    }

}
