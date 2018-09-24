package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(reader.readLine());
        Scanner scanner = new Scanner(fr);
        reader.close();

        while (scanner.hasNextLine()){
            System.out.println(new StringBuilder(scanner.nextLine()).reverse().toString());
        }

        scanner.close();
    }
}
