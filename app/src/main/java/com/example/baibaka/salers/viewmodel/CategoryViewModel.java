package com.example.baibaka.salers.viewmodel;


import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.graphics.drawable.Drawable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by baibak.a on 31.10.2017.
 */

public class CategoryViewModel extends BaseObservable {

    public Integer id;
    public String name;
    public String imageUrl;
    public Integer itemCount;


    @Bindable
    public Integer getId() {
        return id;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
        public String getImageUrl() {
            return imageUrl;
        }
    @Bindable
    public String getItemCount() {
        return itemCount.toString();
    }

    @Bindable
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        notifyPropertyChanged(BR.imageUrl);
    }
}
