package travelagency.tests;

import travelagency.db.DataBase;
import travelagency.model.*;

import static utils.TravelAgencyUtils.*;


/**
 * Created by Влад on 28.11.2016.
 */
public class TestDataBase {

    public static void main(String[] args) {

        DataBase dataBase = new DataBase();
        for (int i = 0; i < 5; i++) {
            dataBase.getTours().add(generateTour());
        }

        testAddTour(dataBase);
        testRemoveTour(dataBase);

    }

    private static void testAddTour(DataBase dataBase) {

        dataBase.addTour("Relax in Paris", 3000, new MyDate(2016, 3, 2, new MyTime(12, 10)),
                        new MyDate(2016, 3, 20, new MyTime(12, 10)), "plane", new Hotel("Hilton",
                        new Address("USA", "New-York", "Wall-Street", 12), 700, 5));

        System.out.println("addTour() is " + (dataBase.getTours().size() == 6));

    }

    private static void testRemoveTour(DataBase dataBase) {

        Tour removed = dataBase.removeTour(2);
        System.out.printf("removeTour() is " + (removed.getId() == 2));
    }

}
