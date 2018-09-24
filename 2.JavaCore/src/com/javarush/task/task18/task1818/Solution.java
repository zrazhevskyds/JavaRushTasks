package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream fis = new FileInputStream(new File(file2));
        FileOutputStream fos = new FileOutputStream(new File(file1));

        while (fis.available() > 0){
            fos.write(fis.read());
        }
        fis.close();
        fis = new FileInputStream(new File(file3));
        while (fis.available() > 0){
            fos.write(fis.read());
        }
        fis.close();
        fos.close();

    }
}
