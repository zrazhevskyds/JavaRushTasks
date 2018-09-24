package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextDouble();
        int a = (int) i;
        if ((a % 5) < 3) System.out.println("зелёный");
        else if ((a % 5) < 4) System.out.println("жёлтый");
        else System.out.println("красный");
    }
}