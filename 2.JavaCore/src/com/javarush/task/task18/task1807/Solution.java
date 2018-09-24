package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream fis = new FileInputStream(reader.readLine());
            int count = 0;
            while (fis.available() > 0){
               if (",".equals(Character.toString((char)fis.read())))
                   count++;
            }
            System.out.println(count);
            fis.close();
        }catch (Exception e){

        }
    }
}
