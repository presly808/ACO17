package week3.tourAgency.tests;

import week3.tourAgency.dataBase.DataBase;
import week3.tourAgency.models.*;
import week3.tourAgency.models.templates.Admin;
import week3.tourAgency.models.templates.User;

import java.util.Arrays;

public class TestUser {

    public static void main(String[] args) {

        System.out.println("testShowAllTours() --> " + testShowAllTours() +
                           "\ntestMakeTourRequest() --> " + testMakeTourRequest() +
                           "\ntestFindTour() --> " + testFindTour() +
                           "\ntestGetTour() --> " + testGetTour());
    }

    private static boolean testShowAllTours() {
        Tour tour = new Tour("ToEgypt", 8000, new Date(2017, 5, 12, new Time(12, 30)), "airplane",
                new Hotel("SomeHotel", new Address("Egypt", "Kair", "Street", 5), 3000, 4));
        Admin admin = new Admin();
        admin.addTour(tour);

        String all = new User("Max", "@gmail.com", 1, 10000).showAllTours();

        return all.contains("ToEgypt");
    }

    private static boolean testMakeTourRequest() {

        Tour tour = new Tour("ToEngland", 5000, new Date(2017, 9, 10, new Time(10, 30)), "train",
                new Hotel("SomeHotel", new Address("England", "London", "StreetInLn", 12), 3500, 5));
        Admin admin = new Admin();

        admin.addTour(tour);

        User user = new User("Masha", "email", 2, 5000);
        user.makeTourRequest(new Request(user, tour, new Date(2016, 11, 26, new Time(23, 20))));

        return DataBase.getRequests()[0].getUser().equals(user);
    }

    private static boolean testFindTour() {

        User user = new User("Oleg", "oleg@gmail.com", 3, 6000);

        return user.findTour(5000).contains("ToEngland") &&
                user.findTour("ToEgypt").contains("ToEgypt");
    }

    private static boolean testGetTour() {
        Admin admin = new Admin();
        admin.confirmReq(0);

        Tour tour = new Tour("ToMonaco", 15000, new Date(2018, 11, 1, new Time(18, 35)), "plain",
                new Hotel("SomeHotelinMonaco", new Address("Monaco", "Monte-Carlo", "StreetInMn", 2), 8000, 6));

        admin.addTour(tour);
        User user = new User("Alex", "alex@gmail.com", 4, 20000);

        Request request = new Request(user, tour, new Date(2016, 11, 26, new Time(23, 38)));
        user.makeTourRequest(request);

        admin.confirmReq(0);
        user.getTour(request);

        return user.getPurchasedTours()[0].equals(tour);
    }
}
