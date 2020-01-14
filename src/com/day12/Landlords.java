package com.day12;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Landlords {

    public static void main(String[] args) {
        //创建三个arraylist集合分别是   花色,点数,    底牌

        //花色集合
        List<String> Suit = new ArrayList();
        //点数集合
        List<String> Count = new ArrayList();
        //54张牌
        List<String> pai = new ArrayList();

        //创建三个玩家
        List<String> playList1 = new ArrayList();
        List<String> playList2 = new ArrayList();
        List<String> playList3 = new ArrayList();

        //三张底牌

        List<String> Cards = new ArrayList();


        //添加花色
        Suit.add("♥");
        Suit.add("♠");
        Suit.add("♦");
        Suit.add("♣");
        //添加点数
        for (int i = 2; i < 11; i++) {
            Count.add(i + "");
        }
        //添加除了2-10的点数AJQK
        Count.add("A");
        Count.add("J");
        Count.add("Q");
        Count.add("K");


        //通过双重for循环将52张牌加入到牌组中
        for (int i = 0; i < Suit.size(); i++) {
            for (int j = 0; j < Count.size(); j++) {
                String h = (Suit.get(i));
                String d = (Count.get(j));
                pai.add(h + d);
            }

        }
        //将大小王加入到牌组中.就成了54张牌
        pai.add("大王");
        pai.add("小王");

//        for(String b :pai){
//            System.out.print(b+" ");
//        }

        //这个方法就是将pai打乱顺序,发牌的时候才能够不会有顺序
        Collections.shuffle(pai);
        //由于需求需要,当底牌有大王的时候重新发牌.
        boolean b = true;
        //用while死循环将发牌完之后底牌还有大王的情况下再次发牌,直到底牌没大王的时候就赋值b为flase跳出循环
        while (b) {
            //遍历54张牌
            for (int i = 0; i < pai.size(); i++) {
                //当i的值到52,53,54的时候就不进入内部循环,用else装进底牌中
                if (i < pai.size() - 3) {
                    //当i能被3整除的时候就给玩家1
                    if (i % 3 == 0) {
                        playList1.add(pai.get(i));
                        //当i能被3整除的剩余1的时候就给玩家2
                    } else if (i % 3 == 1) {
                        playList2.add(pai.get(i));
                        //当i能被3整除的剩余2的时候就给玩家3
                    } else if (i % 3 == 2) {
                        playList3.add(pai.get(i));
                    }
                    //外部的else  为了存放底牌
                } else {
                    Cards.add(pai.get(i));
                }


            }
            //这里遍历底牌,通过if判断大王在不在底牌,在的话true重新发牌,不在的话返回flase给while停止循环
            for (String c : Cards) {
                if ("大王" != c) {
                    b = false;
                }

            }


        }


        //用今天刚学的知识Collection的contains方法判断"大王"在哪个玩家手中,如此将底牌添加进他手中
        if (playList1.contains("大王")) {
            playList1.addAll(Cards);
        } else if (playList2.contains("大王")) {
            playList2.addAll(Cards);
        } else if (playList3.contains("大王")) {
            playList3.addAll(Cards);
        }

        //以下用增强for循环遍历每个玩家的牌
        System.out.print("玩家1: ");
        for (String b1 : playList1) {


            System.out.print(b1 + "  ");
        }


        System.out.print("\n" + "玩家2: ");

        for (String b2 : playList2) {


            System.out.print(b2 + "  ");
        }


        System.out.print("\n" + "玩家3: ");

        for (String b3 : playList3) {

            System.out.print(b3 + "  ");
        }

        System.out.print("\n" + "底牌: ");

        for (String c : Cards) {
            System.out.print(c + "\t");
        }



    }


}
