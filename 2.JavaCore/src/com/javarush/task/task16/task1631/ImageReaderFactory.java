package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes ImageTypes) {


       if (ImageTypes != null && "JPG".equals(ImageTypes.toString())){
           return new JpgReader();
       }else if (ImageTypes != null && "BMP".equals(ImageTypes.toString())){
           return new BmpReader();
       }else if (ImageTypes != null && "PNG".equals(ImageTypes.toString())){
           return new PngReader();
       }else{
           throw new IllegalArgumentException();
       }

    }
}
