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


    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        reservationTable(reservationDate, tableNo, name);
        for (Table table: tables){
            for (Reservation reservation: table.getReservations()){
                if (reservation.getId() == oldReservation)
                    table.getReservations().remove(oldReservation);
                    System.out.println("Отменена бронь: " + oldReservation);
            }

        }

        throw new RuntimeException("Некорректный номер брони.");
    }

    /**
     * TODO: Разработать самостоятельно в рамках домашней работы
     * Поменять бронь столика
     */

        //TODO: Для создания новой брони, можно воспользоваться уже существующим методом reservationTable
}


