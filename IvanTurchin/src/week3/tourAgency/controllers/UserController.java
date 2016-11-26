package week3.tourAgency.controllers;

import week3.tourAgency.models.Request;
import week3.tourAgency.models.Tour;

public abstract class UserController {

    public abstract String showAllTours();

    public abstract void makeTourRequest(Request request);

    public abstract String findTour(String key);

    public abstract String findTour(int money);

    public abstract Tour getTour(Request request);

}
