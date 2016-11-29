package com.exigenservices.lectures.tags;

public class pageChecker {
    private static boolean lose =true;
    private static boolean win =true;

    public static boolean checkVictory() {
        return lose;
    }
    public static boolean checkLose() {
        return win;
    }
    public static void setVictory(boolean value){
        lose = value;
    }
    public static void setLose(boolean value){
        win = value;
    }
}