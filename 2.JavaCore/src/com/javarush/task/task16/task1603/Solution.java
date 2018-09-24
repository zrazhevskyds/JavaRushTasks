package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        Thread oneT = new Thread(new SpecialThread());
        Thread twoT = new Thread(new SpecialThread());
        Thread freeT = new Thread(new SpecialThread());
        Thread fooT = new Thread(new SpecialThread());
        Thread fifthT = new Thread(new SpecialThread());
        list.add(oneT);
        list.add(twoT);
        list.add(freeT);
        list.add(fooT);
        list.add(fifthT);


    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
