package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.trim();
        String m[] = s.split("[ ]+");
        for (String x : m)
        System.out.print(x.substring(0, 1).toUpperCase() + x.substring(1) + " ");
    }
}
