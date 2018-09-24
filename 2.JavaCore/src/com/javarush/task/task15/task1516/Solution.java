package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;
    public static void main(String[] args) {
        Solution var = new Solution();
        System.out.println(var.intVar);
        System.out.println(var.doubleVar);
        System.out.println(var.DoubleVar);
        System.out.println(var.booleanVar);
        System.out.println(var.ObjectVar);
        System.out.println(var.ExceptionVar);
        System.out.println(var.StringVar);
    }
}
