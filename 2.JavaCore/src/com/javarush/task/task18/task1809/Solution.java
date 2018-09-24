package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        while(inputStream.available()>0){
            int data = inputStream.read();
            list.add(data);
        }
        inputStream.close();

        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        for(int i=list.size()-1;i>=0;i--){
            outputStream1.write(list.get(i));
        }
        reader.close();
        outputStream1.close();
    }
}
