package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream reader = new FileInputStream(new File(args[0]));
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        int counter = 0;

        String str;
        while (reader.available() > 0) {
            char ch = (char)reader.read();
                if (treeMap.containsKey(ch)) {
                    counter = treeMap.get(ch) + 1;
                    treeMap.put(ch,counter);
                }else {
                    treeMap.put(ch,1);
                }

        }
        for(Map.Entry e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        reader.close();
    }
}
