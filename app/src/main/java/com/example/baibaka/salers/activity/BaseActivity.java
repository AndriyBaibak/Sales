package com.example.baibaka.salers.activity;

import android.support.v7.app.AppCompatActivity;

import com.example.baibaka.salers.http.Http;
import com.example.baibaka.salers.http.IHttp;
import com.example.baibaka.salers.http.MockHttp;

/**
 * Created by baibak.a on 19.10.2017.
 */

public class BaseActivity extends AppCompatActivity {

    protected IHttp getHttp() {
        return new Http();
    }

}
