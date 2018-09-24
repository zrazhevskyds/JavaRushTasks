package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int count = 0;
        while (true){
            int j = Integer.parseInt(reader.readLine());
            if (j > 0){
                count = j;
                break;
            }
        }
        maximum = Integer.parseInt(reader.readLine());
        if (count > 1){
        for(int i = 0; i < count-1; i++){
            int j = Integer.parseInt(reader.readLine());
            if (j > maximum)
                maximum = j;
        }
        }

        System.out.println(maximum);
    }
}
