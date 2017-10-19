package com.example.baibaka.salers.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by baibak.a on 06.10.2017.
 */

public class Address {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("addrName")
    @Expose
    private String addrName;
    @SerializedName("addrInfo")
    @Expose
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
