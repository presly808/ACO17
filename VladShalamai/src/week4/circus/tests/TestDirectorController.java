package week4.circus.tests;

import week4.circus.controller.DirectorController;
import week4.circus.model.*;
import week4.circus.model.interfaces.DrinkCapable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Влад on 04.12.2016.
 */
public class TestDirectorController {

    public static void main(String[] args) {


        testShowAllArtists();
        testHireNewStrongman();
        testHireNewAcrobat();
        testHireNewEquilibrist();
        testDismissMoreDrinking();
        testOrderToPerform();
        testGetCountOfPerform();
        tsstPay();
        testChangePlace();
    }

    private static void testChangePlace() {

        List<Artist> artists = new ArrayList<>();
        initArtists(artists);
        DirectorController director = new DirectorController(new Circus(artists, "Kiev", 10000));

        director.changePlace();

        System.out.println("changePlace() is " + !director.getCircus().getPlace().equals("Kiev"));

    }

    private static void tsstPay() {

        List<Artist> artists = new ArrayList<>();
        initArtists(artists);
        DirectorController director = new DirectorController(new Circus(artists, "Kiev", 10000));

        director.pay();

        System.out.println("pay() is " + (artists.get(0).getMoney() == 1000 && artists.get(4).getMoney() == 3000));

    }

    private static void testGetCountOfPerform() {

        List<Artist> artists = new ArrayList<>();
        initArtists(artists);
        DirectorController director = new DirectorController(new Circus(artists, "Kiev", 10000));

        director.orderToPerform(artists.get(0));
        director.orderToPerform(artists.get(1));
        director.orderToPerform(artists.get(1));

        String actual = director.getCountOfPerform();

        System.out.println("getCountOfPerform() is " + (actual.contains("Alex") &&
                actual.contains("1") && actual.contains("2")));

    }

    private static void testOrderToPerform() {

        List<Artist> artists = new ArrayList<>();
        initArtists(artists);
        DirectorController director = new DirectorController(new Circus(artists, "Kiev", 10000));

        director.orderToPerform(artists.get(0));
        director.orderToPerform(artists.get(1));
        director.orderToPerform(artists.get(1));

        System.out.println("orderToPerform() is " +
                (artists.get(0).getCountOfPerform() == 1 && artists.get(1).getCountOfPerform() == 2));

    }

    private static void testDismissMoreDrinking() {

        List<Artist> artists = new ArrayList<>();
        initArtists(artists);
        DirectorController director = new DirectorController(new Circus(artists, "Kiev", 10000));

        DrinkCapable acrobat1 = (Acrobat) artists.get(0);
        DrinkCapable acrobat2 = (Acrobat) artists.get(1);
        DrinkCapable equilibrist = (Equilibrist) artists.get(2);

        acrobat1.drink();
        acrobat1.drink();
        acrobat1.drink();

        acrobat2.drink();
        acrobat2.drink();

        equilibrist.drink();

        Artist expected = artists.get(0);
        Artist actual = director.dismissMoreDrinking();

        System.out.println("dismissMoreDrinking() is " + actual.equals(expected));

    }

    private static void testHireNewEquilibrist() {

        List<Artist> artists = new ArrayList<>();
        initArtists(artists);
        DirectorController director = new DirectorController(new Circus(artists, "Kiev", 10000));

        director.hireNewEquilibrist("Misha", 23, 2600);

        int expected = 7;
        int actual = director.getCircus().getArtists().size();

        System.out.println("hireNewEquilibrist() is " + (actual == expected));

    }

    private static void testHireNewAcrobat() {

        List<Artist> artists = new ArrayList<>();
        initArtists(artists);
        DirectorController director = new DirectorController(new Circus(artists, "Kiev", 10000));

        director.hireNewAcrobat("Anton", 20, 2400, 20);

        int expected = 7;
        int actual = director.getCircus().getArtists().size();

        System.out.println("hireNewAcrobat() is " + (actual == expected));

    }

    private static void testHireNewStrongman() {

        List<Artist> artists = new ArrayList<>();
        initArtists(artists);
        DirectorController director = new DirectorController(new Circus(artists, "Kiev", 10000));

        director.hireNewStrongMen("Ivan", 34, 3000, 300);

        int expected = 7;
        int actual = director.getCircus().getArtists().size();

        System.out.println("hireNewStrongman() is " + (actual == expected));
    }

    private static void testShowAllArtists() {

        List<Artist> artists = new ArrayList<>();
        initArtists(artists);
        DirectorController director = new DirectorController(new Circus(artists, "Kiev", 10000));

        String actual = director.showAllArtist();
        System.out.println("showAllArtists() is " + (actual.contains("Alex") && actual.contains("19")));

    }

    private static void initArtists(List<Artist> artists) {
        artists.add(new Acrobat("John", 19, 1000, 500));
        artists.add(new Acrobat("Mike", 22, 1000, 700));
        artists.add(new Equilibrist("Kevin", 23, 2000));
        artists.add(new Equilibrist("Ivan", 23, 2000));
        artists.add(new StrongMen("Mark", 22, 3000, 1100));
        artists.add(new StrongMen("Alex", 20, 3000, 530));
    }

}
