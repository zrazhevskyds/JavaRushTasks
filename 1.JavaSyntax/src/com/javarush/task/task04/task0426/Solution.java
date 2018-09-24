package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if(i > 0){
            if(i % 2 == 0)
                System.out.print("положительное четное число");
            else
                System.out.print("положительное нечетное число");
        }else if (i < 0){
            if(i % 2 == 0)
                System.out.print("отрицательное четное число");
            else
                System.out.print("отрицательное нечетное число");
        }else{
            System.out.print("ноль");
        }
    }
}
