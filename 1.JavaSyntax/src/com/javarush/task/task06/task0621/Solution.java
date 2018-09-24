package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedName = reader.readLine();
        Cat catDed = new Cat(dedName);

        String babName = reader.readLine();
        Cat catBab = new Cat(babName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catDed, "f");

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catBab, "m");

        String sinName = reader.readLine();
        Cat catSin = new Cat(sinName, catMother, catFather);

        String dochName = reader.readLine();
        Cat catDoch = new Cat(dochName, catMother, catFather);

        System.out.println(catDed);
        System.out.println(catBab);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSin);
        System.out.println(catDoch);
    }

    public static class Cat {
        private String name;
        private Cat parentmother;
        private Cat parentfather;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, String sex) {
            this.name = name;
            if("m".equals(sex))
                this.parentmother = parent;
            else
                this.parentfather = parent;
        }

        Cat(String name, Cat parentmother, Cat parentfather) {
            this.name = name;
            this.parentmother = parentmother;
            this.parentfather = parentfather;
        }

        @Override
        public String toString() {
            String output = "Cat name is " + name + ", ";
            if (parentmother == null)
                output += "no mother, ";
            else
                output += "mother is " + parentmother.name + ", ";

            if (parentfather == null)
                output += "no father, ";
            else
                output += "father is " + parentfather.name;

            return output;
        }
    }

}
