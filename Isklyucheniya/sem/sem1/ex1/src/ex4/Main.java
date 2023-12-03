package ex4;

//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
//целочисленный одномерный массив.
//Метод должен пройтись по каждому элементу и проверить что он не равен null.
//А теперь реализуйте следующую логику:
//1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
//пользователя
//2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
//“подсветить”

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Integer[] array = {1, 2, 3, 4, 5, 6, 7}; // Вариант 1
        Integer[] array = {1, null, 3, null, 5, 6, null}; // Вариант 2
        message(array);
    }
    public static List<Integer> finNull(Integer[] array) { // Ф-ция поиска Null элементов и добавление
        List<Integer> result = new ArrayList<>();          // их в список result
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                result.add(i);
            }
        }
        return result;
    }

    public static void message(Integer[] array) { // Ф-ция, сообщающая об отсут-ии Null элементов или
        List<Integer> result = finNull(array);    // печатающая индексы Null элементов
        if (result.size() == 0) {
            System.out.println("Элментов Null нет");
            return;
        }
        for (Integer i: result) {
            System.out.println(i);
            }
    }
}
