package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human ded = new Human();
        ded.name = "Ded";
        ded.sex = true;
        ded.age = 50;

        Human ded2 = new Human();
        ded2.name = "Ded2";
        ded2.sex = true;
        ded2.age = 52;

        Human bab = new Human();
        bab.name = "Bab";
        bab.sex = false;
        bab.age = 48;

        Human bab1 = new Human();
        bab1.name = "Bab1";
        bab1.sex = false;
        bab1.age = 47;

        Human father = new Human();
        father.name = "Father";
        father.sex = true;
        father.age = 37;

        Human mother = new Human();
        mother.name = "Mother";
        mother.sex = false;
        mother.age = 35;

        Human deti = new Human();
        deti.name = "Deti";
        deti.sex = false;
        deti.age = 10;

        Human deti1 = new Human();
        deti1.name = "Deti1";
        deti1.sex = true;
        deti1.age = 12;

        Human deti2 = new Human();
        deti2.name = "Deti2";
        deti2.sex = false;
        deti2.age = 8;

        ded.children.add(father);
        bab.children.add(father);
        ded2.children.add(mother);
        bab1.children.add(mother);
        father.children.add(deti);
        father.children.add(deti1);
        father.children.add(deti2);
        mother.children.add(deti);
        mother.children.add(deti1);
        mother.children.add(deti2);

        System.out.println(ded);
        System.out.println(bab);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(deti);
        System.out.println(deti1);
        System.out.println(deti2);


    }

    public static class Human {

        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
