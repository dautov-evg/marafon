package Day4;/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение
суммы и индекс первого элемента тройки.

Пример:
*Для простоты пример показан на массиве размера 10

[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]

Тройка с максимальной суммой: [8742, 1040, 3254]

Вывод в консоль:
13036
7

*Пояснение. Первое число - сумма тройки [8742, 1040, 3254]. Второе число - индекс первого элемента тройки,
то есть индекс числа 8742.
*/
import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n=100;
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++) {
            arr[i] = rand.nextInt(10001);
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int indexMax=0;
        int maxSum=0;
        for (int i=0;i< arr.length-2;i++) {
            if ((arr[i]+arr[i+1]+arr[i+2])>maxSum) {
                maxSum=(arr[i]+arr[i+1]+arr[i+2]);
                indexMax=i;
            }
        }
        System.out.println("Сумма тройки: "+maxSum);
        System.out.println("Индекс первого элемента тройки: "+indexMax);
    }
}
