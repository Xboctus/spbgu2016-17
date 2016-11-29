package com.exigenservices.lectures.tags;

/**
 * Created by Danka Shkolnik on 28.11.2016.
 */
public class Checker {
    public static int numberChecker(String enteredNumber) {
       if ((tryParse(enteredNumber) != null) &&(tryParse(enteredNumber) >= 0)&&(tryParse(enteredNumber)<=100)){
        int Number = Integer.parseInt(enteredNumber);
        if (Number == 1 + (int) (Math.random() * ((100 - 1) + 1))) {
            return 0;
        } else {
            return 1;
        }

    }else return -1;
    }
    public static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
