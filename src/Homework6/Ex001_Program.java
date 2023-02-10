package Homework6;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.entry;

// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
//     ноутбуки, отвечающие фильтру.
//     Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class Ex001_Program {

    public static void main(String[] args) {

        NoteBook w1 = new NoteBook();
        w1.manufacture = "DELL";
        w1.model = "N7110";
        w1.ram = "16";
        w1.hdd = "512";
        w1.processor = "i7";

        NoteBook w2 = new NoteBook();
        w2.manufacture = "Acer";
        w2.model = "K560";
        w2.ram = "8";
        w2.hdd = "1024";
        w2.processor = "i5";

        NoteBook w3 = new NoteBook();
        w3.manufacture = "HP";
        w3.model = "kix";
        w3.ram = "16";
        w3.hdd = "1024";
        w3.processor = "i3";

        NoteBook w4 = new NoteBook();
        w4.manufacture = "DELL";
        w4.model = "N7110";
        w4.ram = "16";
        w4.hdd = "512";
        w4.processor = "i7";

        var noteBooks = new HashSet<>(Arrays.asList(w1, w2, w3, w4));
        System.out.println(noteBooks);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, String.valueOf(w1));
        map.put(2, String.valueOf(w2));
        map.put(3, String.valueOf(w3));
        map.put(4, String.valueOf(w4));

        Map<Integer, String> filteredMap = map.entrySet()
                .stream().filter(x -> "DELL N7110 16 i7".equals(x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Filtered map: " + filteredMap);

        System.out.println(w1.getModel());
    }
}




