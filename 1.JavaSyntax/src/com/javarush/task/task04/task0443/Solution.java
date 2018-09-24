package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + y + "." + m + "." + d);
    }
}
