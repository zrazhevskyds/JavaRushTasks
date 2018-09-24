package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();

        System.setOut(consoleStream);

        String[] example = result.toString().split(" ");
        int result1 = 0;
        switch (example[1]) {
            case "+":
                result1 = Integer.parseInt(example[0]) + Integer.parseInt(example[2]);
                break;
            case "-":
                result1 = Integer.parseInt(example[0]) - Integer.parseInt(example[2]);
                break;
            case "*":
                result1 = Integer.parseInt(example[0]) * Integer.parseInt(example[2]);
                break;
        }

        System.out.println(example[0] + " " + example[1] + " " +  example[2] + " " + example[3] + " " + result1);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

