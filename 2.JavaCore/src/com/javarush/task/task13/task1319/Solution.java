package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fis = new BufferedWriter(new FileWriter(reader.readLine()));

        ArrayList<String> array = new ArrayList<String>();
        String newLine = System.getProperty("line.separator");
        while (true){
            String ch = reader.readLine();
            if("exit".equals(ch)) {
                array.add(ch);
                break;
            }
            array.add(ch);
        }

        reader.close();

        for (String x : array){
            byte[] b = x.getBytes();
            for (byte y : b)
            fis.write(y);
            fis.newLine();
        }

        fis.close();

    }
}
