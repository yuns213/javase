package com.day10.Test03;

import java.util.ArrayList;

public class Receptionist {

    private Fiter fiter;

    public Receptionist() {
    }

    public Receptionist(Fiter fiter) {
        this.fiter = fiter;
    }


    public Fiter getFiter() {
        return fiter;
    }

    public void setFiter(Fiter fiter) {
        this.fiter = fiter;
    }


    public void filterUser(User u) {

//        if (u.getUserType() != null) {
//        }
        //这行判断每条数据是否有空值,如果没有,则记录到filterUser的User类中
        if (fiter != null) {
            fiter.filterUser(u);
        } else {
            //如果是空.则把空值内容改成A
            u.setUserType("A");
        }
    }
}


