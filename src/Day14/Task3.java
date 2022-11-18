package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
        System.out.println(parseFileToObjList().get(5));
    }

    public static List<Human> parseFileToObjList() {
        List<Human> listHuman = new ArrayList<>();
        File file = new File("people");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] stroka = line.split(" ");
                if (Integer.parseInt(stroka[1]) < 0)
                    throw new IllegalAccessException();

                Human currentHuman = new Human(stroka[0],Integer.parseInt(stroka[1]));
                listHuman.add(currentHuman);

            }
            scanner.close();
            return listHuman;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Некорректный входной файл");
        }


    }
}
