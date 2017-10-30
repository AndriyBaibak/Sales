package com.example.baibaka.salers.activity;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.baibaka.salers.RecyclerAddressViewAdapter;
import com.example.baibaka.salers.http.Http;
import com.example.baibaka.salers.http.IHttp;
import com.example.baibaka.salers.R;
import com.example.baibaka.salers.viewmodel.AddressViewModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

public class AddressesActivity extends BaseActivity {

    private RecyclerView recyclerView;

    @Inject
    public IHttp http;

    List<AddressViewModel> list = Collections.EMPTY_LIST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);

        CustomApp app = (CustomApp) getApplicationContext();
        app.getNetComponent().inject(this);

        http.getAddresses(new Http.Callback() {
            @Override
            public void onData(Object str) {
                list = (List<AddressViewModel>) str;
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.addresses_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(new RecyclerAddressViewAdapter(this,list));
    }



}
