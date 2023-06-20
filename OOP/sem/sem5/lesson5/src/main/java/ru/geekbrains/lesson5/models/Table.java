package ru.geekbrains.lesson5.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private static int counter = 100;
    private final int no;


    private final Collection<Reservation> reservations = new ArrayList<>(); // Коллекция резервов столика

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }

    public void removeReserv(int id) {
        for (Reservation reservation: reservations){
            if (reservation.getId() == id) {
                reservations.remove(reservation);
                System.out.println("Отменена бронь: " + id);
            }
        }
        throw new RuntimeException("Некорректный номер брони.");
    }
}
