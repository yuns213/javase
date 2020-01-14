package com.day9.Test04;

public class Test04 {

    public static void main(String[] args) {

        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.sendMessage();

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.playGame();

    }
}
