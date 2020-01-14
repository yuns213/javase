package com.day5;

public class Book {
    private String bookb;
    private String shuhao;
    private String isbn;
    private double price;
    private String Date;

    public Book(String bookb, String shuhao, String isbn, double price, String
            Date) {
        this.bookb = bookb;
        this.shuhao = shuhao;
        this.isbn = isbn;
        this.price = price;
        this.Date = Date;
    }


    public Book() {
    }



    public String getbookb() {
        return bookb;
    }

    public void setbookb(String bookb) {
        this.bookb = bookb;
    }

    public String getshuhao() {
        return shuhao;
    }

    public void setshuhao(String shuhao) {
        this.shuhao = shuhao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
}