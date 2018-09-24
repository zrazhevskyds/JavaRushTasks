package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.*;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) throws IOException {
        this.fileWriter = new FileWriter(fd);
    }

    public void write(char[] cbuf, int off, int len) throws IOException{
        this.fileWriter.write(cbuf, off, len);
        for (int i = 0; i < len; i++)
            System.out.print(cbuf[off + i]);
    }
    public void write(int c) throws IOException{
        this.fileWriter.write(c);
        System.out.print(c);
    }
    public void write(String str) throws IOException{
        this.fileWriter.write(str);
        System.out.print(str);
    }
    public void write(String str, int off, int len)throws IOException{
        this.fileWriter.write(str, off, len);
        char[] ch = str.toCharArray();
        for (int i = 0; i < len; i++)
            System.out.print(ch[off + i]);
    }
    public void write(char[] cbuf) throws IOException{
        this.fileWriter.write(cbuf);
        for (int i = 0; i < cbuf.length; i++)
            System.out.print(cbuf[i]);
    }
    public void close() throws IOException{
        this.fileWriter.close();
    }


    public static void main(String[] args) {


    }

}
