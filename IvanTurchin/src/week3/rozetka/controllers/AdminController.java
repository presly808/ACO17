package week3.rozetka.controllers;

import week3.rozetka.dataBase.AppDB;
import week3.rozetka.models.Product;

public class AdminController {

    AppDB appDB;

    public AdminController(AppDB appDB) {

        if (appDB == null) {
            return;
        }

        this.appDB = appDB;
    }

    public void addProduct(Product product) {

        appDB.addProduct(product);
    }

    public void removeProduct(int index) {

        appDB.removeProduct(index);
    }

    public void confirmOrder(int index) {

        appDB.confirmOrder(index);
    }
}
