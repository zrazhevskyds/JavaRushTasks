package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> temp= new ArrayList<int[]>();
        temp.add(new int[] {0, 1, 2, 3, 4});
        temp.add(new int[] {0, 1});
        temp.add(new int[] {0, 1, 2, 3});
        temp.add(new int[] {0, 1, 2, 3, 4, 5, 6});
        temp.add(new int[] {});
        return temp;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
