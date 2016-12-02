package beans;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.HashMap;
import java.util.Map;

@Remote(ICharCountingService.class)
@Stateless(mappedName = "StandartCharCountingBean")
public class StandartCharCountingBean implements ICharCountingService {

    @Override
    public Map<Character, Integer> countWords(String text) {
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

    @Override
    public String respond() {
        return "result";
    }
}
