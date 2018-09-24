package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static void main(String[] args) {
threads.get(4).start();
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true){
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                sleep(100000000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }

    }

    public static class Thread3 extends Thread {

        @Override
        public void run() {
            while (true){
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                }catch (Exception e){

                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {

        @Override
        public void run() {
            while (!this.isInterrupted()){

            }
        }

        @Override
        public void showWarning() {
                this.interrupt();
        }
    }

    public static class Thread5 extends Thread {
        private List<Integer> list = new LinkedList<Integer>();

        @Override
        public void run() {

            String s;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true){
                try {
                    s = reader.readLine();
                    if (s != null && "N".equals(s)){
                        reader.close();
                        int summ = 0;
                        for (Integer x : list)
                            summ += x;

                        System.out.println(summ);
                        this.interrupt();
                        break;
                }else if (s != null){
                        list.add(Integer.parseInt(s));
                    }
                }catch (Exception e){
                    this.interrupt();
                }

            }
        }
    }
}