package week3.emailSystem.controllers;

import week3.emailSystem.dataBase.DataBase;
import week3.emailSystem.models.Date;
import week3.emailSystem.models.Letter;

public class AdminController {

    private DataBase dataBase;

    public AdminController(DataBase dataBase) {

        if (dataBase == null) {
            return;
        }

        this.dataBase = dataBase;
    }

    public void banUser(int index) {

        dataBase.removeUser(index);
    }

    public void makeDistribution(String tittle, String text, Date date) {

        for (int i = 0; i < dataBase.getUsers().length; i++) {
            dataBase.addLetter(new Letter(100, dataBase.getUsers()[i].getId(), tittle, text, date));
        }
    }
}
