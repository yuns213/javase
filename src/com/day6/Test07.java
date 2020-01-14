package com.day6;

import javafx.concurrent.WorkerStateEvent;
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;

public class Test07 {

    public static void main(String[] args) {



        Worker w1 = new Worker("bz001","黄渤",45);
        Worker w2 = new Worker("bz002","孙红雷",48);
        Worker w3 = new Worker("bz003","罗志祥",35);


        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(w1);
        workers.add(w2);
        workers.add(w3);


        System.out.println("最高年龄woreker对象:");
        findMaxAge(workers);
    }

    public static void findMaxAge(ArrayList<Worker> workers){

        Worker maxAgeWorker = new Worker("","",0);
        for (int i = 0; i <workers.size() ; i++) {
            if(maxAgeWorker.getAge() < workers.get(i).getAge()){
                maxAgeWorker =workers.get(i);
            }

        }
        maxAgeWorker.show();




    }


}
