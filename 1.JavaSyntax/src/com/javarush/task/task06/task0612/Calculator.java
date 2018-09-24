package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int summ = a + b;
        return summ;
    }

    public static int minus(int a, int b) {
        int minus = a - b;
        return minus;
    }

    public static int multiply(int a, int b) {
        int umn = a * b;
        return umn;
    }

    public static double division(int a, int b) {
        double del = (double) a / b;
        return del;
    }

    public static double percent(int a, int b) {
        double perct = a * b /100;
        return perct;
    }

    public static void main(String[] args) {

    }
}