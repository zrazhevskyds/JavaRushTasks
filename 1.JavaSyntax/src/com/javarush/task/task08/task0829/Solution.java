package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> addresses = new HashMap<String, String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            String gorod = reader.readLine();
            if (gorod.isEmpty()) break;

            addresses.put(family, gorod);
        }

        //read home number
        String nameGorod = reader.readLine();


            System.out.println(addresses.get(nameGorod));

    }
}
