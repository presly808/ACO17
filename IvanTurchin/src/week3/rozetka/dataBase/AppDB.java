package week3.rozetka.dataBase;

import week3.rozetka.models.*;

import java.util.ArrayList;

public class AppDB {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Order> confirmedOrders = new ArrayList<>();

    public void addUser(User user) {

        if (user == null || users.contains(user)) {
            return;
        }

        users.add(user);
    }

    public void confirmOrder(int index) {

        if (index < 0 || index >= orders.size()) {
            return;
        }

        confirmedOrders.add(orders.get(index));
        orders.remove(index);
    }

    public void removeUser(int index) {

        if (index < 0 || index >= users.size()) {
            return;
        }

        users.remove(index);
    }

    public void addProduct(Product product) {

        if (product == null || products.contains(product)) {
            return;
        }

        products.add(product);
    }

    public void removeProduct(int index) {

        if (index < 0 || index >= products.size()) {
            return;
        }

        products.remove(index);
    }

    public void addOrder(Order order) {

        if (order == null || orders.contains(order)) {
            return;
        }

        orders.add(order);
    }

    public void removeOrder(int index) {

        if (index < 0 || index >= orders.size()) {
            return;
        }

        orders.remove(index);
    }

    public User[] getUsers() {
        return users.toArray(new User[users.size()]);
    }

    public Product[] getProducts() {
        return products.toArray(new Product[products.size()]);
    }

    public Order[] getOrders() {
        return orders.toArray(new Order[orders.size()]);
    }

    public Order[] getConfirmed() {
        return confirmedOrders.toArray(new Order[confirmedOrders.size()]);
    }
}
