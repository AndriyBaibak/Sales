package com.example.baibaka.salers.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.baibaka.salers.R;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;
import com.example.baibaka.salers.viewmodel.ProductViewModel;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by baibak.a on 06.11.2017.
 */

public class ItemPageFragment extends Fragment {

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";

    private List<ProductViewModel> list;

 /*   int pageNumber;
    int backColor;*/

    static ItemPageFragment newInstance(int position, List<ProductViewModel> list) {
        ItemPageFragment pageFragment = new ItemPageFragment();
        Bundle arguments = new Bundle();
        arguments.putString("list",new Gson().toJson(list));
        pageFragment.setArguments(arguments);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list = getArguments().getString(ARGUMENT_PAGE_NUMBER);

     /*   Random rnd = new Random();
        backColor = Color.argb(40, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.item_product_list, null);
        TextView itemName = view.findViewById(R.id.item_name);
        TextView productInfo = view.findViewById(R.id.item_short_desc);
        TextView productPrice = view.findViewById(R.id.item_price);

        itemName.setText(list.get(0).getName());
        productInfo.setText(list.get(0).getProductInfo());
        productPrice.setText(list.get(0).getPrice().toString());

      /*  View view = inflater.inflate(R.layout.item_fragment, null);

        TextView tvPage = (TextView) view.findViewById(R.id.tvPage);
        tvPage.setText("Product " + pageNumber);
        tvPage.setBackgroundColor(backColor);*/

        return view;
    }

    public void setProducts(HashMap<Integer, List<ProductViewModel>> products) {
        this.products = products;
    }
}