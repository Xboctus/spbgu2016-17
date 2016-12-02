package com.exigenservices.lectures;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.HashMap;
import java.util.Map;

/**
 * task4 bean implementation
 *
 * Created by bolbin on 23.11.2014.
 */
@Remote(task4.class)
@Stateless(mappedName = "task4SessionBean")
public class task4SessionBean implements task4 {
    @Override
    public Map<Character, Integer> countLetterAmounts(String text) {
        HashMap<Character, Integer> queryResult = new HashMap<Character, Integer>();
        for(int i = 0; i < text.length(); i++) {
            Integer charOccurences = queryResult.get(text.charAt(i));
            if(charOccurences == null) {
                queryResult.put(text.charAt(i), 1);
            } else {
                queryResult.put(text.charAt(i), charOccurences + 1);
            }
        }
        return queryResult;
    }
}
