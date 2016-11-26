package week3.tourAgency.models.templates;

import week3.tourAgency.controllers.AdminController;
import week3.tourAgency.dataBase.DataBase;
import week3.tourAgency.models.Tour;

public class Admin extends AdminController{

    @Override
    public void addTour(Tour tour) {
        DataBase.add(tour);
    }

    @Override
    public void updateTour(Tour tour, int index) {
        DataBase.overrideTour(tour, index);
    }
    @Override
    public void confirmReq(int indexOfRequest) {
        DataBase.getRequests()[indexOfRequest].confirm(this);
        DataBase.removeRequest(indexOfRequest);
    }

    @Override
    public void removeTour(int index) {
        DataBase.removeTour(index);
    }
}