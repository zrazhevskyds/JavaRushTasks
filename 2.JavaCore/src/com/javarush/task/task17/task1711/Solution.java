package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
                    int count = (args.length - 1) / 3;

                    for (int i = 0; i < count; i++){
                        if ("м".equals(args[i*3+2])){
                            try {
                                allPeople.add(Person.createMale(args[i*3+1], sdf.parse(args[i*3+3])));
                                System.out.println(allPeople.size()-1);
                            }catch (Exception e){
                            }

                        }else {
                            try {
                                allPeople.add(Person.createFemale(args[i*3+1], sdf.parse(args[i*3+3])));
                                System.out.println(allPeople.size()-1);
                            }catch (Exception e){
                            }
                        }

                    }

                }
                break;
            case "-u":
                synchronized (allPeople) {
                    int count = (args.length - 1) / 4;

                    for (int i = 0; i < count; i++){
                        Person person = allPeople.get(Integer.parseInt(args[i*4+1]));
                        person.setName(args[i*4+2]);
                        try {
                            person.setBirthDay(sdf.parse(args[i*4+4]));
                        }catch (Exception e){

                        }
                        person.setSex("м".equals(args[i*4+3]) ? Sex.MALE : Sex.FEMALE);

                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++){
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setBirthDay(null);
                        person.setName(null);
                        person.setSex(null);
                    }

                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++){
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        String sex = person.getSex().name() == "MALE" ? "м" : "ж";
                        SimpleDateFormat SDF = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        System.out.println(person.getName() + " " + sex + " " + SDF.format(person.getBirthDay()) );
                    }
                }
                break;
        }
    }
}
