package tourAgency.controllers;

import tourAgency.appDataBase.DataBase;
import tourAgency.models.*;

public class AdminController {

    private DataBase dataBase = new DataBase();
    private Tour[] tours = dataBase.getTourBase();
    private Request[] requests = dataBase.getRequests();
    private User[] users = dataBase.getUserBase();

    public void updateTour(int index,String country, String name, int id, int price, Date startDate,
                           Date endDate, String transport, Hotel hotel) {

        if (index <= 0 || index > tours.length) {
            return;
        }

        tours[index - 1] = new Tour(name,country, id, price, startDate, endDate, transport, hotel);
    }

    public void addTour(Tour tour) {

        dataBase.addTour(tour);
    }

    public void showAllRequests() {

        for (int i = 0; i < this.requests.length; i++) {
            if (this.requests[i] != null) {
                System.out.println(this.requests[i].toString());
            }
        }
    }

    public void confirmRequest(int indexOfUser, int indexOfRequest) {

        if (indexOfRequest <= 0 || indexOfUser <= 0 ||
                indexOfRequest > this.requests.length || indexOfUser > this.users.length) {
            return;
        }

        Request request = this.requests[indexOfRequest - 1];
        User user = this.users[indexOfUser - 1];

        if (user.getMoney() >= request.getTour().getPrice()) {
            user.setMoney(user.getMoney() - request.getTour().getPrice());
            user.setExpected(request.getTour());
        }
    }

    public void removeTour(int index) {

        if (index < 0 || index >= this.tours.length) {
            return;
        }

        dataBase.removeTour(index);
    }
}
