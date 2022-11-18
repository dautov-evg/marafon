package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1,u2,text));
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSendler()==u1 && message.getReciver()==u2 ||
                    message.getSendler()==u2 && message.getReciver()==u1) {
                System.out.println(message.getSendler()+": "+ message.getText());
            }
        }
    }
    public static List<Message> getMessages() {
        return messages;
    }
}
