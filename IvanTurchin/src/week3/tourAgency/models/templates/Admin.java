package week3.tourAgency.models.templates;

import week3.tourAgency.controllers.AdminController;
import week3.tourAgency.dataBase.DataBase;
import week3.tourAgency.models.Tour;

public class Admin extends AdminController{

    private DataBase dataBase = new DataBase();

    @Override
    public void addTour(Tour tour) {
        dataBase.add(tour);
    }

    @Override
    public void updateTour(Tour tour, int index) {
        dataBase.overrideTour(tour, index);
    }

    @Override
    public void confirmReq(int indexOfRequest) {
        dataBase.getRequests()[indexOfRequest].confirm(this);
    }

    @Override
    public void removeTour(int index) {
        dataBase.removeTour(index);
    }
}