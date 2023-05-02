package sem4.DZ.Ochered_LinkedList;
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.*;
public class Ochered_LinkedList {
    public static void main(String[] args) {

        Queue<String> numb = new LinkedList<>();
        numb.add("one");
        numb.add("two");
        numb.add("three");
        numb.add("four");
        numb.add("five");
        System.out.println(numb);

        // Добавляем в конец очереди:
        numb.offer("7");
        System.out.println(numb);

        // Возвращаем первый элемент из очереди и удаляем его:
        System.out.println(numb.poll());
        System.out.println(numb);
        
        // Возвращаем первый элемент из очереди и не удаляя его:
        System.out.println(numb.peek());
        System.out.println(numb);

    }

    // static void enqueue(String numb) {
    //     numb.offer("8");
    //     System.out.println(numb);
    // }

}

