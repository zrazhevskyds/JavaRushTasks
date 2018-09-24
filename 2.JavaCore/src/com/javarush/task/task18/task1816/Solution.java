package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{
        InputStreamReader in = new InputStreamReader(new FileInputStream(args[0]));

        int count = 0;
        String s;
        while (in.ready()){
            s = "" + (char) in.read();

            if (Pattern.matches("[a-zA-Z]", s))
                count++;

        }
        System.out.println(count);
        in.close();
    }
}
