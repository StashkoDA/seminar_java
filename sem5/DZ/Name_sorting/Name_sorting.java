package sem5.DZ.Name_sorting;

// Пусть дан список сотрудников:
// Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
// Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
// Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
// Для сортировки использовать TreeMap.

import java.util.*;
public class Name_sorting {
    public static void main(String[] args) {
        String line = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " + 
        "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, " + 
        "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";
        line = line.replace(".", ""); // заменяем "." на пустышку ""
        String[] words = line.split(", "); // создаём массив строк (имя фамилия)
        ArrayList<String> name = new ArrayList<String>(); // создаём пустой список строк и заполняем его именами
        for (String word : words) {
            String[] line_word = word.split(" ");
            
            for (int i = 0; i < line_word.length; i++) {
                if (i == 0) {
                    name.add(line_word[i]);
                }
            }
        }
        // for (String n : name) {
        //     System.out.println(n);
        // }
        Map<String, Integer> map = new TreeMap<>(Comparator.reverseOrder()); // обратная сортировка
        for (String n : name) {
                if (map.containsKey(n)){    // проверяем есть ли элемент с таким ключом
                    
                    map.replace(n, map.get(n) + 1);
                } else {
                    int count = 1; // если нет такого элемента, то добавляем его с новым ключом

                    map.put(n, count);
                }
        }
        //System.out.println(map);

        Map<Integer, List<String>> map2 = new TreeMap<>(Comparator.reverseOrder()); // обратная сортировка
        for(Map.Entry<String, Integer> item : map.entrySet()){
            if (map2.containsKey(item.getValue())){    // проверяем есть ли элемент с таким ключом
                List<String> list = map2.get(item.getValue()); // достаём существующий список list  по ключу значения map
                list.add(item.getKey()); // добавляем в этот список новое подходящее имя с такиже количеством повтора   
                
            } else {
                List<String> list = new ArrayList<>(); // если нет такого элемента, то добавляем его с ключом - новое имя,
                                                        // значение - кол-во повторов
                
                list.add(item.getKey());
                map2.put(item.getValue(), list);
            }  
        }
        System.out.println("\nУпорядоченный по убыванию повтора список имён:\n" + map2 + "\n");
    }
}

