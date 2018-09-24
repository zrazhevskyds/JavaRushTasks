package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream ips = new FileInputStream(reader.readLine());

        long[] arrBytes = new long[256];
        int  bufferSize = 64000;
        byte buffer[]   = new byte[64000];


        while (ips.available() > 0 ) {

            if (ips.available() < 64000) bufferSize = ips.available();
            ips.read(buffer, 0, bufferSize );
            for (int i = 0; i <bufferSize ; i++) arrBytes[ buffer[i] & 0b11111111 ]++;

        }


        long max = 0;
        for (int i = 0; i < arrBytes.length; i++){
            if (arrBytes[i] > max) max = arrBytes[i];
        }

        for (int i = 0; i < arrBytes.length; i++){
            if (arrBytes[i] == max) System.out.print(i + " ");
        }


        ips.close();
    }
}
