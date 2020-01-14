package com.day11.Test9;

public class Goods {
    private String id;
    private String GoodsName;
    private double price;
    private String type;

    public Goods() {
    }

    public Goods(String id, String goodsName, double price, String type) {
        this.id = id;
        GoodsName = goodsName;
        this.price = price;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
