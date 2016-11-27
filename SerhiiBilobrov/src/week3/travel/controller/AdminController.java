package week3.travel.controller;

import week3.travel.db.AppDB;
import week3.travel.model.Tour;
import week3.travel.model.TourRequest;

/**
 * Created by serhii on 11/27/16.
 */
public class AdminController {

    private AppDB appDB = new AppDB();

    public AdminController(AppDB appDB) {
        this.appDB = appDB;
    }

    public TourRequest[] getAllRequests(){
        return null;
    }

    public Tour addTour(String name, int price){

//        Tour tour = new Tour()
        return null;
    }

    public Tour removeTour(int id){
        return appDB.removeTour(id);
    }

    public boolean updateTour(Tour tour){
        return false;
    }


}
