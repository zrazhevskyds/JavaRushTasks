package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        //init
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            FileReader f1r = new FileReader(reader.readLine());
            FileReader f2r = new FileReader(reader.readLine());

            reader.close();

        BufferedReader f1 = new BufferedReader(f1r);
        BufferedReader f2 = new BufferedReader(f2r);

        //read
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        while (f1.ready()) {
            l1.add(f1.readLine());
        }
        while (f2.ready()) {
            l2.add(f2.readLine());
        }

        //process
        int j = 0;
        for (int i = 0; i < l1.size(); i++){
            if (j >= l2.size()) {
                lines.add(new LineItem(Type.REMOVED, l1.get(i)));
                break;
            } else
            if (l1.get(i).equals(l2.get(j))) {
                lines.add(new LineItem(Type.SAME, l1.get(i)));

                j++;
            } else
            if (j < (l2.size() - 1) && l1.get(i).equals(l2.get(j + 1))) {
                lines.add(new LineItem(Type.ADDED, l2.get(j)));

                j++;
                i--;
            } else
            if (i < (l1.size() - 1) && l1.get(i + 1).equals(l2.get(j))) {
                lines.add(new LineItem(Type.REMOVED, l1.get(i)));

            }
        }
        if (lines.get(lines.size() - 1).type == Type.SAME && j <= (l2.size() - 1) ) {
            lines.add(new LineItem(Type.ADDED, l2.get(j)));

        }

        //close files
        f1.close();
        f2.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
