package com.example.baibaka.salers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.example.baibaka.salers.databinding.CategoryDataBinding;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;

import java.util.List;

/**
 * Created by baibak.a on 31.10.2017.
 */

public class RecyclerCategoryViewAdapter extends RecyclerView.Adapter<CategoryViewHolder> {
    private Context mContext;
    private List<CategoryViewModel> mList;
    private LayoutInflater inflater;


    public RecyclerCategoryViewAdapter(Context mContext, List<CategoryViewModel> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(inflater == null){
            inflater = LayoutInflater.from(parent.getContext());
        }
        CategoryDataBinding dataBinding = CategoryDataBinding.inflate(inflater,parent,false);
        return new CategoryViewHolder(dataBinding);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        CategoryViewModel model = mList.get(position);
        holder.bind(model);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
