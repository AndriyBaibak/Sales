package com.example.baibaka.salers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.baibaka.salers.databinding.AddressDataBinding;
import com.example.baibaka.salers.viewmodel.AddressViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baibak.a on 30.10.2017.
 */

public class RecyclerAddressViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context mContext;
    private List<AddressViewModel> mList;
    private LayoutInflater inflater;


    public RecyclerAddressViewAdapter(Context mContext, List<AddressViewModel> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      if(inflater == null){
          inflater = LayoutInflater.from(parent.getContext());
      }
        AddressDataBinding dataBinding = AddressDataBinding.inflate(inflater,parent,false);
        return new ViewHolder(dataBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            AddressViewModel model = mList.get(position);
            holder.bind(model);

        final AddressDataBinding dataBinding = holder.getDataBinding();
        dataBinding.setHandler(new ImgClickHandler() {
            @Override
            public void onImgClick() {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
