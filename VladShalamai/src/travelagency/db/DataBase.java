package travelagency.db;

import travelagency.model.Hotel;
import travelagency.model.MyDate;
import travelagency.model.Request;
import travelagency.model.Tour;
import utils.TravelAgencyUtils;

import java.util.ArrayList;

/**
 * Created by Влад on 26.11.2016.
 */
public class DataBase {

    private ArrayList<Tour> tours = new ArrayList<>();
    private ArrayList<Request> requests = new ArrayList<>();

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    public void addTour(String name, long price, MyDate startDate, MyDate endDate, String transport, Hotel hotel) {

        tours.add(new Tour(name, price * 100, startDate, endDate, transport, hotel));

    }

    public  Tour removeTour(int id) {

        for (Tour tour : tours) {
            if (tour.getId() == id) {
                tours.remove(tour);
                return tour;
            }
        }
        return null;
    }
}
