package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String fileName1 = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();

        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        reader.close();

        String stroka = sb.toString().replaceAll("[\\p{P}]", "");
        BufferedWriter fw = new BufferedWriter(new FileWriter(fileName1));

        fw.write(stroka);

        fw.close();
    }
}
