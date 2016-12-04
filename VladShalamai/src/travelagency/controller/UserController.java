package travelagency.controller;


import travelagency.db.DataBase;


/**
 * Created by Влад on 26.11.2016.
 */
public class UserController {

    private DataBase dataBase;

    public UserController(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * this method return string which consist all info about tours
     *
     * @return string of tours
     */

    public String showAllTours() {

        return dataBase.getTours();
    }

    /**
     * this method add request in list of requests in our database
     * @param id id of tour which user want to buy
     * @param name the name of user
     * @param phone the phone of user
     * @param email the email of user
     */

    public void sendTourRequest(int id, String name, String phone, String email) {

        dataBase.addRequest(id, name, phone, email);

    }

    /**
     * this method return string which consist all info about tours which price is less than @param
     * @param price the max price of tour that user want to watch
     * @return string of tours
     */

    public String searchByPrice(long price) {

        if (price < 0) {
            return null;
        }

        return dataBase.searchTour(price);
    }

    /**
     * this method return string which consist all info about tours which country is @param
     * @param country the country of tour that user want to watch
     * @return string of tours
     */

    public String searchByCountry(String country) {

        return dataBase.searchTour(country);
    }

}
