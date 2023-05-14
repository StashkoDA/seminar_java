package sem4.DZ.Sum_Iterator;
// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор.

import java.util.*;

public class Sum_Iterator {
    public static void main(String[] args) {
        LinkedList<Integer> numb = new LinkedList<Integer>();
        numb.add(300);
        numb.add(44);
        numb.add(99);
        numb.add(-1000);
        System.out.println(numb);

        Iterator<Integer> col = numb.iterator();
        int sum = 0;
        while (col.hasNext()) {
            sum += col.next();
        }
        System.out.println("Summa = " + sum );
        System.out.println();
    }
}
