package Day12.Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("ZALUPA1",1995);
        MusicBand band2 = new MusicBand("ZALUPA2",1990);
        MusicBand band3 = new MusicBand("ZALUPA3",2020);
        MusicBand band4 = new MusicBand("ZALUPA4",1999);
        MusicBand band5 = new MusicBand("ZALUPA5",2001);
        MusicBand band6 = new MusicBand("ZALUPA6",2015);
        MusicBand band7 = new MusicBand("ZALUPA7",1995);
        MusicBand band8 = new MusicBand("ZALUPA8",1996);
        MusicBand band9 = new MusicBand("ZALUPA9",2000);
        MusicBand band10 = new MusicBand("ZALUPA10",2001);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        System.out.println(groupsAfter2000(musicBands));


    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear()>2000) {
                musicBandsAfter2000.add(band);
            }
        }
        return musicBandsAfter2000;
    }
}
