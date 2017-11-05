package com.example.baibaka.salers;

import android.support.v7.widget.RecyclerView;
import android.widget.GridView;

import com.example.baibaka.salers.databinding.CategoryDataBinding;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;


/**
 * Created by baibak.a on 31.10.2017.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    private CategoryDataBinding mCategoryDataBinding;


    public CategoryViewHolder(CategoryDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.mCategoryDataBinding = dataBinding;
    }

    public void bind(CategoryViewModel model){
        this.mCategoryDataBinding.setCategory(model);
    }

    public CategoryDataBinding getDataBinding(){
        return mCategoryDataBinding;
    }

}
