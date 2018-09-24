package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> list = new HashMap<String, Integer>();
        String dannie;
        int id;

        while (true){
            dannie = reader.readLine();
            if (dannie.isEmpty()) {
                break;
            }else {
                id = Integer.parseInt(dannie);
                dannie = reader.readLine();
                if (dannie.isEmpty()){
                    break;
                }else {
                    list.put(dannie, id);
                }
            }

        }

        list.forEach((k, v) -> System.out.println(v + " " + k));

    }
}
