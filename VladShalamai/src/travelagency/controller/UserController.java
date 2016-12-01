package travelagency.controller;


import travelagency.db.DataBase;
import travelagency.model.*;
import utils.TravelAgencyUtils;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Влад on 26.11.2016.
 */
public class UserController {

    private DataBase dataBase;
    private static final int CENTS = 100;

    public UserController(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * this method return string which consist all info about tours
     *
     * @return string of tours
     */

    public String showAllTours() {

        StringBuilder sb = new StringBuilder();

        for (Tour tour : dataBase.getTours()) {
            sb.append(tour.toString());
        }

        return sb.toString();
    }

    /**
     * this method add request in list of requests in our database
     * @param id id of tour which user want to buy
     * @param name the name of user
     * @param phone the phone of user
     * @param email the email of user
     */

    public void sendTourRequest(int id, String name, String phone, String email) {

        int count = 0;

        for (Tour tour : dataBase.getTours()) {

            if (tour.getId() == id) {
                count++;
            }
        }

        if (TravelAgencyUtils.validate(name, phone) || count == 0) {
            System.out.println("data incorrect or id does not exist");
            return;
        }

        dataBase.getRequests().add(new Request(id, new MyClient(name, phone, email),
                        new GregorianCalendar()));

    }

    /**
     * this method return string which consist all info about tours which price is less than @param
     * @param price the max price of tour that user want to watch
     * @return string of tours
     */

    public String searchByPrice(long price) {

        StringBuilder sb = new StringBuilder();

        if (price < 0) {
            return null;
        }

        for (Tour tour : dataBase.getTours()) {
            if (tour.getPrice() / CENTS < price) {
                sb.append(tour.toString());
            }
        }

        return sb.toString();
    }

    /**
     * this method return string which consist all info about tours which country is @param
     * @param country the country of tour that user want to watch
     * @return string of tours
     */

    public String searchByCountry(String country) {

        StringBuilder sb = new StringBuilder();

        for (Tour tour : dataBase.getTours()) {
            if (tour.getHotel().getAddress().getCountry().equals(country)) {
                sb.append(tour.toString());
            }
        }

        return sb.toString();
    }

}
