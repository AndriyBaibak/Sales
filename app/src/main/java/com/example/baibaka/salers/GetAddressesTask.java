package com.example.baibaka.salers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.AsyncTask;
import android.view.View;

import com.example.baibaka.salers.http.IHttp;
import com.example.baibaka.salers.viewmodel.AddressViewModel;
import com.pnikosis.materialishprogress.ProgressWheel;

import java.util.Collections;
import java.util.List;

/**
 * Created by baibak.a on 08.11.2017.
 */

public class GetAddressesTask extends AsyncTask<IHttp,Void,List<AddressViewModel>> {

    public List<AddressViewModel> addresses = Collections.EMPTY_LIST;
    private ProgressWheel wheel;

    @Override
    protected List<AddressViewModel> doInBackground(IHttp ... voids) {
        IHttp http = voids[0];
        http.getAddresses(new IHttp.Callback<List<AddressViewModel>>() {
           @Override
           public void onData(List<AddressViewModel> str) {
               setAddresses(str);
           }
       });
       return addresses;
    }

    public AsyncResponse delegate = null;

    public GetAddressesTask(AsyncResponse delegate, ProgressWheel wheel){
        this.delegate = delegate;
        this.wheel = wheel;
    }

    public void onPostExecute(List<AddressViewModel> list){
        wheel.setVisibility(View.GONE);
        delegate.processFinish(list);
    }

    public void setAddresses(List<AddressViewModel> addresses) {
        this.addresses = addresses;
    }

    public interface AsyncResponse {
        void processFinish(List<AddressViewModel> addresses);
    }

}
