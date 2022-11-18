package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> marks = new ArrayList<>();
        marks.add("toyata");
        marks.add("subaru");
        marks.add("suzuki");
        marks.add("mersedes");
        marks.add("lada");
        System.out.println(marks);

        marks.add(2,"GOVNO");
        marks.remove(0);
        System.out.println(marks);
    }
}
