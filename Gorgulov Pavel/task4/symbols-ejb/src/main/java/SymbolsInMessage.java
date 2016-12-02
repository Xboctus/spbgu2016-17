import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.*;


/**
 * Symbols bean implementation
 */
@Remote(Symbols.class)
@Stateless(mappedName = Symbols.BEAN_NAME)
public class SymbolsInMessage implements Symbols {

    private String message = Message.getMessage().toLowerCase();
    private char[] symbolsArray = message.toCharArray();
    private List<Character> sym = new ArrayList<Character>();
    private List<Character> messageList = new ArrayList<Character>();
    private Map<Character, Integer> sad = new HashMap<Character, Integer>();

    @Override
    public List<Character> getCharMessage() {


        for (char s : symbolsArray) {
            if (!sym.contains(s))
                sym.add(s);
            messageList.add(s);
        }

        return sym;
    }


    @Override
    public void countSymbols() {

        int count;
        for (char s : sym) {
            count = Collections.frequency(messageList, s);
            sad.put(s, count);
        }
    }

    @Override
    public HashMap<Character, Integer> getAll() {
        return (HashMap<Character, Integer>) sad;
    }
}
