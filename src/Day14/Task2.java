package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());

    }

    public static List<String> parseFileToStringList() {
        File file = new File("people");
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] stroka = line.split(" ");
                if (Integer.parseInt(stroka[1])<0)
                    throw new IllegalAccessException();

                people.add(line);
            }

            scanner.close();
            return people;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Некорректный входной файл");
        }

    }
}
