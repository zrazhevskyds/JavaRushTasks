package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String den[] = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i < 1 || i > 7)
            System.out.println("такого дня недели не существует");
        else
            System.out.println(den[i - 1]);
    }
}