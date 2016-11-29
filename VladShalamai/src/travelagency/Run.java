package travelagency;

import travelagency.controller.AdminController;
import travelagency.controller.UserController;
import travelagency.db.DataBase;
import travelagency.view.ClientView;
import utils.TravelAgencyUtils;

/**
 * Created by Влад on 29.11.2016.
 */
public class Run {

    public static void main(String[] args) {

        DataBase dataBase = new DataBase();
        UserController user = new UserController(dataBase);
        AdminController admin = new AdminController(dataBase);

        for (int i = 0; i < 5; i++) {
            dataBase.getTours().add(TravelAgencyUtils.generateTour());
        }

        ClientView view = new ClientView(admin, user);

        view.start();

    }

}
