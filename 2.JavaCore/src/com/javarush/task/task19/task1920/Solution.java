package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
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
        float finalMax = 0;
        for (Map.Entry<String, Float> res : map.entrySet()){
            if (res.getValue() > finalMax)
                finalMax = res.getValue();
        }

        float finalMax1 = finalMax;
        Set<String> set = new TreeSet<>();
        map.entrySet().stream().forEach(entry ->
        {
            if(entry.getValue() == finalMax1)
                set.add(entry.getKey());
        });

        set.forEach(x -> System.out.println(x));
    }
}
