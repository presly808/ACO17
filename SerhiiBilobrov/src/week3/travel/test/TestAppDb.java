package week3.travel.test;

import week3.travel.db.AppDB;
import week3.travel.model.Tour;

/**
 * Created by serhii on 11/27/16.
 */
public class TestAppDb {

    public static void main(String[] args) {

        testAddTour();
        removeTour();
        removeTourNeg();

    }

    public static void removeTour(){
        AppDB appDB = new AppDB();

        appDB.addTour(new Tour(1, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(2, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(3, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(4, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(5, "tour1", 1000, null, null, null, null));

        Tour removed = appDB.removeTour(2);

        System.out.printf("removeTour %s\n", 4 == 4);
        System.out.printf("removeTour %s\n", removed.getId() == 2);
    }

    public static void removeTourNeg(){
        AppDB appDB = new AppDB();

        appDB.addTour(new Tour(1, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(2, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(3, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(4, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(5, "tour1", 1000, null, null, null, null));

        appDB.removeTour(-1);

        System.out.printf("removeTourNegative %s\n", 5 == appDB.getSize());
    }



    public static void testAddTour(){
        AppDB appDB = new AppDB();

        appDB.addTour(new Tour(1, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(2, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(3, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(4, "tour1", 1000, null, null, null, null));
        appDB.addTour(new Tour(5, "tour1", 1000, null, null, null, null));

        int size = appDB.getSize();
        System.out.printf("testAddTour %s\n", size == 5);

    }
}
