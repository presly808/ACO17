package travelagency.db;

import travelagency.model.Hotel;
import travelagency.model.Tour;

import java.util.GregorianCalendar;

/**
 * Created by Влад on 04.12.2016.
 */
public interface IDataBase {

    void addTour(String name, long price, GregorianCalendar startDate, GregorianCalendar endDate, String transport, Hotel hotel);
    void addTour(Tour tour);
    Tour removeTour(int id);
    Tour updateTour(int id, long price);
    Tour updateTour(int id, String transport);
    String getRequests();
    String getTours();
    String searchTour(long price);
    String searchTour(String country);
    void  addRequest(int id, String name, String phone, String email);
    int getNumberOfRequests();
    int getNumberOfTours();

    //find

}
