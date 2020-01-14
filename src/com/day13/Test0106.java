package com.day13;

public class Test0106 {

    public static void main(String[] args) {
        //hashset去除重复元素的原理

        /* 往Haset添加元素的时候，HashSet会先调用元素的hashCode方法得到元素的哈希值 ，
然后通过元素 的哈希值经过移位等运算，就可以算出该元素在哈希表中 的存储位置。如果算出元素存储的位置目前没有任何元素存储，那么该元素可以直接存储到该位置上。
如果算出该元素的存储位置目前已经存在有其他的元素了，那么会调用该元素的equals方法与该位置的元素再比较一次
，如果equals返回的是true，那么该元素与这个位置上的元素就视为重复元素，不允许添加，如果equals方法返回的是false，*/

    }
}
