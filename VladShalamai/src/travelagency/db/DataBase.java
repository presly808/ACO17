package travelagency.db;

import travelagency.model.Hotel;
import travelagency.model.MyDate;
import travelagency.model.Request;
import travelagency.model.Tour;
import utils.TravelAgencyUtils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Влад on 26.11.2016.
 */
public class DataBase {

    private ArrayList<Tour> tours = new ArrayList<>();
    private ArrayList<Request> requests = new ArrayList<>();

    Pattern pattern = Pattern.compile("[^a-zA-Z\\s]");

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

        Matcher matcherName = pattern.matcher(name);
        Matcher matcherTransport = pattern.matcher(transport);

        if (matcherName.find() || matcherTransport.find() || price < 0 || startDate.equals(endDate)) {
            return;
        }

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
