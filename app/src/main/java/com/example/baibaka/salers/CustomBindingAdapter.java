package com.example.baibaka.salers;

import android.databinding.BindingAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by baibak.a on 06.11.2017.
 */

public class CustomBindingAdapter {

    @BindingAdapter({"bind:image_url"})
    public static void loadImage(ImageView imageView, String url)
    {
            Picasso.with(imageView.getContext()).load(url).resize(100, 100).into(imageView);

    }
    @BindingAdapter("imgSrc")
    public static void setImgSrc(ImageButton view, int resId){
        view.setImageResource(resId);
    }
}
