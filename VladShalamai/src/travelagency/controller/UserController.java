package travelagency.controller;


import travelagency.db.DataBase;
import travelagency.model.Request;
import travelagency.model.Tour;

import java.util.ArrayList;


/**
 * Created by Влад on 26.11.2016.
 */
public class UserController {

    private DataBase dataBase;

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

    public void sendTourRequest(DataBase dataBase) {


    }

    public String searchByPrice(long price) {

        StringBuilder sb = new StringBuilder();

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
