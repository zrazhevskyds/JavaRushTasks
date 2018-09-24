package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        private List<String> list = new LinkedList<String>();
        @Override
        public void run() {
            String s;
            for (int i = 0; i <= 2; i++){
                try {
                    s = reader.readLine();
                    if (s != null) {
                        list.add(s);
                    }
                }catch (Exception e){

                }
            }
        }

        public void printResult(){
            for (String x : this.list){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
