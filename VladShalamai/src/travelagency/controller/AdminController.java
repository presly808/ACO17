package travelagency.controller;

import travelagency.db.DataBase;
import travelagency.model.Hotel;
import travelagency.model.Request;
import travelagency.model.Tour;
import utils.TravelAgencyUtils;

import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Влад on 28.11.2016.
 */
public class AdminController {

    private DataBase dataBase;
    private static int password = 12345;
    private static final int CENTS = 100;

    public AdminController(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * this method add tour to list of tour in our database
     *
     * @param  name  the name of tour which admin want to add
     * @param  price the price of tour which admin want to add
     * @param  startDate the start date of tour which admin want to add
     * @param  endDate the end date of tour which admin want to add
     * @param  transport the way of transportation
     * @param  hotel the hotel where client will live
     */

    public void addTour(String name, long price, GregorianCalendar startDate, GregorianCalendar endDate, String transport, Hotel hotel) {

        if (TravelAgencyUtils.validate(name) || TravelAgencyUtils.validate(transport) || price < 0 || startDate.equals(endDate)) {
            return;
        }

        dataBase.getTours().add(new Tour(name, price * CENTS, startDate, endDate, transport, hotel));

    }

    /**
     * this method remove tour from list of tour in our database
     *
     * @param  id  the id of tour which admin want to remove
     * @return tour if id exist or null id does not
     */

    public Tour removeTour(int id) {

        for (Tour tour : dataBase.getTours()) {
            if (tour.getId() == id) {
                dataBase.getTours().remove(tour);
                return tour;
            }
        }
        return null;
    }

    /**
     * this method return string which consist all info about requests
     *
     * @return string of requests
     */

    public String showAllRequests() {

        StringBuilder sb = new StringBuilder();

        for (Request request : dataBase.getRequests()) {
            sb.append(request.toString());
        }

        return sb.toString();
    }

    /**
     * this method update price of tour in our database
     *
     * @param  id  the id of tour which admin want to update
     * @param price the new price which admin want to change
     * @return updated tour or null if id does not exist
     */

    public Tour updateTour(int id, long price) {

        for (Tour tour : dataBase.getTours()) {
            if (tour.getId() == id) {
                tour.setPrice(price * CENTS);
                return tour;
            }
        }
        return null;
    }

    /**
     * this method update transport of tour in our database
     *
     * @param  id  the id of tour which admin want to update
     * @param transport the new transport which admin want to change
     * @return updated tour or null if id does not exist
     */

    public Tour updateTour(int id, String transport) {

        for (Tour tour : dataBase.getTours()) {
            if (tour.getId() == id) {
                tour.setTransport(transport);
                return tour;
            }
        }
        return null;
    }

    /**
     * this method update price of tour in our database
     *
     * @param  password  the password which admin want to check
     * @return true id password is the same or false if is not
     */

    public static boolean checkPass(int password) {
        return AdminController.password == password;
    }
}
