package ru.geekbrains.lesson5.models;

import ru.geekbrains.lesson5.presenters.Model;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;


    /**
     * Получить все столики
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null)
        {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name); // создан резерв с указанием даты и имя
                table.getReservations().add(reservation); // добавление нов.резерва к резервам в рамках этого столика
                return reservation.getId(); // вывод номера резерва
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    @Override
    public int chchangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        table.removeReserv(oldReservation);

        BookingView bookingView = new BookingView();
        bookingView.reservationTable(reservationDate, tableNo, name);
        return 0;
    }

    /**
     * TODO: Разработать самостоятельно в рамках домашней работы
     * Поменять бронь столика
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        table.removeReserv(oldReservation);

        BookingView bookingView = new BookingView();
        bookingView.reservationTable(reservationDate, tableNo, name);
        return 0;
    }
        //...
        //TODO: Для создания новой брони, можно воспользоваться уже существующим методом reservationTable
}


