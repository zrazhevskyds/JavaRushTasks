package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s = String.valueOf(number);
        int a = 0;
        for (int i = 0; i < s.length(); i++){
             a += Character.getNumericValue(s.charAt(i));
        }
        return a;
    }
}