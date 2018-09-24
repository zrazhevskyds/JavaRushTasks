package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String put = reader.readLine();

        FileInputStream fis = new FileInputStream(put);

        char ch;
        while (fis.available() > 0){
            ch = (char) fis.read();
            System.out.print(ch);
        }
        reader.close();
        fis.close();
    }
}