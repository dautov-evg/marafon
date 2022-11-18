package Day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Petr");
        User u2 = new User("Sasha");
        User u3 = new User("Andry");


        u1.sendMessage(u2,"Hi");
        u1.sendMessage(u2,"Pidor");

        u2.sendMessage(u1,"Hi!");
        u2.sendMessage(u1,"Hueos");
        u2.sendMessage(u1,"Ebani");

        u3.sendMessage(u1, "Sosi");
        u3.sendMessage(u1,"Hui");
        u3.sendMessage(u1,"Ne mitiy");

        u1.sendMessage(u3,"Chlen");
        u1.sendMessage(u3,"Petuh");
        u1.sendMessage(u3,"zalupa");

        u3.sendMessage(u1,"PNH");

        u1.subscribe(u3);

        u3.subscribe(u1);
        System.out.println(u3);
        System.out.println(u1);
        System.out.println(u1.isSubscribed(u3));
        System.out.println(u3.isSubscribed(u1));


    }
}
