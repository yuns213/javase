package com.day21;

import org.junit.*;

public class lianxi {

    @BeforeClass
    public static  void  bfc(){
        System.out.println("在所有的测试方法运行之前，运行一次，而且本方法必须使用静态方法。");
    }
    @Before
    public void before(){
        System.out.println("在每个测试方法前都会运行一次");
    }
    @Test
    public  void tset(){
        System.out.println("测试方法一");
    }

    @After
    public void after(){
        System.out.println("在每个测试方法后都会运行一次");

    }
    @AfterClass
    public static  void afc(){
        System.out.println("在所有的测试方法运行之后，运行一次，而且本方法必须使用静态方法。");
    }

}
