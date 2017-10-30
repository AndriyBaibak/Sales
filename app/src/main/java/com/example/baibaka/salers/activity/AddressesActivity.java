package com.example.baibaka.salers.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.baibaka.salers.RecyclerViewAdapter;
import com.example.baibaka.salers.http.Http;
import com.example.baibaka.salers.http.IHttp;
import com.example.baibaka.salers.R;
import com.example.baibaka.salers.domain.Address;
import com.example.baibaka.salers.viewmodel.AddressViewModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

public class AddressesActivity extends BaseActivity {

 /*   Address[] addresses = {
            new Address(1, "Магазин 1", "Краснова 27"),
            new Address(2, "Магазин 2", "Краснова 27"),
            new Address(3, "Магазин 3", "Краснова 27")
    };*/

    private RecyclerView recyclerView;

    @Inject
    public IHttp http;


    List<AddressViewModel> list = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);


        CustomApp app = (CustomApp) getApplicationContext();
        app.getNetComponent().inject(this);



        Http.Callback callback = new Http.Callback() {
            @Override
            public void onData(Object str) {
                list = (List<AddressViewModel>) str;
            }
        };

        http.getAddresses(callback);

        recyclerView = (RecyclerView) findViewById(R.id.addresses_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(new RecyclerViewAdapter(this,list));
    }



}
