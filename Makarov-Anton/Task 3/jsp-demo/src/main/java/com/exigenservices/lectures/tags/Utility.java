package com.exigenservices.lectures.tags;

/**
 * Created by ГОБУ СПО ЛОККиИ on 01.11.2016.
 */

public class Utility {


    public static boolean validateUrl(String url) {
        return url != null &&
                (url.startsWith("http://") || url.startsWith("https://"));
    }
}