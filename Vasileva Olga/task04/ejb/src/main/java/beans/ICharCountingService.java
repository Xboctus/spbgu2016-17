package beans;

import java.util.Map;

public interface ICharCountingService {
    public Map<Character, Integer> countWords(String text);
    public String respond();
}
