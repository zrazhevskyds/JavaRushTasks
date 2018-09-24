package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Name", "im4");
        map.put("Name1", "im2");
        map.put("Name2", "im5");
        map.put("Name6", "im2");
        map.put("Name5", "im6");
        map.put("Name4", "im1");
        map.put("Name3", "im3");
        map.put("Name7", "im7");
        map.put("Name8", "im8");
        map.put("Name9", "im1");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copyr = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copyr.entrySet()){
            if ((Collections.frequency(copyr.values(), pair.getValue())) > 1)
                removeItemFromMapByValue(map, pair.getValue());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
