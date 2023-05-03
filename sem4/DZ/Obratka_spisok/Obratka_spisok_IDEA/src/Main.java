// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;
public class Main {

    // import java.util.Scanner;
// import java.util.Arrays;
// import java.util.LinkedList;

    public static void main(String[] args) {

        LinkedList<Integer> num = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        enqueue(num, sc.nextInt());
        System.out.println(num);
        sc.close();

    static void enqueue(LinkedList<Integer> num, int elem) {
        num.add(elem);
    }


    }
}