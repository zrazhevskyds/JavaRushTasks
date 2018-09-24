package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(args[0]);
        Scanner scanner = new Scanner(fr);

        while (scanner.hasNextLine()){
            String stroka = scanner.nextLine();
            String[] people = stroka.split(" ");
            Calendar cal = Calendar.getInstance();
            cal.set(Integer.parseInt(people[people.length - 1]), Integer.parseInt(people[people.length - 2])-1, Integer.parseInt(people[people.length - 3]));
            int year = Integer.parseInt(people[people.length - 1]);
            int month = Integer.parseInt(people[people.length - 2]);
            int day = Integer.parseInt(people[people.length - 3]);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < people.length - 3; i++){
                sb.append(people[i] + " ");
            }
            PEOPLE.add(new Person(sb.toString().trim(), cal.getTime()));
        }

        scanner.close();

    }
}
