package week3.tourAgency.controllers;

import week3.tourAgency.models.Request;
import week3.tourAgency.models.Tour;

public interface UserController {

    String showAllTours();

    void makeTourRequest(Request request);

    String findTour(String key);

    String findTour(int money);

    Tour getTour(Request request);

    Tour[] sort();

}
