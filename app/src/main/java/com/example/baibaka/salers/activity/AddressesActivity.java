package com.example.baibaka.salers.activity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.baibaka.salers.CustomApp;
import com.example.baibaka.salers.http.IHttp;
import com.example.baibaka.salers.R;
import com.example.baibaka.salers.adapters.AddressAdapter;
import com.example.baibaka.salers.domain.Address;

import javax.inject.Inject;

public class AddressesActivity extends BaseActivity {

    Address[] addresses = {
            new Address(1, "Магазин 1", "Краснова 27"),
            new Address(2, "Магазин 2", "Краснова 27"),
            new Address(3, "Магазин 3", "Краснова 27")
    };


    @Inject
    public IHttp http;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);


        CustomApp app = (CustomApp) getApplicationContext();
        app.getNetComponent().inject(this);



        ListView addrView = (ListView) findViewById(R.id.addresses);

        AddressAdapter adapter = new AddressAdapter(this,R.layout.address_list_view, addresses);

        addrView.setAdapter(adapter);


    }
}
