package com.day16.test03;



import java.util.Random;
import java.util.concurrent.Callable;

public class avg implements Callable {


    @Override
    public Object call() throws Exception {
        Random random = new Random();
        int j = random.nextInt(100);
        int sum=0;
        for (int i = 0; i < 10; i++) {

            sum += j;
        }


        return sum/10;
    }

}
