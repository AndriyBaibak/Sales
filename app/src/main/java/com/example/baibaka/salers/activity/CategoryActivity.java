package com.example.baibaka.salers.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.baibaka.salers.R;
import com.example.baibaka.salers.RecyclerAddressViewAdapter;
import com.example.baibaka.salers.RecyclerCategoryViewAdapter;
import com.example.baibaka.salers.domain.Address;
import com.example.baibaka.salers.http.Http;
import com.example.baibaka.salers.http.IHttp;
import com.example.baibaka.salers.viewmodel.AddressViewModel;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by baibak.a on 08.10.2017.
 */

public class CategoryActivity  extends AppCompatActivity{

    private RecyclerView recyclerView;

    @Inject
    public IHttp http;

    List<CategoryViewModel> list = Collections.EMPTY_LIST;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        CustomApp app = (CustomApp) getApplicationContext();
        app.getNetComponent().inject(this);

        http.getAddressCategories(getIntent().getExtras().getInt("addrID",0) , new Http.Callback() {
            @Override
            public void onData(Object str) {
                list = (List<CategoryViewModel>) str;
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.category_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(new RecyclerCategoryViewAdapter(this,list));

    }
}
