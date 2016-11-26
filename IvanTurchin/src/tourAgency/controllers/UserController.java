package tourAgency.controllers;

import tourAgency.appDataBase.DataBase;
import tourAgency.models.*;

import java.util.Arrays;
import java.util.Comparator;

public class UserController {

    private DataBase dataBase = new DataBase();
    private Tour[] tours = dataBase.getTourBase();
    private User user;

    public UserController(User user) {

        if (user == null) {
            return;
        }

        this.user = user;
    }

    public String showAllTours() {

        String res = "";

        for (int i = 0; i < tours.length; i++) {
            if (this.tours[i] != null) {
                res += new StringBuilder(this.tours[i].toString()).append("\n");
            }
        }

        return res;
    }

    public void addTourRequest(int index) {

        if (index <= 0 || index > tours.length || tours[index - 1] == null) {
            return;
        }

        Request request = new Request(user, tours[index - 1]);
        dataBase.addRequest(request);
    }

    public String findTour(String key) {

        String res = "";

        for (int i = 0; i < tours.length; i++) {
            if (tours[i] != null && (key.equals(tours[i].getName()) || key.equals(tours[i].getCountry()))) {
                res += new StringBuilder(tours[i].toString()).append("\n");
            }
        }



        return res;
    }

    public String findTour(int price) {

        String res = "";

        for (int i = 0; i < tours.length; i++) {
            if (tours[i] != null && tours[i].getPrice() <= price) {
                res += new StringBuilder(tours[i].toString()).append("\n");
            }
        }

        return res;
    }

    public void sortByPrice() {
        Arrays.sort(this.tours, new TourPriceComparator());
    }
}

class TourPriceComparator implements Comparator<Tour> {

    @Override
    public int compare(Tour o1, Tour o2) {
        return o1.getPrice() - o2.getPrice();
    }
}

