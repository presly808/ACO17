package week3.tourAgency.tests;

import week3.tourAgency.dataBase.DataBase;
import week3.tourAgency.models.*;
import week3.tourAgency.models.templates.Admin;
import week3.tourAgency.models.templates.User;

public class TestAdmin {

    Tour tour = new Tour("ToEgypt", 8000, new Date(2017, 5, 12, new Time(12, 30)), "airplane",
            new Hotel("SomeHotel", new Address("Egypt", "Kair", "Street", 5), 3000, 4));
    Admin admin = new Admin();

    public static void main(String[] args) {
        TestAdmin test = new TestAdmin();

        System.out.println("testAddTour() --> " + test.testAddTour() +
                           "\ntestUpdateInfo() --> " + test.testUpdateInfo() +
                           "\ntestConfirmReq() --> " + test.testConfirmReq() +
                           "\ntestRemoveTour() --> " + test.testRemoveTour());
    }

    private boolean testAddTour() {
        admin.addTour(tour);

        return DataBase.getTours()[0].equals(tour);
    }

    private boolean testUpdateInfo() {
        Tour tour = new Tour("ToLondon", 5000, new Date(2017, 1, 10, new Time(10, 10)), "train",
                new Hotel("Hotel", new Address("England", "London", "Street", 9), 2000, 4));

        admin.updateTour(tour, 0);

        return DataBase.getTours()[0].equals(tour);
    }

    private boolean testConfirmReq() {
        User user = new User("Nikolay", "nick@gmail.com", 1, 20000);

        Request request = new Request(user, tour, new Date(2016, 11, 26, new Time(20, 51)));
        user.makeTourRequest(request);
        admin.confirmReq(0);

        return request.isConfirmed() && DataBase.getRequests()[0] == null;
    }

    private boolean testRemoveTour() {
        admin.removeTour(0);

        return DataBase.getTours()[0] == null;
    }
}
