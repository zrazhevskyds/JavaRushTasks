package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String fileName1 = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        while (reader.ready()){
            sb.append((char) reader.read());
        }
        reader.close();
        String[] str = sb.toString().split(" ");

        BufferedWriter fw = new BufferedWriter(new FileWriter(fileName1));
        for (String res : str){
            if (res.matches("\\d+")){
                fw.write(res + " ");
            }
        }
        fw.close();
    }
}
