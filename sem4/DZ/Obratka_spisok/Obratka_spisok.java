package sem4.DZ.Obratka_spisok;
// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список. Я ТАК ПОНЯЛ, ЧТО "ОБРАТНЫЙ ПОРЯДОК".
// Постараться не обращаться к листу по индексам.
// one
// two
// three
// four
// five

import java.util.*;
import java.util.LinkedList;
public class Obratka_spisok {
    public static void main(String[] args) {
          
        LinkedList<String> numb = new LinkedList<String>();
        numb.add("one");
        numb.add("two");
        numb.add("three");
        numb.add("four");
        numb.add("five");
        System.out.println("\nSource List: " + numb);
        reverseList(numb);
    }
    static void reverseList(LinkedList<String> numb) {

        // первый способ:
        LinkedList<String> new_numb = new LinkedList<String>();
        for(String n : numb) {
            new_numb.addFirst(n);
        }
        System.out.println("First way: " + new_numb);

        // или:
        LinkedList<String> new_numb2 = new LinkedList<String>();
        Iterator<String> col = numb.iterator();
        while (col.hasNext()) {
            new_numb2.addFirst(col.next());
        }
        System.out.println("Second way: " + new_numb + "\n");
    }  
}
