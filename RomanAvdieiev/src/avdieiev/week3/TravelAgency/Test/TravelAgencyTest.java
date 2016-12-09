package avdieiev.week3.TravelAgency.Test;

import avdieiev.week3.TravelAgency.controller.UserController;
import avdieiev.week3.TravelAgency.db.DataBase;
import avdieiev.week3.TravelAgency.db.InitDataBase;
import avdieiev.week3.TravelAgency.model.Tour;

public class TravelAgencyTest {
    public static void main(String[] args) {
        Tour[] arrTours = new Tour[10];
        for (int i = 0; i < arrTours.length; i++) {
            arrTours[i] = InitDataBase.generateTours();
        }
        DataBase data = new DataBase();
        UserController uc = new UserController();
        uc.dataBaseUser = data;
        String s1 = uc.findTourByPrice(1000);
        System.out.println(s1);

        Tour tour1 = InitDataBase.generateTours();
        String s = tour1.toString();
        System.out.println(s);

    }
}
