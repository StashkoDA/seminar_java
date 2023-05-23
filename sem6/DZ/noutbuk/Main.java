package sem6.DZ.noutbuk;

import java.util.*;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев,
// сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
// Работу сдать как обычно ссылкой на гит репозиторий
// P.S. Частые ошибки смотри в конце семинара

import java.util.ArrayList;
import java.util.List;
public class Noutbuk {
    private int osu;
    private int zd;
    private String os;
    private String color;
    private String madeIn;

    public Noutbuk(int osu, int zd, String os, String color, String madeIn) {
        this.osu = osu;
        this.zd = zd;
        this.os = os;
        this.color = color;
        this.madeIn = madeIn;
    }


    public class Main {
        public static void main(String[] args) {
            Noutbuk nout1 = Noutbuk(2; );
        }
    }
}
