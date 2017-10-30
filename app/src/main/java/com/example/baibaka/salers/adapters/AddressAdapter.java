/*
package com.example.baibaka.salers.adapters;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.baibaka.salers.R;
import com.example.baibaka.salers.activity.CategoryActivity;
import com.example.baibaka.salers.databinding.ActivityAddressListViewBinding;
import com.example.baibaka.salers.domain.Address;

import java.util.List;

*/
/**
 * Created by baibak.a on 06.10.2017.
 *//*


public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.BindingHolder> {


    private List<Address> addresses;
    private Context mContext;

    public AddressAdapter(List<Address> addresses, Context mContext) {
        this.addresses = addresses;
        this.mContext = mContext;
    }


    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ActivityAddressListViewBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.activity_address_list_view, parent, false);

        return new BindingHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        ActivityAddressListViewBinding binding = holder.binding;
        binding.setAvm(new AddressVievModel(addresses.get(position), mContext));
    }

    @Override
    public int getItemCount() {
        return mArticles.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ActivityAddressListViewBinding binding;

        public BindingHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);
        }
    }

    */
/*
    private Context mContext;
    int mLayoutResourceId;
    List<Address> mData = null;

    public AddressAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Address> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mLayoutResourceId = resource;
        this.mData = objects;
    }

    @Nullable
    @Override
    public Address getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        row = inflater.inflate(mLayoutResourceId,parent,false);

        TextView addrName = (TextView)row.findViewById(R.id.addrName);
        TextView addrInfo = (TextView)row.findViewById(R.id.addrInfo);

        final Address address = mData.get(position);

        addrName.setText(address.getAddrName());
        addrInfo.setText(address.getAddrInfo());

        ImageButton imageButton =(ImageButton) row.findViewById(R.id.imageview_icon);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("AddressID", address.getId());

                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("Address", bundle);

                mContext.startActivity(intent);
            }
        });

        int resId = mContext.getResources().getIdentifier("ic_create_black_24dp","drawable",mContext.getPackageName());
        imageButton.setImageResource(resId);



        return row;
    }

    @Override
    public AddressAdapter.BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AddressAdapter.BindingHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }*//*



}
*/
