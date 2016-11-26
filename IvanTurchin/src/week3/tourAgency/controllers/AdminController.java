package week3.tourAgency.controllers;

import week3.tourAgency.models.*;

public abstract class AdminController {

    public abstract void addTour(Tour tour);

    public abstract void updateTour(Tour tour, int index);

    public abstract void confirmReq(int indexOfRequest);

    public abstract void removeTour(int index);
}
