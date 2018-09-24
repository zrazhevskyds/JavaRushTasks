package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int count_o = 0;
        int count_p = 0;
        Scanner scanner = new Scanner(System.in);
         for (int i = 0;i < 3; i++){
             int a = scanner.nextInt();
             if (a > 0)
                 count_p += 1;
             else if ( a < 0)
                 count_o += 1;
         }

         System.out.println("\"количество отрицательных чисел: " + count_o);
        System.out.println("количество положительных чисел: " + count_p);

    }
}
