package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String chislo = buffer.readLine();
        for (int i = 0; i < chislo.length(); i++){
            int x = Character.getNumericValue(chislo.charAt(i));
            if (x % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: " +even+ " Odd: " + odd);
    }
}
