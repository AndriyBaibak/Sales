package com.example.baibaka.salers;

import android.support.v7.widget.RecyclerView;

import com.example.baibaka.salers.databinding.AddressDataBinding;
import com.example.baibaka.salers.viewmodel.AddressViewModel;

/**
 * Created by baibak.a on 30.10.2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

private AddressDataBinding mDataBinding;

    public ViewHolder(AddressDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.mDataBinding = dataBinding;
    }

    public void bind(AddressViewModel model){
        this.mDataBinding.setViewModel(model);
    }

    public  AddressDataBinding getDataBinding(){
        return  mDataBinding;
    }

}
