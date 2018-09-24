package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded = new Human("Ded", true, 55);
        Human ded1 = new Human("Ded1", true, 56);

        Human bab = new Human("Bab", false, 57);
        Human bab1 = new Human("Bab1", false, 56);

        Human mam = new Human("Mam", false, 37, ded, bab);
        Human father = new Human("Father", true, 38, ded1, bab1);

        Human deti = new Human("Deti", true, 3, father, mam);
        Human deti1 = new Human("Deti1", false, 5, father, mam);
        Human deti2 = new Human("Deti2", true, 7, father, mam);

        System.out.println(ded);
        System.out.println(ded1);
        System.out.println(bab);
        System.out.println(bab1);
        System.out.println(mam);
        System.out.println(father);
        System.out.println(deti);
        System.out.println(deti1);
        System.out.println(deti2);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















