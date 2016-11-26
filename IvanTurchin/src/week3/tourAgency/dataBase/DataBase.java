package week3.tourAgency.dataBase;

import week3.tourAgency.models.Request;
import week3.tourAgency.models.Tour;
import week3.tourAgency.models.templates.User;

import java.util.Arrays;

public class DataBase {

    private static User[] users = new User[10];
    private static Tour[] tours = new Tour[10];
    private static Request[] requests = new Request[10];

    private static int lastUser = 0;
    private static int lastTour = 0;
    private static int lastRequest;

    private static boolean contains(User user) {

        for (int i = 0; i < lastUser; i++) {
            if (users[i].equals(user)) {
                return true;
            }
        }

        return false;
    }

    private static boolean contains(Tour tour) {

        for (int i = 0; i < lastTour; i++) {
            if (tours[i].equals(tour)) {
                return true;
            }
        }

        return false;
    }

    private static boolean contains(Request request) {

        for (int i = 0; i < lastRequest; i++) {
            if (requests[i].equals(request)) {
                return true;
            }
        }

        return false;
    }

    public static void add(Object object) {

        if (object == null) {
            return;
        }

        if (object instanceof User) {

            User user = (User) object;

            if (contains(user)) {
                return;
            }

            if (users.length == lastUser) {
                users = Arrays.copyOf(users, users.length * 2);
            }

            users[lastUser] = user;
            lastUser++;

        } else if (object instanceof Tour) {

            Tour tour = (Tour) object;

            if (contains(tour)) {
                return;
            }

            if (tours.length == lastTour) {
                tours = Arrays.copyOf(tours, tours.length * 2);
            }

            tours[lastTour] = tour;
            lastTour++;

        } else if (object instanceof Request) {

            Request request = (Request) object;

            if (contains(request)) {
                return;
            }

            if (requests.length == lastRequest) {
                requests = Arrays.copyOf(requests, requests.length * 2);
            }

            requests[lastRequest] = request;
            lastRequest++;
        }
    }

    public static void removeUser(int index) {

        if (index < 0 || index >= users.length) {
            return;
        }

        users[index] = null;
        int j = 0;
        User[] temp = new User[users.length];

        for (int i = 0; i < temp.length; i++) {
            if (users[i] != null) {
                temp[j] = users[i];
            }

            j++;
        }

        users = temp;
    }

    public static void removeTour(int index) {

        if (index < 0 || index >= users.length) {
            return;
        }

        tours[index] = null;
        int j = 0;
        Tour[] temp = new Tour[tours.length];

        for (int i = 0; i < temp.length; i++) {
            if (tours[i] != null) {
                temp[j] = tours[i];
            }

            j++;
        }

        tours = temp;
    }

    public static void removeRequest(int index) {

        if (index < 0 || index >= users.length) {
            return;
        }

        requests[index] = null;
        int j = 0;
        Request[] temp = new Request[requests.length];

        for (int i = 0; i < temp.length; i++) {
            if (requests[i] != null) {
                temp[j] = requests[i];
            }

            j++;
        }

        requests = temp;
    }

    public static void overrideTour(Tour tour, int index) {

        if (tour == null || index < 0 || index > lastTour) {
            return;
        }

        tours[index] = tour;
    }

    public static User[] getUsers() {
        return users;
    }

    public static Tour[] getTours() {
        return tours;
    }

    public static Request[] getRequests() {
        return requests;
    }

    public static int getLastUser() {
        return lastUser;
    }

    public static int getLastTour() {
        return lastTour;
    }

    public static int getLastRequest() {
        return lastRequest;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "users=" + Arrays.toString(users) +
                ", tours=" + Arrays.toString(tours) +
                ", requests=" + Arrays.toString(requests) +
                ", lastUser=" + lastUser +
                ", lastTour=" + lastTour +
                ", lastRequest=" + lastRequest +
                '}';
    }
}
