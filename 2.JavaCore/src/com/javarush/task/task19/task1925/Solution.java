package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader(args[0]);
        Scanner scanner = new Scanner(fr);
        FileWriter fw = new FileWriter(args[1]);

        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()){
                String[] str = scanner.nextLine().split(" ");
                for (int i =0; i < str.length; i++){
                    if (str[i].length() > 6) {
                        sb.append(str[i] + ",");
                    }

                }
        }
        fw.write(sb.deleteCharAt(sb.length()-1).toString());
        scanner.close();
        fw.close();
    }
}
