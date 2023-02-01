package Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Task0 {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5);
        System.out.println("Исходный список: " + list1);
        removeEvenValue(list1);
        getMin(list1);
        getMax(list1);
        getAverage(list1);
    }
    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int item: list) {
            if (item % 2 != 0) {
                Collections.addAll(list2, item);
            }
        }
        System.out.println("Удалили четные числа: "  + list2);
        return (list2);
    }

    // Найти минимальное значение
    public static List<Integer> getMin(List<Integer> list1){
        System.out.println("Минимальное значение: " + Collections.min(list1));
        return (list1);
    }

    // Найти максимальное значение
    public static List <Integer> getMax(List<Integer> list1){
        System.out.println("Максимальное значение: " + Collections.max(list1));
        return (list1);
    }

    // Найти среднее значение
    public static List <Integer> getAverage(List<Integer> list1){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int kol = list1.size();
        int sr = 0;
        for(int item: list1) {
            sum += item;
            sr = sum / kol;
        }
        System.out.println("Среднее значение: " + (Collections.singletonList(sr)));
        return (list1);
    }
}