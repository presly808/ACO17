package avdieiev.week3.TravelAgency.controller;


import avdieiev.week3.TravelAgency.db.DataBase;
import avdieiev.week3.TravelAgency.model.MyDate;
import avdieiev.week3.TravelAgency.model.Tour;

import java.util.Scanner;

public class AdminController {
    public DataBase dataBaseAdmin;

    private String updateTourPrice(int idTour) {
        String updatedTourPrice = "";
        Scanner sc = new Scanner(System.in);
        int newPrice = sc.nextInt();
        for (int j = 0; j < dataBaseAdmin.arrRequest.length; j++) {
            if (idTour == dataBaseAdmin.arrTours[j].getID()) {
                System.out.println("Please set newPrice => press Enter ");
                dataBaseAdmin.arrTours[j].setPrice(newPrice);
                updatedTourPrice = dataBaseAdmin.arrTours[j].toString();
            }
        }
        return updatedTourPrice;
    }

    private String updateTourDate(int idTour) {
        String updatedTourDate = "";
        Scanner sc = new Scanner(System.in);
        int newYear = sc.nextInt();
        int newMonth = sc.nextInt();
        int newDay = sc.nextInt();
        for (int j = 0; j < dataBaseAdmin.arrRequest.length; j++) {
            if (idTour == dataBaseAdmin.arrTours[j].getID()) {
                System.out.println("Please set newDay => press Enter, newMonth => press Enter, newYear => press Enter ");
                dataBaseAdmin.arrTours[j].setDate(new MyDate(newDay, newMonth, newYear));
                updatedTourDate = dataBaseAdmin.arrTours[j].toString();
            }
        }
        return updatedTourDate;
    }



    int i = 0;

    private void addTour(Tour tour) {
        dataBaseAdmin.arrTours[i] = tour;
        i++;
    }


    private void removeTour() {
        System.out.println("Print searched ID below");
        Scanner sc = new Scanner(System.in);
        int SearchedID = sc.nextInt();
        for (int i = 0; i < dataBaseAdmin.arrTours.length; i++) {
            if (dataBaseAdmin.arrTours[i] != null && SearchedID == dataBaseAdmin.arrTours[i].getID()) {
                dataBaseAdmin.arrTours[i] = null;
            } else {
                System.out.println("ID is not found");
            }
        }
    }

}
