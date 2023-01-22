package Homework1;
//Task2
//Реализуйте алгоритм сортировки пузырьком для сортировки массива
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Исходный массив: ");
        int[] arr = new int[10];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 301));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}