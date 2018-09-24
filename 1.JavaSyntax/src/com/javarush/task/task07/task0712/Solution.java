package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minindex = 0;
        int maxindex = 0;
        int max;
        int min;

        for (int i = 0; i < 10; i++)
            strings.add(reader.readLine());

        max = strings.get(0).length();
        min = strings.get(0).length();

        for (int i = 1; i < 10; i++){
            if(strings.get(i).length() > max) {
                max = strings.get(i).length();
                maxindex = i;
            }else if (strings.get(i).length() < min){
                min = strings.get(i).length();
                minindex = i;
            }
        }

        if(maxindex > minindex)
            System.out.println(strings.get(minindex));
        else if (maxindex < minindex)
            System.out.println(strings.get(maxindex));
    }
}
