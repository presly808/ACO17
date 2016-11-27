package week3.tourAgency.controllers;

import week3.tourAgency.models.*;

public interface AdminController {

    void addTour(Tour tour);

    void updateTour(Tour tour, int index);

    void confirmReq(int indexOfRequest);

    void removeTour(int index);
}
