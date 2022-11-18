package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Task2 {
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner2 = new Scanner(file);
        double result=0;
        while (scanner2.hasNextLine()) {
            result+=Double.parseDouble(scanner2.nextLine());

        }
        scanner2.close();
        System.out.println(result);
        System.out.println((int)result);
    }
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        // создание и заполнение нового файла(file1.txt)
        File file1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);

        for (int i=0;i<1000;i++) {
            pw1.println(random.nextInt(100));
        }
        pw1.close();


        // создание и заполнение нового файла(file2.txt)
        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        int sum=0;
        int counter=0;
        while (scanner.hasNextLine()) {
            sum+=Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter==20) {
                pw2.println(sum/20.0);

                counter = 0;
                sum = 0;
            }
        }
        pw2.close();
        scanner.close();

        printResult(file2);
    }
}
