package week3.tourAgency.models.templates;

import week3.tourAgency.controllers.UserController;
import week3.tourAgency.dataBase.DataBase;
import week3.tourAgency.models.Request;
import week3.tourAgency.models.Tour;

import java.util.Arrays;

public class User extends UserController{

    private String name;
    private String email;
    private int id;
    private Tour[] purchasedTours;
    private int money;

    private int lastPurchased = 0;

    public User(String name, String email, int id, int money) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.money = money;

        DataBase.add(this);
        this.purchasedTours = new Tour[1];
    }

    @Override
    public String showAllTours() {

        return Arrays.toString(DataBase.getTours());
    }

    @Override
    public void makeTourRequest(Request request) {
        DataBase.add(request);
    }

    @Override
    public String findTour(String key) {

        String res = "";

        for (int i = 0; i < DataBase.getLastTour(); i++) {
            if (DataBase.getTours()[i].getName().equals(key)) {
                res += new StringBuilder(DataBase.getTours()[i].toString()).append("\n");
            }
        }

        return res;
    }

    @Override
    public String findTour(int money) {

        String res = "";

        for (int i = 0; i < DataBase.getLastTour(); i++) {
            if (money >= DataBase.getTours()[i].getPrice()) {
                res += new StringBuilder(DataBase.getTours()[i].toString()).append("\n");
            }
        }

        return res;
    }

    @Override
    public Tour getTour(Request request) {

        if (request == null) {
            return null;
        }

        if (request.isConfirmed()) {

            for (int i = 0; i < DataBase.getRequests().length; i++) {
                if (DataBase.getRequests()[i] != null && DataBase.getRequests()[i].isConfirmed()) {
                    DataBase.removeRequest(i);
                }
            }

            if (this.purchasedTours.length == lastPurchased) {
                this.purchasedTours = Arrays.copyOf(this.purchasedTours, this.purchasedTours.length * 2);
            }
            this.purchasedTours[lastPurchased] = request.getTour();
            lastPurchased++;

            return request.getTour();
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public Tour[] getPurchasedTours() {
        return purchasedTours;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", purchasedTours=" + Arrays.toString(purchasedTours) +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return user.getName().equals(this.name) && user.getEmail().equals(this.email) &&
                user.getMoney() == this.money;

    }
}
