package com.example.baibaka.salers.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.baibaka.salers.R;
import com.example.baibaka.salers.domain.Address;

/**
 * Created by baibak.a on 06.10.2017.
 */

public class AddressAdapter extends ArrayAdapter<Address> {

    private Context mContext;
    int mLayoutResourceId;
    Address mData[] = null;

    public AddressAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Address[] objects) {
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

        ImageView imageView =(ImageView)row.findViewById(R.id.imageview_icon);

        Address address = mData[position];

        addrName.setText(address.getAddrName());
        addrInfo.setText(address.getAddrInfo());

        int resId = mContext.getResources().getIdentifier("ic_create_black_24dp","drawable",mContext.getPackageName());
        imageView.setImageResource(resId);

        return row;
    }
}
