package tourAgency.appDataBase;

import tourAgency.models.*;

import java.util.Arrays;

public class DataBase {

    private User[] userBase = new User[10];
    private int lastUser = 0;

    private Tour[] tourBase = new Tour[10];
    private int lastTour = 0;

    private Request[] requests = new Request[10];
    private int lastRequest = 0;

    private boolean chequeEquals(User user) {

        for (int i = 0; i < lastUser; i++) {
            if (userBase[i].equals(user)) {
                return true;
            }
        }
        return false;
    }

    private boolean chequeEquals(Tour tour) {

        for (int i = 0; i < lastTour; i++) {
            if (this.tourBase[i].equals(tour)) {
                return true;
            }
        }

        return false;
    }

    private boolean chequeEquals(Request request) {

        for (int i = 0; i < lastRequest; i++) {
            if (this.requests[i].equals(request)) {
                return true;
            }
        }
        return false;
    }

    public void addUser(User user) {

        if (user == null || chequeEquals(user)) {
            return;
        }

        if (userBase.length <= lastUser) {
            userBase = Arrays.copyOf(this.userBase, this.userBase.length * 2);
        }

        this.userBase[lastUser] = user;
        lastUser++;
    }

    public void addRequest(Request request) {

        if (request == null || chequeEquals(request)) {
            return;
        }

        if (requests.length <= lastRequest) {
            requests = Arrays.copyOf(this.requests, this.requests.length * 2);
        }

        this.requests[lastRequest] = request;
        lastRequest++;
    }

    public void addTour(Tour tour) {

        if (tour == null || chequeEquals(tour)) {
            return;
        }

        if (this.tourBase.length <= lastTour) {
            this.tourBase = Arrays.copyOf(this.tourBase, this.tourBase.length * 2);
        }

        this.tourBase[lastTour] = tour;
        lastTour++;
    }

    public void removeTour(int index) {

        if (index <= 0 || index > this.tourBase.length) {
            return;
        }

        this.tourBase[index - 1] = null;
        int j = 0;
        Tour[] tours = new Tour[this.tourBase.length];

        for (int i = 0; i < this.tourBase.length; i++) {
            if (this.tourBase[i] != null) {
                tours[j] = tourBase[i];
            }
        }

        tourBase = tours;
    }

    public User[] getUserBase() {
        return userBase;
    }

    public Tour[] getTourBase() {
        return tourBase;
    }

    public Request[] getRequests() {
        return requests;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "userBase=" + Arrays.toString(userBase) +
                ", tourBase=" + Arrays.toString(tourBase) +
                ", requests=" + Arrays.toString(requests) +
                '}';
    }
}
