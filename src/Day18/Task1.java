package Day18;

public class Task1 {
    public static void main(String[] args) {
        int [] numbers = { 1 , 10 , 1241 , 50402 , - 50 , 249 , 10215 , 665 , 2295 , 7 , 311 };
        System.out.println(recursionSum(numbers,0)); // 65346
    }
    public static int recursionSum(int[] arr, int i) {
        if (i== arr.length)
            return 0;

        return arr[i]+recursionSum(arr, i+1);
    }
}
