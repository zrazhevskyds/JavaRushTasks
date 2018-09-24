package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f;
        String s;

        s = reader.readLine();

        String str;

        f = new FileInputStream(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(f));

        while (f.available() > 0) {
            while ((str = br.readLine()) != null){

                if ((str.substring(0, (str.indexOf(" ")))).equals(args[0])){
                    System.out.println(str);
                }
            }
        }
        f.close();
        reader.close();

    }
}
