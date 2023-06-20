package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver { // Класс печати ответов на запросы в консоль

    private final Model tableModel;
    private final View bookingView;
    public BookingPresenter(Model tableModel, View bookingView){
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this); // this - текущего наблюдателя (observer)
    }

    private Collection<Table> loadTables(){   // обращение к моделе и получение всех столиков
        return tableModel.loadTables();
    }

    public void showTables(){
        bookingView.showTables(loadTables());
    }

    public void printReservationTableResult(int reservationId){
        bookingView.printReservationTableResult(reservationId);
    }
    public void printPenReservationTableResult(int reservationId) {
        bookingView.printPenReservationTableResult(reservationId);
    }

    public void printReservationTableError(String errorMessage){
        bookingView.printReservationTableError(errorMessage);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.reservationTable(orderDate, tableNo, name);
            printReservationTableResult(reservationId);
        }
        catch (RuntimeException e){
            printReservationTableError(e.getMessage());
        }

    }

    @Override
    public void penReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.changeReservationTable(oldReservation, reservationDate, tableNo, name);
            printPenReservationTableResult(reservationId);
        }
        catch (RuntimeException e){
            printReservationTableError(e.getMessage());
        }
    }

}
