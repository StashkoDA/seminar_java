package ru.geekbrains.lesson5.presenters;

import java.util.Date;

public interface ViewObserver {    // Наблюдатель за представлением

    void onReservationTable(Date orderDate, int tableNo, String name); // кто-то захотел зарезервировать столик

    // кто-то захотел перерезервировать столик:
    void penReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
