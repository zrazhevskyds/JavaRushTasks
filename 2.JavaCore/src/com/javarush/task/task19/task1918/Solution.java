package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        reader.close();
        StringBuilder sb = new StringBuilder();
        FileReader fr = new FileReader(fileName);
        Scanner scanner = new Scanner(fr);


        while (scanner.hasNextLine()){
            sb.append(scanner.nextLine());
        }

        scanner.close();
        String openTag = "<" + args[0];
        String closeTag = "</" + args[0] + ">";
        Map<Integer, Boolean> tagIndexes = new TreeMap<>();
        Map<Integer, Integer> finalIndexes = new TreeMap<>();
        Stack<Integer> openTagsStack = new Stack<>();

        int openTagIndex = sb.indexOf(openTag);
        while (openTagIndex != -1) {
            tagIndexes.put(openTagIndex, true);
            openTagIndex = sb.indexOf(openTag, openTagIndex + 1);
        }

        int closeTagIndex = sb.indexOf(closeTag);
        while (closeTagIndex != -1) {
            tagIndexes.put(closeTagIndex, false);
            closeTagIndex = sb.indexOf(closeTag, closeTagIndex + 1);
        }

        for (Map.Entry<Integer, Boolean> entry : tagIndexes.entrySet()) {
            if (entry.getValue()) {
                openTagsStack.push(entry.getKey());
            } else {
                finalIndexes.put(openTagsStack.pop(), entry.getKey());
            }
        }

        for (Map.Entry<Integer, Integer> entry : finalIndexes.entrySet()) {
            System.out.println(sb.substring(entry.getKey(), entry.getValue() + closeTag.length()));
        }

    }
}
