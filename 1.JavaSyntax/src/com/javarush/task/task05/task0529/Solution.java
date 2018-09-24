package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        while (true){
            if (scanner.hasNextInt()){
                summ += scanner.nextInt();
            }else{
                if ("сумма".equals(scanner.nextLine()))
                    break;
            }
        }

        System.out.println(summ);
    }
}
