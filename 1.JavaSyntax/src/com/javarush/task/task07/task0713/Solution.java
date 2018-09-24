package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> main = new ArrayList<Integer>();
        ArrayList<Integer> tri = new ArrayList<Integer>();
        ArrayList<Integer> dva = new ArrayList<Integer>();
        ArrayList<Integer> ost = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++)
            main.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i < main.size(); i++){

            if (main.get(i) % 3 == 0)
                tri.add(main.get(i));

            if (main.get(i) % 2 == 0)
                dva.add(main.get(i));

            if (main.get(i) % 3 != 0 && main.get(i) % 2 != 0)
                ost.add(main.get(i));

        }

        printList(tri);
        printList(dva);
        printList(ost);

    }

    public static void printList(List<Integer> list) {
        for (Integer x : list)
            System.out.println(x);
    }
}
