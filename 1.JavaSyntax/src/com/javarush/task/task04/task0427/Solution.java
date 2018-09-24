package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i > 0 && i < 1000) {
            if (i < 10) {
                if (i % 2 == 0)
                    System.out.println("четное однозначное число");
                else
                    System.out.println("нечетное однозначное число");
            } else if (i > 9 && i < 100) {
                if (i % 2 == 0)
                    System.out.println("четное двузначное число");
                else
                    System.out.println("нечетное двузначное число");
            } else {
                if (i % 2 == 0)
                    System.out.println("четное трехзначное число");
                else
                    System.out.println("нечетное трехзначное число");
            }
        }

    }
}
