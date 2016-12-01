package travelagency.controller;


import travelagency.db.DataBase;
import travelagency.model.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Влад on 26.11.2016.
 */
public class UserController {

    private DataBase dataBase;
    private Pattern patternName = Pattern.compile("[^a-zA-Z\\s]");
    private Pattern patternPhone = Pattern.compile("[^0-9]");

    public UserController(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String showAllTours() {

        StringBuilder sb = new StringBuilder();

        for (Tour tour : dataBase.getTours()) {
            sb.append(tour.toString());
        }

        return sb.toString();
    }

    public void sendTourRequest(int id, String name, String phone, String email) {

        Matcher matcherName = patternName.matcher(name);
        Matcher matcherPhone = patternPhone.matcher(phone);
        int count = 0;

        for (Tour tour : dataBase.getTours()) {

            if (tour.getId() == id) {
                count++;
            }
        }

        if (matcherName.find() || matcherPhone.find() || count == 0) {
            return;
        }

        dataBase.getRequests().add(new Request(id, new MyClient(name, phone, email),
                        new GregorianCalendar()));

    }

    public String searchByPrice(long price) {

        StringBuilder sb = new StringBuilder();

        if (price < 0) {
            return null;
        }

        for (Tour tour : dataBase.getTours()) {
            if (tour.getPrice() / 100 < price) {
                sb.append(tour.toString());
            }
        }

        return sb.toString();
    }

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
