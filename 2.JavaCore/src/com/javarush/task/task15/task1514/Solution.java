package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static
    {
        labels.put(2.5, "1");
        labels.put(2.6, "2");
        labels.put(2.7, "3");
        labels.put(2.8, "4");
        labels.put(2.9, "5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
