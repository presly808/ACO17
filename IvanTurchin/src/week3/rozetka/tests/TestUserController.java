package week3.rozetka.tests;

import week3.rozetka.controllers.UserController;
import week3.rozetka.dataBase.AppDB;
import week3.rozetka.models.*;

import java.util.Arrays;

public class TestUserController {

    public static void main(String[] args) {

        System.out.println("testCheckIn() --> " + testCheckIn() +
                           "\ntestLogIn() --> " + testLogIn() +
                           "\ntestMakeOrder() --> " + testMakeOrder() +
                           "\ntestShowAllProducts() --> " + testShowAllProducts() +
                           "\ntestShowAllSpecifications() --> " + testShowSpecifications() +
                           "\ntestShowProductBySpec() --> " + testShowProductBySpec() +
                           "\ntestSort() --> " + testSort() +
                           "\ntestShowOrders() --> " + testShowOrders());
    }

    private static boolean testCheckIn() {

        AppDB dataBase = new AppDB();
        UserController userController = new UserController(dataBase);
        User user = new User("user", "user@gmail.com", 1000, "user222", new Address());

        userController.checkIn(user);

        return dataBase.getUsers()[0].equals(user) &&
                userController.getEntered().equals(user);
    }

    private static boolean testLogIn() {

        AppDB dataBase = new AppDB();
        UserController userController = new UserController(dataBase);
        User user = new User("user", "user@gmail.com", 1000, "user222",  new Address());
        User user1 = new User("1", "werg", 1000, "2435", new Address());

        userController.checkIn(user);
        userController.checkIn(user1);

        userController.logIn(0, "user222");

        return userController.getEntered().getId() == 0;
    }

    private static boolean testMakeOrder() {

        AppDB dataBase = new AppDB();
        UserController userController = new UserController(dataBase);
        User user = new User("user", "user@gmail.com", 1000, "user222",  new Address());

        userController.checkIn(user);
        dataBase.addProduct(new Product("someProduct", 500, "ttt", 10));

        userController.makeOrder(0);

        return dataBase.getOrders()[0].equals(new Order(0, new Address(), 0));
    }

    private static boolean testShowAllProducts() {

        AppDB dataBase = new AppDB();
        UserController userController = new UserController(dataBase);

        dataBase.addProduct(new Product("someProduct", 500, "ttt", 10));

        return userController.showAllProducts().contains("someProduct");
    }

    private static boolean testShowSpecifications() {

        AppDB dataBase = new AppDB();
        UserController userController = new UserController(dataBase);

        dataBase.addProduct(new Product("someProduct", 500, "ttt", 10));

        return userController.showAllSpecifications().contains("ttt");
    }

    private static boolean testShowProductBySpec() {

        AppDB dataBase = new AppDB();
        UserController userController = new UserController(dataBase);

        dataBase.addProduct(new Product("someProduct", 500, "ttt", 10));

        return userController.showSpecProducts("ttt").contains("someProduct");
    }

    private static boolean testSort() {

        AppDB dataBase = new AppDB();
        UserController userController = new UserController(dataBase);

        Product product = new Product("someProduct", 500, "ttt", 10);
        Product product1 = new Product("someProduct1", 200, "ttt1", 20);
        Product product2 = new Product("someProduct2", 1000, "ttt2", 20);

        dataBase.addProduct(product);
        dataBase.addProduct(product1);
        dataBase.addProduct(product2);

        Product[] res = userController.sortProducts();

        return res[0].equals(product1) && res[1].equals(product) && res[2].equals(product2);
    }

    private static boolean testShowOrders() {

        AppDB dataBase = new AppDB();
        UserController userController = new UserController(dataBase);
        User user = new User("user", "user@gmail.com", 1000, "user222",  new Address());
        Product product = new Product("someProduct", 500, "ttt", 10);
        dataBase.addProduct(product);

        userController.checkIn(user);
        userController.makeOrder(0);

        return userController.showOrders().contains(dataBase.getOrders()[0].toString());
    }
}
