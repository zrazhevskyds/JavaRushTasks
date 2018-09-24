package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fr = new FileReader(fileName);
        StringBuffer sb = new StringBuffer();

        while (fr.ready()){
            sb.append((char)fr.read());
        }
        String[] str = sb.toString().split("\\W");

        int counter = 0;

        for (String s : str) {
            if (s.trim().equals("world")){
                counter++;
            }
        }

        System.out.println(counter);

        fr.close();
    }
}
