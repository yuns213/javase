package com.day9.Test03;

public interface AA {

    public abstract void showA();

//    private void show10(String str) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(str);
//        }
//    }

    public default void showB10(){
//        show10();
    }
    public default void showC10(){
//        show10();
    }
}
