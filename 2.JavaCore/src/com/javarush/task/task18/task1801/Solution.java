package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream ips = new FileInputStream(reader.readLine());

        int b = 0;
        while(ips.available() > 0){
            int i = ips.read();
            b = (i > b) ? i : b;
        }
        System.out.println(b);
        ips.close();

    }
}
