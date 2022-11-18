package Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Залупочёс",22));
        members1.add(new MusicArtist("Членосос", 20));
        members1.add(new MusicArtist("Хуеглот",45));
        MusicBand ban1 = new MusicBand("Понос", 2022,members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("penis",25));
        members2.add(new MusicArtist("chlen",54));
        members2.add(new MusicArtist("norm",33));
        MusicBand ban2 = new MusicBand("pedro21",2021,members2);

        /*
        ban1.printMembers();
        ban2.printMembers();

        MusicBand.transferMembers(ban1,ban2);
        ban1.printMembers();
        ban2.printMembers();
        */

        System.out.println(ban1);
    }
}
