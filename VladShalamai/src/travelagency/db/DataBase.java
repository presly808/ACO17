package travelagency.db;

import travelagency.model.Hotel;
import travelagency.model.MyClient;
import travelagency.model.Request;
import travelagency.model.Tour;
import utils.TravelAgencyUtils;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * Created by Влад on 26.11.2016.
 */


public class DataBase implements IDataBase {

    private static final int CENTS = 100;

    private List<Tour> tours = new ArrayList<>();
    private List<Request> requests = new ArrayList<>();

    @Override
    public String getTours() {
        StringBuilder sb = new StringBuilder();

        for (Tour tour : tours) {
            sb.append(tour.toString());
        }

        return sb.toString();
    }

    @Override
    public String getRequests() {
        StringBuilder sb = new StringBuilder();

        for (Request request : requests) {
            sb.append(request.toString());
        }

        return sb.toString();
    }

    @Override
    public void addTour(String name, long price, GregorianCalendar startDate, GregorianCalendar endDate, String transport, Hotel hotel) {

        tours.add(new Tour(name, price * CENTS, startDate, endDate, transport, hotel));
    }

    @Override
    public void addTour(Tour tour) {
        tours.add(tour);
    }

    @Override
    public Tour removeTour(int id) {
        for (Tour tour : tours) {
            if (tour.getId() == id) {
                tours.remove(tour);
                return tour;
            }
        }
        return null;
    }

    @Override
    public Tour updateTour(int id, long price) {
        for (Tour tour : tours) {
            if (tour.getId() == id) {
                tour.setPrice(price * CENTS);
                return tour;
            }
        }
        return null;
    }

    @Override
    public Tour updateTour(int id, String transport) {
        for (Tour tour : tours) {
            if (tour.getId() == id) {
                tour.setTransport(transport);
                return tour;
            }
        }
        return null;
    }

    @Override
    public String searchTour(long price) {
        StringBuilder sb = new StringBuilder();

        for (Tour tour : tours) {
            if (tour.getPrice() / CENTS < price) {
                sb.append(tour.toString());
            }
        }

        return sb.toString();
    }

    @Override
    public String searchTour(String country) {
        StringBuilder sb = new StringBuilder();

        for (Tour tour : tours) {
            if (tour.getHotel().getAddress().getCountry().equals(country)) {
                sb.append(tour.toString());
            }
        }

        return sb.toString();
    }

    @Override
    public void addRequest(int id, String name, String phone, String email) {
        int count = 0;

        for (Tour tour : tours) {

            if (tour.getId() == id) {
                count++;
            }
        }

        if (TravelAgencyUtils.validate(name, phone) || count == 0) {
            System.out.println("data incorrect or id does not exist");
            return;
        }

        requests.add(new Request(id, new MyClient(name, phone, email),
                new GregorianCalendar()));
    }

    @Override
    public int getNumberOfRequests() {
        return requests.size();
    }

    @Override
    public int getNumberOfTours() {
        return tours.size();
    }
}
