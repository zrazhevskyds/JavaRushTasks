package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String name = null;
        switch (o.getClass().getSimpleName()){
            case "Cow":
                name = "Корова";
                break;
            case "Dog":
                name = "Собака";
                break;
            case "Whale":
                name = "Кит";
                break;
        }
        if (name != null)
            return name;
        else
            return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
