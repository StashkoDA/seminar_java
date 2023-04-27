package sem3.DZ.SpisokMinMaxSredn;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

import java.util.*;
public class SpisokMinMaxSredn {
    public static void main(String[] args) {

        // Вывод списка вариант 1:
        List<Integer> list = List.of(12, 100, 3, 55, 9, 77);
        for (int i : list) { System.out.print(i + " "); }
        System.out.println();

        // Вывод списка вариант 2:
        // Iterator<Integer> col = list.iterator();
        // while (col.hasNext()) {
        //     System.out.print(col.next() + " ");
        // }
        // System.out.println();
    }
}
