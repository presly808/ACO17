package travelagency.tests;

import travelagency.controller.UserController;
import travelagency.db.DataBase;

import static utils.TravelAgencyUtils.generateTour;

/**
 * Created by Влад on 28.11.2016.
 */
public class TestUserController {

    public static void main(String[] args) {

        testShowAllTours();
        testSearchByPrice();
        testSearchByCountry();
        testSendTourRequest();

    }

    private static void testSendTourRequest() {

        DataBase dataBase = new DataBase();
        UserController user = new UserController(dataBase);

        for (int i = 0; i < 5; i++) {
            dataBase.addTour(generateTour());
        }

        user.sendTourRequest(13, "Vlad", "555555", "vlad@gmail.com");

        System.out.println("sendTourRequest() is " + (dataBase.getNumberOfRequests() == 1));
    }

    private static void testSearchByCountry() {

        DataBase dataBase = new DataBase();
        UserController user = new UserController(dataBase);

        dataBase.addTour(generateTour("Ukraine"));
        dataBase.addTour(generateTour("Poland"));
        dataBase.addTour(generateTour("Poland"));

        String actual = user.searchByCountry("Ukraine");
        System.out.println("searchByCountry() is " + (actual.contains("Ukraine") && !actual.contains("Poland")));
    }

    private static void testSearchByPrice() {

        DataBase dataBase = new DataBase();
        UserController user = new UserController(dataBase);

        dataBase.addTour(generateTour(3000));
        dataBase.addTour(generateTour(2300));
        dataBase.addTour(generateTour(5400));

        String actual = user.searchByPrice(5000);
        System.out.println("searchByPrice() is " + (actual.contains("3000") &&
                actual.contains("2300") && !actual.contains("5400")));
    }

    private static void testShowAllTours() {

        DataBase dataBase = new DataBase();
        UserController user = new UserController(dataBase);

        for (int i = 0; i < 5; i++) {
            dataBase.addTour(generateTour());
        }

        String actual = user.showAllTours();

        System.out.println("showAllTours() is " +
                (actual.contains("id: 1") && actual.contains("id: 5")));
    }


}
