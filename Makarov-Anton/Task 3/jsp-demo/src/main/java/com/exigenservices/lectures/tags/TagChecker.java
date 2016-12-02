package com.exigenservices.lectures.tags;

import java.util.Random;

public class TagChecker{
    public  static boolean check(String num){
        Random r= new Random();
        if ((r.nextInt(99)+1)==Integer.parseInt(num))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
