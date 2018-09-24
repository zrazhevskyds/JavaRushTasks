package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String lastName;
        private boolean sex;
        private int age;
        private Human mother;
        private Human father;

        public Human(String name){
            this.name = name;
        }

        public Human(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, boolean sex){
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String name, String lastName, boolean sex, int age){
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String lastName, boolean sex, int age, Human mother, Human father){
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, String lastName, int age, Human mother, Human father){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, String lastName, boolean sex, Human mother, Human father){
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, String lastName, Human mother, Human father){
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, Human mother, Human father){
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }


    }
}
