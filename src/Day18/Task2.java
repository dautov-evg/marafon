package Day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(113 )); // 5
    }
    public static int count7 (int chislo) {
        if (chislo==0)
            return 0;

        if (chislo % 10 == 7 )
            return 1 + count7(chislo/10);
        else
            return count7(chislo/10);
    }
}
