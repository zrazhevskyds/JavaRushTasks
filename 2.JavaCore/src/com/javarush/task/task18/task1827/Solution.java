package com.javarush.task.task18.task1827;

/* 
Прайсы
*/


import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        if (args.length != 0){
            int i = maxID(fileName);
            Formatter f = new Formatter();
            FileWriter fr = new FileWriter(fileName, true);
            fr.write(String.valueOf(f.format("%-8d%-30s%-8s%-4s",i++,args[1],args[2],args[3])));
            fr.close();
        }

    }



    public static int maxID(String fileName) throws FileNotFoundException {
        FileReader  fr = new FileReader(fileName);
        Scanner scanner = new Scanner(fr);
        int max = 0;
        while(scanner.hasNextLine()){
            String stroka = scanner.nextLine();
            int i = Integer.parseInt(stroka.substring(0, 8).trim());
               if (i > max)
                   max = i;
        }

        scanner.close();
        return max;
    }
}
