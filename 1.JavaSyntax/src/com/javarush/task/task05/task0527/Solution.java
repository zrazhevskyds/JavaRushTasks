package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog dog = new Dog("Vaska", 3, 4);
        Cat cat = new Cat("Kot", 1, 2);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog{
        private String name;
        private int age;
        private int height;

        public Dog(String name, int age, int height){
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }

    public static class Cat{
        private String name;
        private int age;
        private int height;

        public Cat(String name, int age, int height){
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }
}
