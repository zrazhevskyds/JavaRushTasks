package com.javarush.task.task14.task1419;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer a=null;
            Integer c=a*2;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String s="r";
            int a=Integer.parseInt(s);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] a= new int[1];
            a[0]=1;
            a[1]=2;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Date a=new Date("k");

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IOException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new FileNotFoundException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new EOFException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new SQLException();

        } catch (Exception e) {
            exceptions.add(e);
        }try {
            throw new NoSuchFieldException();

        } catch (Exception e) {
            exceptions.add(e);
        }


    }
}
