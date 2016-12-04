package travelagency.controller;

import travelagency.db.DataBase;
import travelagency.db.IDataBase;
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

    private IDataBase dataBase;
    private static int password = 12345;

    public AdminController(IDataBase dataBase) {
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

        dataBase.addTour(name, price, startDate, endDate, transport, hotel);

    }

    /**
     * this method remove tour from list of tour in our database
     *
     * @param  id  the id of tour which admin want to remove
     * @return tour if id exist or null id does not
     */

    public Tour removeTour(int id) {

        return dataBase.removeTour(id);
    }

    /**
     * this method return string which consist all info about requests
     *
     * @return string of requests
     */

    public String showAllRequests() {

        return dataBase.getRequests();
    }

    /**
     * this method update price of tour in our database
     *
     * @param  id  the id of tour which admin want to update
     * @param price the new price which admin want to change
     * @return updated tour or null if id does not exist
     */

    public Tour updateTour(int id, long price) {

        if (price <= 0) {
            return null;
        }

        return dataBase.updateTour(id, price);
    }

    /**
     * this method update transport of tour in our database
     *
     * @param  id  the id of tour which admin want to update
     * @param transport the new transport which admin want to change
     * @return updated tour or null if id does not exist
     */

    public Tour updateTour(int id, String transport) {

        return dataBase.updateTour(id, transport);
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
