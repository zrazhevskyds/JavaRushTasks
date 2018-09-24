package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fis = new FileInputStream(new File(file1));
        FileWriter fos = new FileWriter(new File(file2));

        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
        String s = new String(buffer);
        String[] list = s.split(" ");
        float f;
        for(String x : list){
            fos.write(Math.round(Float.parseFloat(x)) + " ");
        }
        fos.close();
    }
}
