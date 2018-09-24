package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf;

    public  static IMF getFund() {
        synchronized (IMF.class) {
            IMF localImf = imf;
            if (localImf == null) {

                if (imf == null)
                    imf = new IMF();
            }

        imf = localImf;
        return imf;
    }
    }

    private IMF() {
    }
}
