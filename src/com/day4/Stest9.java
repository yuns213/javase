package com.day4;

public class Stest9 {

    public static void main(String[] args) {

        String[]  huas  = {"黑桃","红桃","梅花","方块"};
        String[]  ds  = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[]  puk = new String[13];

        for (int i = 0; i < huas.length; i++) {
            for (int j = 0; j <ds.length ; j++) {
                puk[j] = huas[i]+ds[j];
                System.out.print(puk[j]+" ");
            }
            System.out.println("");
        }
    }
}
