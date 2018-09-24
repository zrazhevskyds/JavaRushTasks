package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = null;
        try {
            url = reader.readLine();

        }catch (Exception e){

        }
        ArrayList<String> list = new ArrayList<String>();
        String ob = null;
        String[] str = url.split("\\?");

        if (str.length >= 2){
           str = str[1].split("&");
           for (String result : str){
               if (result.indexOf("=") != -1){
                    String[] s = result.split("=");
                    if("obj".equals(s[0])){
                        ob = s[1];
                        list.add(s[0]);
                    }else {
                        list.add(s[0]);
                    }

               }else{
                   list.add(result);
               }
           }
        }

        for (String x : list){
            System.out.print(x + " ");
        }
        System.out.println();
        if (ob != null){
            try {
                alert(Double.parseDouble(ob));
            }catch (NumberFormatException e) {
                alert(ob);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
