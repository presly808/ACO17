package travelagency.tests;

import travelagency.controller.AdminController;
import travelagency.controller.UserController;
import travelagency.db.DataBase;
import travelagency.model.*;

import java.util.GregorianCalendar;

import static utils.TravelAgencyUtils.*;


/**
 * Created by Влад on 28.11.2016.
 */
public class TestAdminController {

    public static void main(String[] args) {

        DataBase dataBase = new DataBase();

        for (int i = 0; i < 5; i++) {
            dataBase.getTours().add(generateTour());
        }

        testAddTour(dataBase);
        testRemoveTour(dataBase);
        testShowAllRequests(dataBase);
        testUpdateTours(dataBase);

    }

    private static void testUpdateTours(DataBase dataBase) {

        AdminController admin = new AdminController(dataBase);
        UserController user = new UserController(dataBase);

        admin.updateTour(1, 10000);
        admin.updateTour(4, "motorbike");

        String actual = user.showAllTours();
        System.out.println("updateTour() is " + (actual.contains("motorbike") && actual.contains("10000")));

    }

    private static void testShowAllRequests(DataBase dataBase) {

        AdminController admin = new AdminController(dataBase);
        UserController user = new UserController(dataBase);

        user.sendTourRequest(3, "John", "999", "john@gmail.com");
        user.sendTourRequest(5, "Karina", "555", "karina@gmail.com");

        String actual = admin.showAllRequests();
        System.out.println("showAllRequests() is " + (actual.contains("id: 3") && actual.contains("id: 5")));

    }

    private static void testAddTour(DataBase dataBase) {

        AdminController admin = new AdminController(dataBase);

        admin.addTour("Relax in Paris", 3000, new GregorianCalendar(2016, 3, 2,12, 10),
                new GregorianCalendar(2016, 3, 20,12, 10), "plane", new Hotel("Hilton",
                        new Address("USA", "New-York", "Wall-Street", 12), 700, 5));

        System.out.println("addTour() is " + (dataBase.getTours().size() == 6));

    }

    private static void testRemoveTour(DataBase dataBase) {

        AdminController admin = new AdminController(dataBase);

        Tour removed = admin.removeTour(2);
        System.out.println("removeTour() is " + (removed.getId() == 2));
    }

}
