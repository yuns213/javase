package com.day10.Test03;



public class User {

    private int Id;
    private String userType;


    public User() {
    }

    public User( int id) {

        Id = id;
    }


    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
//
//    @Override
//    public String toString() {
//        return Id +"-"+userType;
//    }
}
