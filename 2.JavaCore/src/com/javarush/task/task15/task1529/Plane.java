package com.javarush.task.task15.task1529;

public class Plane implements Flyable {
    private int countPeople;

    @Override
    public void fly() {

    }

    public Plane(int countPeople){
        this.countPeople = countPeople;
    }

}
