package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileRead = reader.readLine();
        String fileWrite = reader.readLine();
        reader.close();

        FileReader fr = new FileReader(fileRead);
        FileWriter fw = new FileWriter(fileWrite);
        int i = 1;

        while (fr.ready()){
            int ch = fr.read();
            if (i % 2 == 0) {
                fw.write(ch);
                i++;
            } else
                i++;
        }
        fr.close();
        fw.close();
    }
}
