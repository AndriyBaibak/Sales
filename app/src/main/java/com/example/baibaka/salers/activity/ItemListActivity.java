package com.example.baibaka.salers.activity;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

import android.os.Bundle;
import com.example.baibaka.salers.R;
import com.example.baibaka.salers.http.IHttp;
import com.example.baibaka.salers.http.MockHttp;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;
import com.example.baibaka.salers.viewmodel.ProductViewModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.nio.BufferUnderflowException;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.inject.Inject;

/**
 * Created by baibak.a on 06.11.2017.
 */

public class ItemListActivity extends FragmentActivity {

    static final String TAG = "myLogs";
    static final int PAGE_COUNT = 10;




    List<CategoryViewModel> categoryViewModelList;
    ViewPager pager;
    PagerAdapter pagerAdapter;
/*
    private IHttp http = new MockHttp();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_page);
Bundle c = getIntent().getExtras();
String s = c.getString("list");

        categoryViewModelList = new Gson().fromJson(s,new TypeToken<List<CategoryViewModel>>() {}.getType());


     /*   http.getCategoryProducts(                new IHttp.Callback<List<Map<String,List<ProductViewModel>>>>() {
            @Override
            public void onData(List<Map<String,List<ProductViewModel>>> str) {
                    products = str;
            }
        });*/

        pager = (ViewPager) findViewById(R.id.pager);

        pagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),categoryViewModelList);

        pager.setAdapter(pagerAdapter);

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                Log.d(TAG, "onPageSelected, position = " + position);
            }

            @Override
            public void onPageScrolled(int position, float positionOffset,
                                       int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    private class MyFragmentPagerAdapter extends FragmentPagerAdapter {

        private List<CategoryViewModel> categories;

        public MyFragmentPagerAdapter(FragmentManager fm, List<CategoryViewModel> categories) {
            super(fm);
            this.categories = categories;
        }

        @Override
        public Fragment getItem(int position) {
            CategoryViewModel categoryViewModel = categories.get(position);
            return ItemPageFragment.newInstance(position,categoryViewModel.getProducts() );
        }

        @Override
        public int getCount() {
            return categories.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return categories.get(position).getName();
        }
    }

}