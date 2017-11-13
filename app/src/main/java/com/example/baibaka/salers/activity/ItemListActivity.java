package com.example.baibaka.salers.activity;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.example.baibaka.salers.R;
import com.example.baibaka.salers.http.IHttp;
import com.example.baibaka.salers.http.MockHttp;
import com.example.baibaka.salers.viewmodel.ProductViewModel;


import java.util.List;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by baibak.a on 06.11.2017.
 */

public class ItemListActivity extends FragmentActivity {

    static final String TAG = "myLogs";
    static final int PAGE_COUNT = 10;




    Map<String, List<ProductViewModel>> products;
    ViewPager pager;
    PagerAdapter pagerAdapter;

    private IHttp http = new MockHttp();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_page);


        http.getCategoryProducts(getIntent().getExtras().getInt("categoryID", 0),
                new IHttp.Callback<Map<String,List<ProductViewModel>>>() {
            @Override
            public void onData(Map<String,List<ProductViewModel>> str) {
                    products = str;
            }
        });

        pager = (ViewPager) findViewById(R.id.pager);

        pagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),products);

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

        private Map<String,List<ProductViewModel>> products;

        public MyFragmentPagerAdapter(FragmentManager fm,Map<String,List<ProductViewModel>> products) {

            super(fm);
            this.products = products;
        }

        @Override
        public Fragment getItem(int position) {
            return ItemPageFragment.newInstance(position, products.get(position));
        }

        @Override
        public int getCount() {
            return products.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return "Title " + position;
        }
    }

}