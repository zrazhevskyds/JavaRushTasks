package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
       HashSet<Integer> list = new HashSet<Integer>();
       for (int i = 0; i < 20; i++){
           list.add(i + 1);
       }
        return list;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator =  set.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i > 10)
                iterator.remove();
        }

        return set;

    }

    public static void main(String[] args) {

    }
}
