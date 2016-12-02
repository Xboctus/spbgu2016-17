/**
 *  Transfer Message Object
 *
 */
public class Message {

    private static String messageUser;

    public Message(String messageUser) {
        Message.messageUser = messageUser;
    }

    public static String getMessage() {
        return messageUser;
    }

    public void setMessage(String messageUser) {
        Message.messageUser = messageUser;
    }
}
