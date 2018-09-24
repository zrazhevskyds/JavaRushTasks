package com.javarush.task.task03.task0318;
import java.util.Scanner;
/*
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String s = scanner.next();
        System.out.println(s + " захватит мир через " + i + " лет. Му-ха-ха!");
    }
}
