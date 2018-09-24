package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileInputStream fis = new FileInputStream(new File(args[0]));
        int all = fis.available();
        int probel = 0;
        while (fis.available() > 0){
            if (" ".equals(""+(char)fis.read())){
                probel++;
            }
        }

        System.out.println(Math.round(((float)probel/all*100) * Math.pow(10, 2)) / Math.pow(10, 2));
        fis.close();
    }
}
