package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country{

    @Override
    int getCountOfEggsPerMonth() {
        return 75;
    }

    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
