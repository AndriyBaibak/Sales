package com.example.baibaka.salers.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by baibak.a on 10.11.2017.
 */

public class ProductViewModel extends BaseObservable {

    public Integer id;
    public String name;
    public String productInfo;
    public Double price;
    public String imgUrl;

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public String getProductInfo() {
        return productInfo;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Bindable
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Bindable
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
