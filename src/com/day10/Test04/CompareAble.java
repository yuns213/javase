package com.day10.Test04;

import java.util.ArrayList;

interface CompareAble {

    public default Apple compare(Apple a1,Apple a2){
//        ArrayList<Apple> apples = new ArrayList<>();

        if (a1.getSize()>a2.getSize()) {
            return a1;
        }else {
            return  a2;
        }






        }
    }

