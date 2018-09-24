package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }catch (Exception e){

        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private StringBuffer fileContent = new StringBuffer();
        public void setFileName(String fullFileName){
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return fileContent.toString();
        }

        @Override
        public void run() {
            try {
                FileReader r = new FileReader(this.fullFileName);
                Scanner scanner = new Scanner(r);
                while (scanner.hasNext()){
                    fileContent.append(scanner.next() + " ");
                }
            }catch (Exception e){

            }
        }
    }
}
