package sem3.DZ.spisok_planet;
// Заполнить список названиями планет Солнечной системы
// (Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун) в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
// Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Spisok_planet {
    public static void main(String[] args) {
        List<String> list = List.of("Mercury", "Venus", "Earth", "Mars", "Mercury", "Saturn",
                                                "Earth", "Jupiter", "Saturn", "Uranus", "Neptune", "Uranus", "Venus", "Earth"); 
        System.out.println();
        for (String i : list) { System.out.print(i + ", "); }
        System.out.println("\n");

        int n_Mercury = 0;
        int n_Venus = 0;
        int n_Earth = 0;
        int n_Mars = 0;
        int n_Jupiter = 0;
        int n_Saturn = 0;
        int n_Uranus = 0;
        int n_Neptune = 0;

        for (String j : list) {
            if (j == "Mercury") { n_Mercury += 1;}
            if (j == "Venus") { n_Venus += 1;}
            if (j == "Earth") { n_Earth += 1;}
            if (j == "Mars") { n_Mars += 1;}
            if (j == "Jupiter") { n_Jupiter += 1;}
            if (j == "Saturn") { n_Saturn += 1;}
            if (j == "Uranus") { n_Uranus += 1;}
            if (j == "Neptune") { n_Neptune += 1;}
        }
        System.out.println("Mercury - " + n_Mercury);
        System.out.println("Venus - " + n_Venus);
        System.out.println("Earth - " + n_Earth);
        System.out.println("Mars - " + n_Mars);
        System.out.println("Jupiter - " + n_Jupiter);
        System.out.println("Saturn - " + n_Saturn);
        System.out.println("Uranus - " + n_Uranus);
        System.out.println("Neptune - " + n_Neptune);
    }
}
