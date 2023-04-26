package sem3.DZ.spisok_chotnie;
// Пусть дан произвольный список целых чисел, удалить из него четные числа/

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class SpisokChotnie {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(); // создаём список чисел

        numbers.add(9);
        numbers.add(14);
        numbers.add(100);
        numbers.add(33);
        numbers.add(36);
        
        System.out.println("Unsorted List: " + numbers); // печать списка
        
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) { // перебираем список
            Integer number = iterator.next();
            if (number % 2 == 0) {
                System.out.println("This is Even Number: " + number);
                iterator.remove(); // удаляем чётное число
            }
        }
        System.out.println("No even numbers: " + numbers); // без чётных чисел
    }
}
