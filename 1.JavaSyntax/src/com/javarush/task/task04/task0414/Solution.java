package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i % 4 == 0 ){
            if (i % 100 == 0 && i % 400 != 0){
                System.out.println("количество дней в году: 365");
            }else{
                System.out.println("количество дней в году: 366");
            }
        }else{
            System.out.println("количество дней в году: 365");
        }
    }
}