package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        String s = buffered.readLine();
        return s;

    }

    public static int readInt() throws Exception {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(buffered.readLine());
        return i;

    }

    public static double readDouble() throws Exception {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        double s = Double.parseDouble(buffered.readLine());
        return s;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        String s = buffered.readLine();
        if ("true".equals(s)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {

    }
}
