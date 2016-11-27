package week3.travel;

import week3.travel.controller.AdminController;
import week3.travel.controller.UserController;
import week3.travel.db.AppDB;

/**
 * Created by serhii on 11/27/16.
 */
public class Run {

    public static void main(String[] args) {


        AppDB appDb = new AppDB();

        UserController userController = new UserController(appDb);
        AdminController adminController = new AdminController(appDb);



    }

}
