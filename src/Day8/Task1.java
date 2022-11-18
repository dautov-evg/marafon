package Day8;

public class Task1 {
    public static void main (String[] args) {
        long before = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<20001;i++) {
            sb.append(i+" ");
        }
        System.out.println(sb.toString());
        long after = System.currentTimeMillis();
        System.out.println(after-before);
    }
}
