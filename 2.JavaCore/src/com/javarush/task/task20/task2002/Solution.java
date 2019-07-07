package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("D:\\test.txt", null);
            OutputStream outputStream = new FileOutputStream("D:\\test.txt");
            InputStream inputStream = new FileInputStream("D:\\test.txt");



            JavaRush javaRush = new JavaRush();
            User Denis = new User();
            Denis.setFirstName("Denis");
            Denis.setLastName("Zrazhevsky");
            Denis.setBirthDate(new Date());
            Denis.setMale(true);
            Denis.setCountry(User.Country.UKRAINE);
            User Denis1 = new User();
            Denis1.setFirstName("Denis1");
            Denis1.setLastName("Zrazhevsky1");
            Denis1.setBirthDate(new Date());
            Denis1.setMale(false);
            javaRush.users.add(Denis);
            javaRush.users.add(Denis1);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printW = new PrintWriter(outputStream);

            if (users.size() == 0){
                printW.println(0);

            }else{
                printW.println(users.size());
                String country = null;
                for (User user:
                     users) {
                    country = (user.getCountry() == null) ? null : user.getCountry().toString();
                    String us = user.getFirstName() + "*" + user.getLastName() + "*" + user.getBirthDate().getTime() + "*" +
                            user.isMale() + "*" + country;
                    printW.println(us);
                    printW.flush();
                }

            }
            printW.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
            int usercount = Integer.parseInt(bf.readLine());
            User user = new User();
            if (usercount > 0){
                for (int i = 0; i < usercount; i++){
                    String[] us = (bf.readLine()).split("\\*");
                    user = new User();
                    user.setFirstName(us[0]);
                    user.setLastName(us[1]);
                    user.setBirthDate(new Date(Long.parseLong(us[2])));
                    user.setMale(Boolean.parseBoolean(us[3]));
                    if (!us[4].contentEquals("null")) {
                        //System.out.println(us[4]);
                       user.setCountry(User.Country.valueOf(us[4]));

                    }

                    users.add(user);

                }
            }
            bf.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
