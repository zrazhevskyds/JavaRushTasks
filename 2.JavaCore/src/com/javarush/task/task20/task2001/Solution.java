package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("D:\\test.txt", null);
            OutputStream outputStream = new FileOutputStream("D:\\test.txt");
            InputStream inputStream = new FileInputStream("D:\\test.txt");

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

                System.out.println(ivanov.equals(somePerson));

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;
            System.out.println(assets.equals(human.assets));
            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {

            outputStream.write(this.name.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
            if (assets.isEmpty()){
                outputStream.write("empty".getBytes());
            }else{
                for (int i = 0; i < assets.size(); i++) {
                    outputStream.write((assets.get(i).getName() + ':' + assets.get(i).getPrice()).getBytes());
                    if (i != assets.size() - 1)
                        outputStream.write(',');
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            Scanner f = new Scanner(inputStream);
            this.name = f.nextLine();
            String str = f.nextLine();
            if (!str.equals("empty")){
                String[] as = str.split(",");
                assets.add(new Asset(as[0].split(":")[0], Double.parseDouble(as[0].split(":")[1])));
            }
        }
    }
}
