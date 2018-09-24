package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        Map<Integer, String> map = new LinkedHashMap<>();
        if (args.length != 0){
            FileReader fr = new FileReader(fileName);
            Scanner scanner = new Scanner(fr);
            while(scanner.hasNextLine()){
                String stroka = scanner.nextLine();
                int i = Integer.parseInt(stroka.substring(0, 8).trim());
                map.put(i, stroka);
            }
            scanner.close();
            switch (args[0]){
                case "-u":
                    Formatter f = new Formatter();
                    map.replace(Integer.parseInt(args[1]),String.valueOf(f.format("%-8d%-30s%-8s%-4s",Integer.parseInt(args[1]),args[2],args[3],args[4])));
                    break;
                case "-d":
                    map.remove(Integer.parseInt(args[1]));
                    break;
            }

            FileWriter fw = new FileWriter(fileName);
            String separator = System.getProperty("line.separator");
            for (Map.Entry<Integer, String> res : map.entrySet()){
                fw.write(res.getValue());
                fw.write(separator);
            }

            fw.close();
        }

    }



}
