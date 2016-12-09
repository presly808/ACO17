package week3.Tour.controllers;

import week3.Tour.dataBase.DataBase;

import week3.Tour.model.Request;

import java.util.Date;
import java.util.GregorianCalendar;

public class UserController implements IUserController {
    public DataBase db;

    @Override
    public String showAllTours() {
        String result = "";
        for (int i = 0; i < db.tours.length; i++) {
            if (db.tours[i] != null) {
                result += db.tours[i].toString() + "\n";
            }
        }
        return result;
    }

    @Override
    public String buyTourRequest(int id, String name, String phone) {
        String request1 = "";

        for (int i = 0; i < db.tours.length; i++) {
            if (db.tours[i].getIdTour() == id) {
                request1 = db.tours[i].toString();
                Date date = new GregorianCalendar().getTime();
                db.request.add(new Request(id, name, phone, date));
                System.out.println("You send request for:" + request1);
            }
        }
        return request1;
    }

    @Override
    public String findTourByPrice(long money) {
        String foundTours = "You can buy:\n";
        for (int i = 0; i < db.tours.length; i++) {
            if (money >= db.tours[i].getPrice()) {
                foundTours += db.tours[i].toString() + "\n";
            }
        }
        return foundTours;
    }

    private String searchByCountry(String country) {
        String toursByCountry = "";
        for (int i = 0; i < db.tours.length; i++) {
            if (country.equals(db.tours[i].getHotel().getAdress().getCountry())) {
                toursByCountry += db.tours[i].toString() + "\n";
            }
        }
        return toursByCountry;
    }
}
