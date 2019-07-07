package com.javarush.task.task21.task2113;

import java.util.LinkedList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    private void move(){
        for (Horse hours:
             horses) {
            hours.move();
        }
    }

    private void print(){
        for (Horse hours:
             horses) {
            hours.print();
        }
        for (int i = 0; i < 10; i++)
            System.out.println("");


    }

    public void run() {
        try{
        for (int i = 0; i < 100; i++){
            this.move();
            this.print();
            Thread.sleep(200);
        }
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }

    public Horse getWinner(){
        Horse winner = horses.get(0);
        for (Horse horse:
             horses) {
            if ((horse.getDistance() > winner.getDistance())) {
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName()+ "!");
    }

    public static void main(String[] args) {
        Horse h1 = new Horse("Bibi", 3, 0);
        Horse h2 = new Horse("Mimi", 3, 0);
        Horse h3 = new Horse("Kiki", 3, 0);
        List<Horse> lh = new LinkedList<>();
        lh.add(h1);
        lh.add(h2);
        lh.add(h3);
       // game = new Hippodrome(lh);
       // game.run();
       // game.printWinner();
        String s ="1";
        System.out.println(s.hashCode());
    }
}
