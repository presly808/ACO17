package avdieiev.week3.TravelAgency.controller;

import avdieiev.week3.TravelAgency.db.DataBase;
import avdieiev.week3.TravelAgency.model.MyDate;
import avdieiev.week3.TravelAgency.model.Request;
import avdieiev.week3.TravelAgency.model.Tour;

public class UserController {
    public DataBase dataBaseUser;

    public String findTourByPrice(long price) {
        String searchedTour = "";
        for (int i = 0; i < dataBaseUser.arrTours.length; i++) {
            if (dataBaseUser.arrTours[i] != null && dataBaseUser.arrTours[i].getPrice() == price) {
                searchedTour += dataBaseUser.arrTours[i].toString();
                break;
            }
        }
        return searchedTour;
    }

    public String findTourByCountry(String country) {
        String searchedTour = "";
        for (int i = 0; i < dataBaseUser.arrTours.length; i++) {
            if (dataBaseUser.arrTours[i] != null && dataBaseUser.arrTours[i].getHotel().getAdress().getCountry().equals(country)) {
                searchedTour += dataBaseUser.arrTours[i].toString();
                break;
            }
        }
        return searchedTour;
    }

    public String showAll() {
        String strTours = "";
        for (int i = 0; i < dataBaseUser.arrTours.length; i++) {
            Tour tour = dataBaseUser.arrTours[i];
            if (tour != null) {
                strTours += tour.toString() + "\n";
            }
        }
        return strTours;
    }

    int j = 0;
    public String buyTourRequest(int idTour, String clientName, String clientPhone, MyDate dateRequest) {
        String request = "";
        for (int i = 0; i < dataBaseUser.arrTours.length; i++) {
            if (idTour == dataBaseUser.arrTours[i].getID()){
               Request req = new Request(idTour, clientName, clientPhone, dateRequest);
                dataBaseUser.arrRequest[j] = req;
                j++;
                request = request + req.toString();
            }
        }
        return request;
    }

}
