package week3.emailSystem.tests;

import week3.emailSystem.controllers.AdminController;
import week3.emailSystem.controllers.UserController;
import week3.emailSystem.dataBase.DataBase;
import week3.emailSystem.models.Date;
import week3.emailSystem.models.Time;
import week3.emailSystem.models.User;

public class TestAdminController {

    public static void main(String[] args) {

        System.out.println("testBanUser() --> " + testBanUser() +
                "\ntestMakeDistribution() --> " + testMakeDistribution());
    }

    private static boolean testBanUser() {

        DataBase dataBase = new DataBase();

        AdminController adminController = new AdminController(dataBase);
        dataBase.addUser(new User("aaa", "aaa@gmail.com", 2));

        adminController.banUser(0);
        return dataBase.getUsers().length == 0;
    }

    private static boolean testMakeDistribution() {

        DataBase dataBase = new DataBase();
        AdminController adminController = new AdminController(dataBase);
        UserController userController = new UserController(dataBase);

        User user = new User("aaa", "aaa@gmail.com", 1);
        User user1 = new User("bbb", "bbb@gmail.com", 2);

        userController.checkIn(user);
        userController.checkIn(user1);

        adminController.makeDistribution("distribution", "text", new Date(2016, 11, 29, new Time(16, 49)));

        userController.changeUser(user);

        boolean t1 = userController.showIncomingLetters().contains("distribution") &&
                userController.showIncomingLetters().contains("text");

        userController.changeUser(user1);

        boolean t2 = userController.showIncomingLetters().contains("distribution") &&
                userController.showIncomingLetters().contains("text");

        return t1 && t2;
    }
}
