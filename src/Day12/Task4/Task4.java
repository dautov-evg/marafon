package Day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> team1 = new ArrayList<>();
        team1.add("tom");
        team1.add("john");
        team1.add("ron");
        MusicBand band1 = new MusicBand("Анигиляторная пушка",2020,team1 );

        List<String> team2 = new ArrayList<>();
        team2.add("хуй");
        team2.add("член");
        team2.add("пенис");
        MusicBand band2 = new MusicBand("Залупа",2021,team2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();
    }
}
