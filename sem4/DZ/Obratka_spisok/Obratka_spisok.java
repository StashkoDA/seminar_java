package sem4.DZ.Obratka_spisok;
// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список. Я ТАК ПОНЯЛ, ЧТО "ОБРАТНЫЙ ПОРЯДОК".
// Постараться не обращаться к листу по индексам.
// one
// two
// three
// four
// five

import java.util.LinkedList;
public class Obratka_spisok {
    public static void main(String[] args) {
          
        LinkedList<String> numb = new LinkedList<String>();
        numb.add("one");
        numb.add("two");
        numb.add("three");
        numb.add("four");
        numb.add("five");
        System.out.println(numb);

        LinkedList<String> new_numb = new LinkedList<String>();
        for(String n : numb) {
            new_numb.addFirst(n);
        }
        System.out.println(new_numb);
    }   
}
