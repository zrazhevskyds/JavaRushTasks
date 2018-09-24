package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String f1 = r1.readLine();
        String f2 = r1.readLine();
        String f3 = r1.readLine();
        FileInputStream file1 = new FileInputStream(f1);
        FileOutputStream file2 = new FileOutputStream(f2);
        FileOutputStream file3 = new FileOutputStream(f3);
        int count=0;

        while(file1.available() > 0){
            byte[] buffer = new byte[file1.available()];
            count = file1.read(buffer);

            if (count%2 == 0){ //кол-во байт четно
                file2.write(buffer,0,count/2);
                file3.write(buffer,count/2,count/2);
            }else
            if (count%2 != 0){//кол-во байт не четно
                file2.write(buffer,0,count/2+1);
                file3.write(buffer,count/2+1,count/2);
            }
        }

        r1.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
