package Day13;

import java.util.Date;

public class Message {
    private User sendler;
    private User reciver;
    private String text;
    private Date date;

    public Message(User sendler, User reciver, String text) {
        this.sendler = sendler;
        this.reciver = reciver;
        this.text = text;
        this.date = new Date();
    }

    public User getSendler() {
        return sendler;
    }

    public User getReciver() {
        return reciver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + sendler + "\n" +
                "TO: " + reciver + "\n" +
                "ON: " + date+ "\n" + text + "\n" ;
    }
}
