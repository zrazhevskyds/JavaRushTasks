package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[3];
        mas[0] = scanner.nextInt();
        mas[1] = scanner.nextInt();
        mas[2] = scanner.nextInt();

        for (int i = mas.length - 1; i > 0; i--){
            for( int j = 0; j < i; j++){
                if( mas[j] < mas[j+1] ){
                    int tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }

        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }

    }


}
