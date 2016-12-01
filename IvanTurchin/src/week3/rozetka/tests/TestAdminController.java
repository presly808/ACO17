package week3.rozetka.tests;

import week3.rozetka.controllers.AdminController;
import week3.rozetka.dataBase.AppDB;
import week3.rozetka.models.*;

public class TestAdminController {

    public static void main(String[] args) {

        System.out.println("testAddProduct() --> " + testAddProduct() +
                           "\ntestRemoveProduct() --> " + testRemoveProduct() +
                           "\ntestConfirmOrder() --> " + testConfirmOrder());
    }

    private static boolean testAddProduct() {

        AppDB appDB = new AppDB();
        AdminController adminController = new AdminController(appDB);
        Product product = new Product("product", 1000, "spec", 10);

        adminController.addProduct(product);

        return appDB.getProducts()[0].equals(product);
    }

    private static boolean testRemoveProduct() {

        AppDB appDB = new AppDB();
        AdminController adminController = new AdminController(appDB);
        Product product = new Product("product", 1000, "spec", 10);

        adminController.addProduct(product);
        adminController.removeProduct(0);

        return appDB.getProducts().length == 0;
    }

    private static boolean testConfirmOrder() {

        AppDB appDB = new AppDB();
        AdminController adminController = new AdminController(appDB);

        appDB.addProduct(new Product("product", 1000, "spec", 10));
        appDB.addUser(new User());

        Order order = new Order(0, new Address(), 1);

        appDB.addOrder(order);

        adminController.confirmOrder(0);

        return appDB.getConfirmed()[0].equals(order);
    }
}
