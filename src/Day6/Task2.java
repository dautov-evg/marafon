package Day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Tupolev", 2015, 100, 20);
        airplane.info();
        airplane.fillUp(20);
        airplane.setYear(2017);
        airplane.setLength(115);
        airplane.info();
        airplane.fillUp(15);
        airplane.info();
    }
}
