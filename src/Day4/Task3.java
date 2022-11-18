package Day4;/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8
(m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки, сумма чисел в которой
максимальна. Если таких строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):

3 2 1 5 7 	// сумма - 18
1 2 5 6 2 	// сумма - 16
3 4 9 6 4	// сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
*/
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int m=12;
        int n=8;
        int arr[][] = new int[m][n];
        for (int i=0;i< arr.length;i++) {
            for (int j=0; j<arr[i].length;j++) {
                arr[i][j]= rand.nextInt(51);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Сумма:");
        int maxIndex[] = new int[m];
        for (int i=0;i< arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                maxIndex[i]+=arr[i][j];
            }
            System.out.print(maxIndex[i]+" ");
        }
        System.out.println();
        int iMax=0;
        for (int i=0;i<maxIndex.length;i++) {
            if (maxIndex[iMax]<maxIndex[i]) {
                iMax=i;
            }
        }
        System.out.println("Ответ: "+iMax);
    }
}
