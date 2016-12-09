package avdieiev.week3.TravelAgency.db;

import avdieiev.week3.TravelAgency.model.*;

public class InitDataBase {

    public static Tour generateTours() {
        int ID = generateID();
        long price = generatePrice();
        MyDate date = generateMyDate();
        String transport = generateTransport();
        Hotel hotel = generateHotel();

        return new Tour(ID, price, date, transport, hotel);
    }

    private static Hotel generateHotel() {
        String[] name = {"SPA RESORT1", "SPA RESORT2", "SPA RESORT3", "SPA RESORT4", "SPA RESORT5"};
        String ranName = name[(int) (Math.random() * name.length)];
        long ranPrice = generatePrice();
        int ranRating = generateNum(1, 5);

        return new Hotel(ranName, generateAdress(), ranPrice, ranRating);
    }

    private static Adress generateAdress() {
        String[] country = {"Turkey", "Egypt", "Bulgaria", "Montenegro", "Albania"};
        String ranCountry = country[(int) (Math.random() * country.length)];
        String[] city = {"City1", "City2", "City3", "City4", "City5"};
        String ranCity = city[(int) (Math.random() * city.length)];
        String[] street = {"Street1", "Street2", "Street3", "Street4", "Street5"};
        String ranStreet = street[(int) (Math.random() * street.length)];
        int ranHouseNumber = generateNum(5,20);
        return new Adress(ranCountry, ranCity, ranStreet, ranHouseNumber);
    }

    private static MyDate generateMyDate() {
        int ranYear = generateNum(2017,2018);
        int ranMonth = generateNum(1, 12);
        int ranDay = generateNum(1,28);
        return new MyDate(ranYear,ranMonth,ranDay);
    }

    private static Time generateTime() {
        int ranHours = generateNum(0,23);
        int ranMinutes = generateNum(0,59);
        return new Time(ranHours, ranMinutes);
    }

    private static int ID = 0;

    private static int generateID() {
        ID++;
        return ID;
    }

    private static String generateTransport() {
        String[] transport = {"Bus", "Plane", "Train"};
        return transport[(int) (Math.random() * transport.length)];
    }

    private static long generatePrice() {
        return generateNum(500, 1500);
    }

    private static int generateNum(int left, int right) {
        return left + (int) (Math.random() * (right - left));
    }



}

