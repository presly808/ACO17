package week3.Tour.controllers;

import week3.Tour.dataBase.DataBase;
import week3.Tour.model.MyDate;
import week3.Tour.model.Tour;

public class AdminController implements IAdminController {

    public DataBase bs;

    private int size = 0;

    @Override
    public void addTour(Tour tour) {
        bs.tours[size] = tour;
        size++;
    }

    @Override
    public void removeTour(int id) {
        for (int i = 0; i < size; i++) {
            if (bs.tours[i].getIdTour() == id && bs.tours[i] != null) {
                bs.tours[i] = null;
                size--;
            }
        }
    }

    @Override
    public String getAllRequest() {
        String requests = "";
        for (int i = 0; i < bs.request.size(); i++) {
            requests += bs.request.get(i) + "\n";
        }

        return requests;
    }

    @Override
    public void updateTour(int id, long price) {
        for (int i = 0; i <bs.tours.length ; i++) {
            if(id == bs.tours[i].getIdTour()&& bs.tours[i]!= null){
                bs.tours[i].setPrice(price);
            }
        }
    }

    @Override
    public void updateTour(int id, int startDateDay, int startDateMonth, int startDateYear,
                           int endDateDay, int endDateMonth, int endDateYear) {
        for (int i = 0; i <bs.tours.length ; i++) {
            if(id == bs.tours[i].getIdTour()&& bs.tours[i]!= null){
                bs.tours[i].setStartDate(new MyDate(startDateDay, startDateMonth, startDateYear));
                bs.tours[i].setEndDate(new MyDate(endDateDay, endDateMonth, endDateYear));
            }
        }
    }

}
