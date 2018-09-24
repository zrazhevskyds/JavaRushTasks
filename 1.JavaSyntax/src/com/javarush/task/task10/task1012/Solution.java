package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character x : alphabet){
            map.put(x, 0);
        }

        for (String x : list){
            for (char ch : x.toCharArray()){
                if(map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            }
        }

        for (Character x : alphabet){
            System.out.println(x + " " + map.get(x));
        }
    }

}
