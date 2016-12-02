package com.exigenservices.lectures.util;

import org.apache.commons.lang.StringUtils;


public final class ViewHelper {

    private ViewHelper() { }
    
    public static String getValuesAsString() {
        return StringUtils.join(InMemoryStorage.getValues(), "<br/>");
    }
}
