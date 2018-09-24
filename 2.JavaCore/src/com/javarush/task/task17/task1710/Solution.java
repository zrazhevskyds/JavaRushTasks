package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if ("-c".equals(args[0])){
            Date birth = sdf.parse(args[3]);
            Person person;
            if ("м".equals(args[2])) {
                person = Person.createMale(args[1], birth);
                allPeople.add(person);
            }
            else {
                person = Person.createFemale(args[1], birth);
                allPeople.add(person);
            }
            System.out.println(allPeople.lastIndexOf(person));

        }else if ("-u".equals(args[0])){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            Date birth = sdf.parse(args[4]);
            person.setBirthDay(birth);

            if ("м".equals(args[2]))
               person.setSex(Sex.MALE);
            else
                person.setSex(Sex.FEMALE);
        }else if ("-d".equals(args[0])){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setBirthDay(null);
            person.setName(null);
            person.setSex(null);
        }else if ("-i".equals(args[0])){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            String sex = person.getSex().name() == "MALE" ? "м" : "ж";
            SimpleDateFormat SDF = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(person.getName() + " " + sex + " " + SDF.format(person.getBirthDay()) );
        }
    }
}
