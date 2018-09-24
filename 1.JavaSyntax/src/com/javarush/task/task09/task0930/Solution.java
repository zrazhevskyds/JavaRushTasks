package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        String[] temp = array;
        String p;
        for (int i = 0; i < temp.length; i++){
            if (isNumber(array[i])){
                for (int j = i + 1; j < temp.length; j++)
                    if (isNumber(array[j])){
                        if (!isGreaterThan(Integer.parseInt(array[i]), Integer.parseInt(array[j]))){
                            p = array[i];
                            array[i] = array[j];
                            array[j] = p;
                        }

                    }
            }else {
                for (int j = i + 1; j < temp.length; j++)
                    if (!isNumber(array[j])){
                        if (isGreaterThan(array[i], array[j])){
                            p = array[i];
                            array[i] = array[j];
                            array[j] = p;
                        }

                    }

            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isGreaterThan(Integer a, Integer b) {
        return a.compareTo(b) > 0;
    }

    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
