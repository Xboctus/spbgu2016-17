package com.exigenservices.lectures;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.HashMap;
import java.util.Map;

@Remote(UserManager.class)
@Stateless(mappedName = "UserManagerSessionBean")
public class UserManagerSessionBean implements UserManager {
    @Override
    public Map<Character, Integer> countLetterAmounts(String text) {
        HashMap<Character, Integer> result = new HashMap<Character, Integer>();
        for(int i = 0; i < text.length(); i++) {
            Integer count = result.get(text.charAt(i));
            if(count == null) {
                result.put(text.charAt(i), 1);
            } else {
                result.put(text.charAt(i), count + 1);
            }
        }
        return result;
    }
}
