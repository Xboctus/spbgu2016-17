package com.exigenservices.lectures.tags;

/**
 * Utility class
 * Created by bolbin
 * on 07.11.2014.
 */
public class pageChecker {
    private static boolean notVictory =true;
    private static boolean notLose =true;

    public static boolean checkVictory() {
        return notVictory;
    }
    public static boolean checkLose() {
        return notLose;
    }
    public static void setVictory(boolean value){
        notVictory =value;
    }
    public static void setLose(boolean value){
        notLose =value;
    }
}