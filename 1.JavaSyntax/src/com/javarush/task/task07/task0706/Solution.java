package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] dom = new int[15];
        int sumn = 0;
        int sumch = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < dom.length; i++)
            dom[i] = Integer.parseInt(reader.readLine());

        sumch = dom[0];
        for (int i = 1; i < dom.length; i++){
            if (i % 2 == 0)
                sumch += dom[i];
            else
                sumn += dom[i];
        }

        if (sumch > sumn)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
