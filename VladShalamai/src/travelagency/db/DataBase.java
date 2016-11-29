package travelagency.db;

import travelagency.model.Request;
import travelagency.model.Tour;

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

}
