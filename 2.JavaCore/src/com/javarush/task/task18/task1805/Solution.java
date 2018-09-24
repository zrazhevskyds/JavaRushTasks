package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream ips = new FileInputStream(reader.readLine());

        Set<Integer> set = new TreeSet<>();

        while (ips.available() > 0){
            int b = ips.read();
            set.add(b);
        }

        for (Integer x : set)
            System.out.print(x + " ");
        ips.close();
    }
}
