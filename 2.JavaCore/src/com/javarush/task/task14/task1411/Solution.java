package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        Class cl;

        while (true)
        {
            key = reader.readLine();
            if( "user".equals(key) || "loser".equals(key) || "coder".equals(key) || "proger".equals(key)) {
                key = key.substring(0,1).toUpperCase() + key.substring(1);
                cl = Class.forName("com.javarush.task.task14.task1411.Person$" + key);
                person = (Person) cl.newInstance();
                doWork(person); //вызываем doWork

            }else {
                break;
            }

        }
    }

    public static void doWork(Person person) {

        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
