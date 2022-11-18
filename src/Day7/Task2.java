package Day7;

public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player(99);
        Player p2 = new Player(98);
        Player p3 = new Player(97);
        Player.info();
        Player p4 = new Player(96);
        Player p5 = new Player(95);
        Player p6 = new Player(94);
        Player.info();
        Player p7 = new Player(90);
        Player.info();
        for (int i=0;i<97;i++) {
            p3.run();
        }
        Player.info();
    }
}
