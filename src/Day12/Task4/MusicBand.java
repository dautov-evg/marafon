package Day12.Task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public void printMembers() {
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "Название: " + name + ",год основания: " + year;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2){
        for (String member : band1.getMembers()) {
            band2.getMembers().add(member);
        }
        band1.getMembers().clear();
    }
}
