package com.sample.model;

public class user {
private int code;
private String name;
private String stock;
private String supplier;

public user(){

}

    public user(int code, String name, String stock, String supplier) {
        this.code = code;
        this.name = name;
        this.stock = stock;
        this.supplier = supplier;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

}
