package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zone = new Zerg();
        Zerg zone1 = new Zerg();
        Zerg zone2 = new Zerg();
        Zerg zone3 = new Zerg();
        Zerg zone4 = new Zerg();
        Zerg zone5 = new Zerg();
        Zerg zone6 = new Zerg();
        Zerg zone7 = new Zerg();
        Zerg zone8 = new Zerg();
        Zerg zone9 = new Zerg();

        zone.name = "ZERG";
        zone1.name = "ZERG1";
        zone2.name = "ZERG2";
        zone3.name = "ZERG3";
        zone4.name = "ZERG4";
        zone5.name = "ZERG5";
        zone6.name = "ZERG6";
        zone7.name = "ZERG7";
        zone8.name = "ZERG8";
        zone9.name = "ZERG9";

        Protoss pone = new Protoss();
        Protoss pone1 = new Protoss();
        Protoss pone2 = new Protoss();
        Protoss pone3 = new Protoss();
        Protoss pone4 = new Protoss();

        pone.name = "PROTOS";
        pone1.name = "PROTOS1";
        pone2.name = "PROTOS2";
        pone3.name = "PROTOS3";
        pone4.name = "PROTOS4";

        Terran tone = new Terran();
        Terran tone1 = new Terran();
        Terran tone2 = new Terran();
        Terran tone3 = new Terran();
        Terran tone4 = new Terran();
        Terran tone5 = new Terran();
        Terran tone6 = new Terran();
        Terran tone7 = new Terran();
        Terran tone8 = new Terran();
        Terran tone9 = new Terran();
        Terran tone10 = new Terran();
        Terran tone11 = new Terran();

        tone.name = "TERRANS";
        tone1.name = "TERRANS1";
        tone2.name = "TERRANS2";
        tone3.name = "TERRANS3";
        tone4.name = "TERRANS4";
        tone5.name = "TERRANS5";
        tone6.name = "TERRANS6";
        tone7.name = "TERRANS7";
        tone8.name = "TERRANS8";
        tone9.name = "TERRANS9";
        tone10.name = "TERRANS10";
        tone11.name = "TERRANS11";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
