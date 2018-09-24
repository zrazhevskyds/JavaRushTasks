package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> list_tmp = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).contains("р") && list.get(i).contains("л")){
                list_tmp.add(list.get(i));
                continue;
            }else if (list.get(i).contains("р") && !list.get(i).contains("л")){
                continue;
            }else if(list.get(i).contains("л") && !list.get(i).contains("р")){
                list_tmp.add(list.get(i));
                list_tmp.add(list.get(i));
            }else{
                list_tmp.add(list.get(i));
            }
        }

        return list_tmp;
    }
}