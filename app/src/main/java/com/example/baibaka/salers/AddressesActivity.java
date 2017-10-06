package com.example.baibaka.salers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.baibaka.salers.adapters.AddressAdapter;
import com.example.baibaka.salers.domain.Address;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressesActivity extends AppCompatActivity {

    Address[] addresses = {
            new Address("Магазин 1", "Краснова 27"),
            new Address("Магазин 2", "Краснова 27"),
            new Address("Магазин 3", "Краснова 27")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);

        ListView addrView = (ListView) findViewById(R.id.addresses);

        AddressAdapter adapter = new AddressAdapter(this,R.layout.address_list_view, addresses);

        addrView.setAdapter(adapter);


    }
}
