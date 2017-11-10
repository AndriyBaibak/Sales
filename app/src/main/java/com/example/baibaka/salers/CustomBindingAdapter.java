package com.example.baibaka.salers;

import android.databinding.BindingAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by baibak.a on 06.11.2017.
 */

public class CustomBindingAdapter {

    @BindingAdapter({"loadImage"})
    public static void loadImage(ImageView imageView, String url)
    {
            Picasso.with(imageView.getContext()).load(url).into(imageView);

    }
    @BindingAdapter("imgSrc")
    public static void setImgSrc(ImageButton view, int resId){view.setImageResource(resId);
    }
}
