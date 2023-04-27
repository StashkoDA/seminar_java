package sem3.DZ.SpisokMinMaxSredn;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class SpisokMinMaxSredn {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>(); // создаём список чисел

        numbers.add(9);
        numbers.add(14);
        numbers.add(100);
        numbers.add(33);
        numbers.add(36);

        System.out.println("List: " + numbers); // печать списка

        Iterator<Integer> col = numbers.iterator();
        double max = 0;
        double sum = 0;
        double size = numbers.size();
        while (col.hasNext()) {
            double numb = col.next();
            if (numb > max) { max = numb; }
            sum += numb;
        }
        double min = max;
        Iterator<Integer> col2 = numbers.iterator();
        while (col2.hasNext()) {
            double numb = col2.next();
            if (numb < min) { min = numb; }
        }

        double average = sum/size;
        System.out.println("max = " + max + ", " + "min = " + min + ", " + "average = " + average);
    }
}
