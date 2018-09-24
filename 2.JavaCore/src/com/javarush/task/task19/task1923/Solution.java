package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(args[0]);
        Scanner scanner = new Scanner(fr);
        FileWriter fw = new FileWriter(args[1]);

        while (scanner.hasNextLine()){
            String[] str = scanner.nextLine().split(" ");
            for (String res : str){
                Pattern pattern = Pattern.compile("(.*)[0-9](.*)");
                Matcher matcher = pattern.matcher(res);
                if (matcher.lookingAt()){
                    fw.write(res + " ");
                }
            }
        }

        scanner.close();
        fw.close();
    }
}
