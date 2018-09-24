package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
*/

public class Cat {
    private static int catCount = 0;

    public static void main(String[] args) {

    }

    public Cat(){
        Cat.catCount++;
    }
}
