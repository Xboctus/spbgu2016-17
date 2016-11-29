package com.exigenservices.lectures.tags;

/**
 * Created by Дарья on 29.11.2016.
 */

public class MyChecker {
    private static boolean havePlayed = false;
    public static boolean checkNumber(String enteredNumber) {
        int Number = Integer.parseInt(enteredNumber);
        if (Number == 1 + (int) (Math.random() * ((100 - 1) + 1))) {
            return true;
        } else {
            return false;
        }
    }
    public static void setPlay(boolean value){
        havePlayed = value;
    }
    public static boolean getPlay(){
        return havePlayed;
    }

}