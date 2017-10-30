package com.example.baibaka.salers.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.graphics.Color;
import android.view.View;
import android.databinding.Bindable;
import com.example.baibaka.salers.domain.Address;
import com.example.baibaka.salers.http.Http;
import com.example.baibaka.salers.http.IHttp;

import java.util.List;

/**
 * Created by baibak.a on 23.10.2017.
 */

public class AddressViewModel extends BaseObservable {

    public String addrInfo, addrName;

    public AddressViewModel(String addrInfo, String addrName) {
        this.addrInfo = addrInfo;
        this.addrName = addrName;
       // http.getAddresses(callback);
    }

    @Bindable
    public String getAddrName() {
        return addrName;
    }

    @Bindable
    public String getAddrInfo() {
        return addrInfo;
    }

    public void setAddress(String addrName, String addrInfo) {
        this.addrName = addrName;
        this.addrInfo = addrInfo ;
        //  notifyPropertyChanged(BR.text);
    }


    private Http.Callback callback = new Http.Callback<Address>() {
        @Override
        public void onData(Address str) {
            setAddress(str.getAddrName(), str.getAddrInfo());
        }

    };


}
