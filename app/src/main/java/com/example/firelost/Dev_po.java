package com.example.firelost;

public class Dev_po {
    String imei1,imei2,phone;

    public Dev_po( String imei1, String imei2, String phone) {

        this.imei1 = imei1;
        this.imei2 = imei2;
        this.phone = phone;
    }


    public String getImei1() {
        return imei1;
    }

    public void setImei1(String imei1) {
        this.imei1 = imei1;
    }

    public String getImei2() {
        return imei2;
    }

    public void setImei2(String imei2) {
        this.imei2 = imei2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
