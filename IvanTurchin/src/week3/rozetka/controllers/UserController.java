package week3.rozetka.controllers;

import week3.rozetka.dataBase.AppDB;
import week3.rozetka.models.*;

import java.util.Arrays;
import java.util.Comparator;

public class UserController {

    private AppDB appDB;
    private User entered;

    public UserController(AppDB appDB) {

        if (appDB != null) this.appDB = appDB;
    }

    public void checkIn(User user) {

        user.setId(appDB.getUsers().length);

        appDB.addUser(user);

        if (appDB.getUsers()[appDB.getUsers().length - 1].equals(user)) {
            this.entered = user;
        }
    }

    public void logIn(int index, String password) {

        if (appDB.getUsers().length <= index || password == null) {
            return;
        }

        if (appDB.getUsers()[index].getPassword().equals(password)) {
            this.entered = appDB.getUsers()[index];
        }
    }

    public void makeOrder(int indexOfProduct) {

        if (entered != null)
            appDB.addOrder(new Order(this.entered.getId(), this.entered.getAddress(), indexOfProduct));
    }

    public String showAllProducts() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < appDB.getProducts().length; i++) {
            sb.append(appDB.getProducts()[i].toString()).append("\n");
        }

        return sb.toString();
    }

    public String showAllSpecifications() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < appDB.getProducts().length; i++) {
            sb.append(appDB.getProducts()[i].getSpecify()).append("\n");
        }

        return sb.toString();
    }

    public String showSpecProducts(String key) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < appDB.getProducts().length; i++) {
            if (appDB.getProducts()[i].getSpecify().contains(key)) {
                sb.append(appDB.getProducts()[i].toString()).append("\n");
            }
        }

        return sb.toString();
    }

    public Product[] sortProducts() {

        Product[] res = appDB.getProducts();

        Arrays.sort(res, new PriceProductComparator());

        return res;
    }

    public String showOrders() {

        if (entered == null) {
            return "You didn't make orders";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < appDB.getOrders().length; i++) {
            if (appDB.getOrders()[i].getOwnerId() == entered.getId()) {
                sb.append(appDB.getOrders()[i].toString()).append("\n");
            }
        }

        return sb.toString();
    }

    public User getEntered() {
        return entered;
    }
}

class PriceProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
