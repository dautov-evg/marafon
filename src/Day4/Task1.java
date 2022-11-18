package Day4;/*
С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными
числами от 0 до 10 (включительно). Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль
информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]

Информация о массиве:
Длина массива: 10
Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46
*/
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int more8=0;
        int equally1=0;
        int chet=0;
        int neChet=0;
        System.out.println("Введите длину массива");
        int n = scan.nextInt();
        int[] massiv = new int[n];
        for (int i=0;i<n;i++) {
            massiv[i]= rand.nextInt(11);
            sum+=massiv[i];
            if (massiv[i]>8) {
                more8++;
            }
            if (massiv[i]==1) {
                equally1++;
            }
            if (massiv[i]%2==0 && massiv[i]>0) {
                chet++;
            }
            if (massiv[i]%2!=0) {
                neChet++;
            }
            System.out.print(massiv[i]+" ");
        }
        System.out.println();
        System.out.println("Информация о массиве");
        System.out.println("Длина массива: "+massiv.length);
        System.out.println("Количество чисел больше 8: "+more8);
        System.out.println("Количество чисел равных 1: "+equally1);
        System.out.println("Количесвто четных чисел: "+chet);
        System.out.println("Количесвто нечетных чисел: "+neChet);
        System.out.println("Сумма всех элементов массива: "+sum);
    }
}
