package travelagency.controller;

import travelagency.db.DataBase;
import travelagency.model.Hotel;
import travelagency.model.MyDate;
import travelagency.model.Tour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Влад on 28.11.2016.
 */
public class AdminController {

    DataBase dataBase;
    Pattern pattern = Pattern.compile("[^a-zA-Z\\s]");

    public AdminController(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void addTour(String name, long price, MyDate startDate, MyDate endDate, String transport, Hotel hotel) {

        Matcher matcherName = pattern.matcher(name);
        Matcher matcherTransport = pattern.matcher(transport);

        if (matcherName.find() || matcherTransport.find() || price < 0 || startDate.equals(endDate)) {
            return;
        }

        dataBase.getTours().add(new Tour(name, price * 100, startDate, endDate, transport, hotel));

    }

    public  Tour removeTour(int id) {

        for (Tour tour : dataBase.getTours()) {
            if (tour.getId() == id) {
                dataBase.getTours().remove(tour);
                return tour;
            }
        }
        return null;
    }
}
