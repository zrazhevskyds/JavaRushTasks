package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        while (true){
           int j = scanner.nextInt();
           if (j == -1){
               i += j;
               break;
           }
           i += j;
        }
        System.out.println(i);
    }
}
