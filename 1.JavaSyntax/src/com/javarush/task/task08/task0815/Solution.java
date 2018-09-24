package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> list = new HashMap<String, String>();

        list.put("Фамил1","Имя");
        list.put("Фамил2","Имя");
        list.put("Фамил3","Имя");
        list.put("Фамил4","Имя");
        list.put("Фамил5","Имя1");
        list.put("Фамил6","Имя1");
        list.put("Фамил7","Имя1");
        list.put("Фами8","Имя2");
        list.put("Фами9","Имя3");
        list.put("Фамил","Имя4");

        return list;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if(name.equals(pair.getValue()))
                i++;
        }

        return i;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if(lastName.equals(pair.getKey()))
                i++;
        }

        return i;

    }

    public static void main(String[] args) {

    }
}
