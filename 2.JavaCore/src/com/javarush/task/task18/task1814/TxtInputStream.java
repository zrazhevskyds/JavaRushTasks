package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String component) throws UnsupportedFileNameException, IOException {
        super(component);
        if (!component.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();// UnsupportedFileNameException.

        }
    }

    public static void main(String[] args) {
    }
}

