package Day7;

public class Task1 {
    public static void main (String[] args) {
        Airplane a1 = new Airplane("Tupolev",2020,57,20);
        Airplane a2 = new Airplane("Suhoi",2021,55,21);
        Airplane.compareAirplanes(a1,a2);
    }
}
