package travelagency.db;

import travelagency.model.Request;
import travelagency.model.Tour;
import utils.TravelAgencyUtils;

/**
 * Created by Влад on 26.11.2016.
 */
public class DataBase {

    private static final int MAX_SIZE = 30;
    private static Tour[] tours = initTour();
    private static Request[] requests;

    public static Tour[] getTours() {
        return tours;
    }

    public static void setTours(Tour[] tours) {
        DataBase.tours = tours;
    }

    public static Request[] getRequests() {
        return requests;
    }

    public static void setRequests(Request[] requests) {
        DataBase.requests = requests;
    }

    public static Tour[] initTour() {
        for (int i = 0; i < 10; i++) {
            tours[i] = new Tour(i, TravelAgencyUtils.generateNum(100000, 300000),
                    TravelAgencyUtils.generateDate(2016), TravelAgencyUtils.generateDate(2017),
                    TravelAgencyUtils.generateTransport(), TravelAgencyUtils.generateHotel());
        }

        return tours;
    }

    public static void main(String[] args) {
        System.out.println(tours[3].getId());
    }
}
