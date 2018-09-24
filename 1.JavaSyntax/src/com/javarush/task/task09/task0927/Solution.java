package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> crCat = new HashMap<String, Cat>();
        crCat.put("cat1", new Cat("Cat1"));
        crCat.put("cat2", new Cat("Cat2"));
        crCat.put("cat3", new Cat("Cat3"));
        crCat.put("cat4", new Cat("Cat4"));
        crCat.put("cat5", new Cat("Cat5"));
        crCat.put("cat6", new Cat("Cat6"));
        crCat.put("cat7", new Cat("Cat7"));
        crCat.put("cat8", new Cat("Cat8"));
        crCat.put("cat9", new Cat("Cat9"));
        crCat.put("cat10", new Cat("Cat10"));
        
        return crCat;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> temp = new HashSet<Cat>();

        for (Map.Entry<String, Cat> entry : map.entrySet()) {
            temp.add(entry.getValue());
        }

        return temp;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
