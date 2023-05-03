package sem4.DZ.Ochered_LinkedList;
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.*;
// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.LinkedList;
public class Ochered_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ls = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        enqueue(ls, sc.nextInt());
        dequeue(ls);
        first(ls);
        
        


        sc.close();
    }

    static void enqueue(LinkedList<Integer> ls, int element) {
        ls.add(element);
        System.out.println("Queue with element added to the end: " + ls);
    }

    static int dequeue(LinkedList<Integer> ls) {
        int m = ls.getFirst();
        ls.removeFirst();
        System.out.println("Output of the first element: " + m);
        System.out.println("A queue with no first element: " + ls);
        return m;
    }

    static int first(LinkedList<Integer> ls) {
        int m = ls.getFirst();
        System.out.println("Output of the first element: " + m);
        System.out.println("Queue output: " + ls);
        return m;
    }
}


