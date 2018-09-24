package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int j = 1;
        int tmp = 1;
        for (int i = 0; i < 10; i++)
            list.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i < list.size(); i++){
            if((i + 1) < list.size()) {
                if (list.get(i).equals(list.get(i + 1))){
                    tmp++;
                }else {
                    if(tmp > j)
                    j = tmp;
                    tmp = 1;
                }
            }else{
                if(tmp > j)
                    j = tmp;
            }
        }

        System.out.println(j);

    }
}