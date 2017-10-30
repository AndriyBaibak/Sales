package com.example.baibaka.salers.domain;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by baibak.a on 06.10.2017.
 */

public class Address  {

    @SerializedName("id")
    private Integer id;
    @SerializedName("addrName")
    private String addrName;
    @SerializedName("addrInfo")
    private String addrInfo;


    public Address(Integer id, String addrName, String addrInfo) {
        this.id = id;
        this.addrName = addrName;
        this.addrInfo = addrInfo;
    }

    public String getAddrName() {
        return addrName;
    }

    public void setAddrName(String addrName) {
        this.addrName = addrName;
    }

    public String getAddrInfo() {
        return addrInfo;
    }

    public void setAddrInfo(String addrInfo) {
        this.addrInfo = addrInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
