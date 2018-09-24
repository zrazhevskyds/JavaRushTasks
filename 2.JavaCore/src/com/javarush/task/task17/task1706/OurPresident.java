package com.javarush.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    static {
        OurPresident localPresident = president;
        if (localPresident == null){
            synchronized (OurPresident.class){
                localPresident = president;
                    if (localPresident == null)
                        localPresident = new OurPresident();
            }
        }

        president = localPresident;
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
