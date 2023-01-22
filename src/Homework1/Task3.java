package Homework1;
//Task3
//Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[99];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i + 2;
//            System.out.print(arr[i] + " ");
            if ((arr[i] % 1 == 0) && (arr[i] % arr[i] == 0)) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}



