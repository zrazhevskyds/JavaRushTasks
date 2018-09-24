package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String s = reader.readLine();
       String[] arr = s.split("/");


       SimpleDateFormat simpleDateF = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        Date d = new Date(Integer.parseInt(arr[2]) - 1900, Integer.parseInt(arr[0]) - 1, Integer.parseInt(arr[1]));
        System.out.println(simpleDateF.format(d).toUpperCase());
    }
}
