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

    DataBase dataBase = new DataBase();

    public User(String name, String email, int id, int money) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.money = money;

        this.purchasedTours = new Tour[1];
    }

    @Override
    public String showAllTours() {

        return Arrays.toString(dataBase.getTours());
    }

    @Override
    public void makeTourRequest(Request request) {
        dataBase.add(request);
    }

    @Override
    public String findTour(String key) {

        String res = "";

        for (int i = 0; i < dataBase.getLastTour(); i++) {
            if (dataBase.getTours()[i].getName().equals(key)) {
                res += new StringBuilder(dataBase.getTours()[i].toString()).append("\n");
            }
        }

        return res;
    }

    @Override
    public String findTour(int money) {

        String res = "";

        for (int i = 0; i < dataBase.getLastTour(); i++) {
            if (money >= dataBase.getTours()[i].getPrice()) {
                res += new StringBuilder(dataBase.getTours()[i].toString()).append("\n");
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

            int index = -1;

            for (int i = 0; i < dataBase.getLastRequest(); i++) {
                if (request.equals(dataBase.getRequests()[i]));
            }

            dataBase.removeRequest(index);

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
