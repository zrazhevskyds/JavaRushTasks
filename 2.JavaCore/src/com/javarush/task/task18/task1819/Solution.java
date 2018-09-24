package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fis = new FileInputStream(new File(file1));

        byte[] buffer1 = new byte[fis.available()];
        fis.read(buffer1);

        FileOutputStream fos = new FileOutputStream(new File(file1));
        fis.close();
        fis = new FileInputStream(new File(file2));

        byte[] buffer2 = new byte[fis.available()];
        fis.read(buffer2);
        fis.close();

        fos.write(buffer2);
        fos.write(buffer1);
        fos.close();
    }
}
