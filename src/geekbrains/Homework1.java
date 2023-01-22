package geekbrains;
//Task1
//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].
public class Homework1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int maxNumber = 0;
        int minNumber = 300;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random()*301));
            System.out.println(arr[i]);
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("Максимальное значение равно: " + maxNumber);
        System.out.println("Минимальное значение равно: " + minNumber);;
        System.out.printf("Среднее значение равно: " + (double) sum/10);
    }
}

