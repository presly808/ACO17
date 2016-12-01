package travelagency.db;

import travelagency.model.Request;
import travelagency.model.Tour;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Влад on 26.11.2016.
 */
public class DataBase {

    private List<Tour> tours = new ArrayList<>();
    private List<Request> requests = new ArrayList<>();

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

}
