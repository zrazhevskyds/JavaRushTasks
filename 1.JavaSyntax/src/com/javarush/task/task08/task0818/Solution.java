package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Petrov", 100);
        map.put("Petrov1", 600);
        map.put("Petrov2", 200);
        map.put("Petrov3", 300);
        map.put("Petrov4", 400);
        map.put("Petrov51", 1500);
        map.put("Petrov54", 1700);
        map.put("Petrov55", 1800);
        map.put("Petrov52", 1900);
        map.put("Petrov53", 5000);

        return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()){
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}