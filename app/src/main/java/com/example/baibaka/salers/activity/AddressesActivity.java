package com.example.baibaka.salers.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.example.baibaka.salers.GetAddressesTask;
import com.example.baibaka.salers.RecyclerAddressViewAdapter;
import com.example.baibaka.salers.http.Http;
import com.example.baibaka.salers.http.IHttp;
import com.example.baibaka.salers.R;
import com.example.baibaka.salers.viewmodel.AddressViewModel;
import com.pnikosis.materialishprogress.ProgressWheel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

public class AddressesActivity extends AppCompatActivity {

    @Inject
    public IHttp http;

    private RecyclerView recyclerView;

    List<AddressViewModel> list = Collections.EMPTY_LIST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);

        CustomApp app = (CustomApp) getApplicationContext();
        app.getNetComponent().inject(this);

        recyclerView = (RecyclerView) findViewById(R.id.addresses_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        final RecyclerAddressViewAdapter adapter = new RecyclerAddressViewAdapter(this,list);
        recyclerView.setAdapter(adapter);

        try {
            new GetAddressesTask(new GetAddressesTask.AsyncResponse() {
                @Override
                public void processFinish(List<AddressViewModel> addresses) {
                    adapter.setmList(addresses);
                    adapter.notifyDataSetChanged();
                }
            },(ProgressWheel) findViewById(R.id.progress_wheel))
                    .execute(http);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
