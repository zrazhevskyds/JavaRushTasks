package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date d = new Date(date);
        long d_old = d.getTime();
        Date ps = new Date(d.getYear(), 0, 0, 0, 0, 0);
        long ps_old = ps.getTime();
        long msDays = 24 * 60 * 60 * 1000;
        long prom = d_old - ps_old;
        int days = (int) (prom/msDays);
        //System.out.println(days);
        boolean x;
        if (days % 2 == 0)
            x = false;
        else
            x =true;


        return x;
    }
}
