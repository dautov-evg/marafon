package Day7;
public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public int getStamina() {
        return stamina;
    }
    public void run() {
        if (stamina==MIN_STAMINA) {
            return;
        }
        stamina--;
        if (stamina==0) {
            countPlayers--;
        }
    }
    public static void info () {
        if (countPlayers<6) {
            System.out.println("Команды не полные, на поле есть еще " + (6-countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
    public Player(int stamina) {
        this.stamina=stamina;
        if ( countPlayers<6) {
            countPlayers++;
        }
    }
}
