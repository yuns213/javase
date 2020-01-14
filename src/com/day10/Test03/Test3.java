package com.day10.Test03;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();


        for (int i = 1; i <= 50; i++) {
            User u = new User(i);
            users.add(u);
        }
        System.out.println("未分组:");
        System.out.print("[");
        for (int i = 0; i < users.size(); i++) {
            User users1 = users.get(i);
            System.out.print(users1.getId()+"-"+users1.getUserType()+", ");
        }
        System.out.println("]");


        Receptionist rec = new Receptionist();
        Receptionist rec1 = new Receptionist();
        Receptionist rec3 = new Receptionist();

        System.out.print("已分组:");

        rec.setFiter(new Fiter() {
            @Override
            public void filterUser(User u) {
                for (int i = 0; i < users.size() ; i++) {
                    User users1 =  users.get(i);
                    if (users1.getId()>=10&&users1.getId()<=19){
                        users1.setUserType("v1");
                    }
                }
            }
        });

        rec1.setFiter(new Fiter() {
            @Override
            public void filterUser(User u) {
                for (int i = 0; i < users.size() ; i++) {
                    User users1 =  users.get(i);
                    if (users1.getId()>=20&&users1.getId()<=29){
                        users1.setUserType("v2");
                    }
                }
            }
        });

        for (int i = 0; i < users.size(); i++) {
            User user1 = users.get(i);
            rec.filterUser(user1);
            rec1.filterUser(user1);
            rec3.filterUser(user1);
        }
        for (int i = 0; i < users.size(); i++) {
            User user1 = users.get(i);

            if (i%9==0){
                System.out.println("");
            }
            System.out.print(user1.getId()+"-"+user1.getUserType()+" ");
        }


    }
}
