package week3.Tour.controllers;

import week3.Tour.model.Tour;

public interface IAdminController {
    void addTour(Tour tour);

    void removeTour(int id);

    String getAllRequest();

    void updateTour(int id, long price);

    void updateTour(int id, int startDateDay, int startDateMonth, int startDateYear,
                    int endDateDay, int endDateMonth, int endDateYear);
}
