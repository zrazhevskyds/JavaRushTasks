package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    interface Fly{
        void fly();
    }

    interface Climb{
        void climb();
    }

    interface Run{
        void run();
    }

    public static void main(String[] args) {

    }

    public class Cat implements Climb, Run{
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements Run{

        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat{
        @Override
        public void run() {

        }

        @Override
        public void climb() {
            super.climb();
        }
    }

    public class Duck implements Fly, Run{

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
