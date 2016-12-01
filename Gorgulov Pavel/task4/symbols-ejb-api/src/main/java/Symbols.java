import java.util.HashMap;
import java.util.List;

/**
 * Interface for Message Bean
 */
public interface Symbols {

    String BEAN_NAME = "SymbolsSessionBean";

    /**
     * @return all symbols in a message
     */
    List<Character> getCharMessage();

    void countSymbols();

    HashMap<Character, Integer> getAll();

}
