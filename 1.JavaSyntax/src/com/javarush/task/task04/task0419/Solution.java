package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(max(a, b, c, d));
    }

    public static int max(int a, int b, int c, int d){
        int e = max(a, b);
        int f = max(c, d);
        return max(e, f);

    }

    public static int max(int a, int b){
        if (a > b){
            return a;
        }else if (a < b){
            return b;
        }else{
            return a;
        }
    }
}
