package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
        ArrayList<Integer> in = new ArrayList<Integer>();
        String line;
        reader.close();
        while ((line = bf.readLine()) != null) {
            if (Integer.parseInt(line) % 2 == 0)
             in.add(Integer.parseInt(line));
        }
        bf.close();

        int tmp;
        for (int i = 0; i < in.size() - 1; i++){
            for (int j = i; j < in.size(); j++){
                if (in.get(i) > in.get(j)){
                    tmp = in.get(i);
                    in.set(i, in.get(j));
                    in.set(j, tmp);
                }
            }
        }
        for (Integer x : in)
            System.out.println(x);

    }
}
