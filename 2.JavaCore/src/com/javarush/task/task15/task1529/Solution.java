package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static Flyable result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine();

        }catch (Exception e){

        }

        if ("helicopter".equals(str)){
            result = new Helicopter();
        }else if ("plane".equals(str)){
            try {
                result = new Plane(Integer.parseInt(reader.readLine()));
            }catch (Exception e){

            }
        }
        try {
            reader.close();
        }catch (Exception e){

        }
    }
}
