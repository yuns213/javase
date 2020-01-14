package com.day5;

public class Card {

    private String huas = "红桃";
    private String  dianshu = "4";

    public Card() {

    }

    public Card(String huas, String dianshu) {
        this.huas = huas;
        this.dianshu = dianshu;
    }

    public String getHuas() {
        return huas;
    }

    public void setHuas(String huas) {
        this.huas = huas;
    }

    public String getDianshu() {
        return dianshu;
    }

    public void setDianshu(String dianshu) {
        this.dianshu = dianshu;
    }

    public  void showCard(){
        System.out.println(huas+dianshu);
    }
}
