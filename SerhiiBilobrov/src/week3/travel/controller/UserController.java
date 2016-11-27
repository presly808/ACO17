package week3.travel.controller;

import week3.travel.db.AppDB;
import week3.travel.model.Tour;
import week3.travel.model.TourRequest;

/**
 * Created by serhii on 11/26/16.
 */
public class UserController {

    private AppDB appDB;

    public UserController(AppDB appDB) {
        this.appDB = appDB;
    }

    public Tour[] getAllTours(){
        return appDB.getTours();
    }

    public TourRequest sentTourRequest(int id, String clientName, String clientPhone){
        return null;
    }

    public Tour[] findTours(String name){
        Tour[] tours = appDB.getTours();
        for (int i = 0; i < tours.length; i++) {
            /*if(){

            }*/
        }
        return null;
    }

}
