package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleWrite = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream  ps = new PrintStream(outputStream);
        System.setOut(ps);

        testString.printSomething();

        String[] str = outputStream.toString().split(System.lineSeparator());
        System.setOut(consoleWrite);

        for (int i = 1; i < str.length+1; i++){
            if (i%2 == 0) {
                System.out.println(str[i-1]);
                System.out.println("JavaRush - курсы Java онлайн");
            }
            else
                System.out.println(str[i-1]);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
