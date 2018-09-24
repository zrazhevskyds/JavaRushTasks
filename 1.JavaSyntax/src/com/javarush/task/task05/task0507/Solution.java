package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int summa = 0;
        while (true){
            int i = scanner.nextInt();
            if (i == -1)
                break;
            count++;
            summa += i;
        }
        System.out.println((double) summa / count);
    }
}

