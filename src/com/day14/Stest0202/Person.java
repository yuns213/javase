package com.day14.Stest0202;


public class Person {

    private String name;
    private int lifeValue;

    public Person() {
        super();
    }

    public Person(String name, int lifeValue) {
        super();
        if (lifeValue < 0) {
            throw new NoLifeValueException("生命值不能是负数:" + lifeValue);
        } else {
            this.lifeValue = lifeValue;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }
}