package com.example.baibaka.salers.domain;

/**
 * Created by baibak.a on 06.10.2017.
 */

public class Address {

    private String addrName;
    private String addrInfo;


    public Address(String addrName, String addrInfo) {
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
}
