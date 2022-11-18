package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("shoes.csv");
        File file2 = new File("missing_shoes.txt");
        Scanner sc = new Scanner(file1);
        PrintWriter pw = new PrintWriter(file2);

        while (sc.hasNextLine()) {
            String[] str = sc.nextLine().split(";");
            if (Integer.parseInt(str[2])==0) {
                pw.println(str[0]+", "+str[1]+", "+str[2]);

            }
        }
        sc.close();
        pw.close();
    }
}
