package com.example.baibaka.salers;

import android.support.v7.widget.RecyclerView;

import com.example.baibaka.salers.databinding.AddressDataBinding;
import com.example.baibaka.salers.viewmodel.AddressViewModel;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;

/**
 * Created by baibak.a on 30.10.2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

private AddressDataBinding mAddressDataBinding;


    public ViewHolder(AddressDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.mAddressDataBinding = dataBinding;
    }

    public void bind(AddressViewModel model){
        this.mAddressDataBinding.setViewModel(model);
    }

    public AddressDataBinding getDataBinding(){
        return mAddressDataBinding;
    }
}

