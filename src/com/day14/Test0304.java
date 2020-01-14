package com.day14;

import java.util.*;

public class Test0304 {

    public static void main(String[] args) {
        //这个是花色集合
        ArrayList<String> color = new ArrayList<>();
        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");
        //这个 按照牌的大小加的点数
        ArrayList<String> number = new ArrayList<>();
        number.add("2");
        number.add("A");
        number.add("K");
        number.add("Q");
        number.add("J");
		
		//通过遍历的方式将剩余的点数从大到小加入
        for (int i = 10; i >= 3; i--) {
            number.add(i + "");
        }
        //54站牌
        HashMap<Integer, String> cardMap = new HashMap<>();
        //玩家1分的牌
        HashMap<Integer, String> play1 = new HashMap<>();
        //玩家2分的牌
        HashMap<Integer, String> play2 = new HashMap<>();
        //玩家3分的牌
        HashMap<Integer, String> play3 = new HashMap<>();
        //底牌3张
        HashMap<Integer, String> diPai = new HashMap<>();
        //定义一个序号
        int count = 1;
        //把字符串的大王 小王加入到牌组中
        cardMap.put(1, "大王");
        cardMap.put(2, "小王");


        //通过双重for循环,把点数和花色结合在一起
        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < color.size(); j++) {
                //这个是点数花色起来的牌用字符串接收
                String card = color.get(j) + number.get(i);
                //然后添加到hashmap集合中
                cardMap.put(++count, card);
            }
        }
        //用set 获取hashmap的牌的序号
        Set<Integer> keys = cardMap.keySet();
        //创建一个能保存打乱顺序的set的arraylist的集合
        ArrayList<Integer> index = new ArrayList<>();
        ///把set的keys键集合在arraylist里
        index.addAll(keys);
        //通过父类collections的shuffle方法打乱顺序
        Collections.shuffle(index);

        //再去遍历这个index.获得里面每一个元素(序号)
        for (int i = 0; i < index.size(); i++) {
            //用int类型来接收arraylist集合中的每一个元素(下标)
            Integer index1 = index.get(i);
            //再用字符串接收hashmap指定下标下的牌
            String card = cardMap.get(index1);


            //通过if判断,小于51,就是把52 53 54 三张牌放入底牌
            if (i < 51) {
                //能被3整除的就是玩家一的牌
                if (i % 3 == 0) {
                    play1.put(index1, card);
                //能被3除还剩1的就是玩家二的牌
                } else if (i % 3 == 1) {
                    play2.put(index1, card);
                    //能被3除还剩2的就是玩家三的牌
                } else if (i % 3 == 2) {
                    play3.put(index1, card);
                }
            } else {
                diPai.put(index1, card);
            }
        }
        //调用静态方法print和静态方法sort,play1..2..3都是参数   从而使每个玩家的牌都能从大到小排列展示在控制台
        print(sort(play1));
        print(sort(play2));
        print(sort(play3));
        print(sort(diPai));

    }


    //返回的linedhashmap在这里被获取
    public static void print(LinkedHashMap<Integer, String> map) {
        //通过获取keys的键集合,遍历输出在控制台
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.print(map.get(key) + " ");
        }
        System.out.println();
    }


    //返回值就是能够排序的linkedhashmap的双列集合   ,传入的值是玩家1..2..3(hashmap)的牌
    public static LinkedHashMap<Integer, String> sort(HashMap<Integer, String> map) {
        //这里就是将玩家的牌全部添加到linkedhashmap里,展示的就是数据按照顺序的放入的数据,不会像hashmap一样乱序输出在控制台
        LinkedHashMap<Integer, String> resultMap = new LinkedHashMap<>();


        //获取键的set集合
        Set<Integer> keys = map.keySet();

        //创建list对象
        ArrayList<Integer> list = new ArrayList<>();
        //把keys加入到list
        list.addAll(keys);
        //对list的keys键排序(升序)
        Collections.sort(list);

        //遍历加入到linkedhashmap中
        for (int i = 0; i < list.size(); i++) {
            resultMap.put(list.get(i), map.get(list.get(i)));
        }

        return resultMap;
    }
}
