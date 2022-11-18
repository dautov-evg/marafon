package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void printResult (File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] fileString = scanner.nextLine().split(" ");
            int sum=0;
            for (String s : fileString) {
                sum+=Integer.parseInt(s);
            }
            double srarif =(double) sum/fileString.length;
            DecimalFormat df = new DecimalFormat("##.###");


            System.out.println(srarif+" --> "+df.format(srarif));
            System.out.printf(srarif + " --> %.3f", srarif );

            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        }


    }
    public static void main(String[] args) {
        File file = new File("tsk1");
        printResult(file);

    }
}
