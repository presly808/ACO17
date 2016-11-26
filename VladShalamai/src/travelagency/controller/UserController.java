package travelagency.controller;


import travelagency.db.DataBase;
import travelagency.model.Tour;

/**
 * Created by Влад on 26.11.2016.
 */
public class UserController {

    public static String showAllTours() {

        Tour[] tours = DataBase.getTours();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tours.length; i++) {
            sb.append(String.format("id: %d, country: %s, price: %d,\n start: %d/%d/%d, end: %d/%d/%d," +
                                    " transport: %s\n\tHotel\nname: %s, rating: %d, price: %s\n", tours[i].getId(),
                            tours[i].getHotel().getAddress().getCountry(), tours[i].getPrice() / 100,
                            tours[i].getStartDate().getDay(), tours[i].getStartDate().getMonth(),
                            tours[i].getStartDate().getDay(), tours[i].getEndDate().getDay(),
                            tours[i].getEndDate().getMonth(), tours[i].getEndDate().getYear(), tours[i].getTransport(),
                            tours[i].getHotel().getName(), tours[i].getHotel().getRating(),
                            tours[i].getHotel().getPrice() / 100));
        }

        return sb.toString();
    }

    public static void sendTourRequest() {

    }

    public static String filterTours(int price) {
        return null;
    }

    public static String filterTours(String country) {
        return null;
    }


}
