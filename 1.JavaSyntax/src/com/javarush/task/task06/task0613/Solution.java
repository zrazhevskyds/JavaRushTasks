package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Cat cat = new Cat();
        }

        System.out.println(Cat.catCount);
    }

    public static class Cat {
        static public int catCount = 2;

        public Cat(){
            Cat.catCount++;
        }
    }
}
