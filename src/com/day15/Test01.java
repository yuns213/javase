package com.day15;

public class Test01 {
    public static void main(String[] args) {
        //请描述Thread类中的start()方法和run()方法
        /* start 是用来启动线程 真正实现多线程 因为start()方法启动会进去就绪状态 并没有执行
           run() 是方法体 如果直接调用 thread.run()方法执行就是相当于普通的方法.没有达到多线程的功能
           多线程是利用cpu的时间片来达到并发的效果,直接调用run()方法就不会有并发的效果
            runnable 是任务 而不是线程 必须放在thread里面执行才能实现多线程  thread也是实现的runnable接口
           */


    }
}
