package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(args[0]);
        Scanner scanner = new Scanner(fr);
        Map<String, Float> map = new TreeMap<>();
        String stroka = null;

        while (scanner.hasNextLine()){
            stroka = scanner.nextLine();
            String[] dannie = stroka.split(" ");
            if (map.containsKey(dannie[0])){
                map.put(dannie[0], map.get(dannie[0]) + Float.parseFloat(dannie[1]));
            }else
                map.put(dannie[0],Float.parseFloat(dannie[1]));
        }

        scanner.close();
        map.forEach((s, f) -> System.out.println(s + " " + f));
    }
}
