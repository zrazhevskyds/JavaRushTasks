package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String per = null;
            if (fileScanner.hasNextLine())
                per = fileScanner.nextLine();
            String[] s = per.split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(s[5]),
                    Integer.parseInt(s[4]) - 1, Integer.parseInt(s[3]));
            Person person = new Person(s[1], s[2], s[0], calendar.getTime());
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
