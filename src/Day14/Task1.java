package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    static void printSumDigits(File file){
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            if (numbersString.length != 10)
                throw new IOException();

            int sum = 0;
            for (String number : numbersString)
                sum += Integer.parseInt(number);

            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException("Некорректный входной файл");
        }
    }
    public static void main(String[] args) {
        File file = new File("tsk1");
        printSumDigits(file);

    }
}
