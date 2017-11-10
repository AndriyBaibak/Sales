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
import com.example.baibaka.salers.viewmodel.ProductViewModel;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by baibak.a on 06.11.2017.
 */

public class ItemListActivity extends FragmentActivity {

    static final String TAG = "myLogs";
    static final int PAGE_COUNT = 10;

    ViewPager pager;
    PagerAdapter pagerAdapter;


    @Inject
    public IHttp http;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_page);

        http.getCategoryProducts(getIntent().getExtras().getInt("categoryID", 0), new IHttp.Callback<List<ProductViewModel>>() {
            @Override
            public void onData(List<ProductViewModel> str) {

            }
        });

        pager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
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

        private HashMap<Integer,List<ProductViewModel>> products;

        public MyFragmentPagerAdapter(FragmentManager fm,HashMap<Integer,List<ProductViewModel>> products) {
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