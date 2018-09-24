package com.javarush.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountDownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexDown;

        @Override
        public void run() {
            try{
                int y = Solution.number;
               while (true) {
                   countIndexDown++;
                   System.out.println(toString());
                   Thread.sleep(500);
                   if (countIndexDown == y) return;

               }
            }catch (InterruptedException e){

            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }


    }


    public static class CountDownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
