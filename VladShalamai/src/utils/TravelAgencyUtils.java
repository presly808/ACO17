package utils;

import travelagency.model.*;

import java.util.GregorianCalendar;


/**
 * Created by Влад on 26.11.2016.
 */
public class TravelAgencyUtils {

    public static Tour generateTour() {

        return new Tour(generateName(), generateNum(100000, 400000), generateDate(2),
                        generateDate(3), generateTransport(), generateHotel());
    }

    public static Tour generateTour(long price) {

        return new Tour(generateName(), price * 100, generateDate(2),
                generateDate(3), generateTransport(), generateHotel());
    }

    public static Tour generateTour(String country) {

        return new Tour(generateName(), generateNum(100000, 400000), generateDate(2),
                generateDate(3), generateTransport(), generateHotel(country));
    }

    public static int generateNum(int left, int right) {
        return left + (int) (Math.random() * (right - left));
    }

    public static String generateName() {

        String[] names = {"Nature of Kashmir", "Best of Kerala", "Southern Triangle",
                "Himachal Tour Packages", "Charming Uttaranchal"};

        return names[generateNum(0, names.length)];
    }

    public static GregorianCalendar generateDate(int month) {
        return new GregorianCalendar(2017, month,
                generateNum(0, 31));
    }

    public static String generateTransport() {
        String[] transport = {"plane", "bus", "helicopter", "bicycle"};

        return transport[generateNum(0, transport.length)];
    }

    public static Hotel generateHotel() {
        String[] names = {"Nihiwatu", "The Spectator", "Huka Lodge", "Southern Ocean Lodge", "Montage Kapalua Bay"};
        Address[] address = {new Address("India", "Deli", "Crishnu-street", 23),
                new Address("India", "NewDeli", "Some-street", 56),
                new Address("USA", "New-York", "Wall-street", 34),
                new Address("Greece", "Athens", "Musaka-street", 12),
                new Address("Ukraine", "Kiev", "Kreshchatyk-street", 9)};

        return new Hotel(names[generateNum(0, names.length)], address[generateNum(0, address.length)],
                generateNum(100000, 300000), generateNum(3, 6));
    }

    public static Hotel generateHotel(String country) {
        String[] names = {"Nihiwatu", "The Spectator", "Huka Lodge", "Southern Ocean Lodge", "Montage Kapalua Bay"};
        Address[] address = {new Address(country, "Deli", "Crishnu-street", 23),
                new Address(country, "NewDeli", "Some-street", 56),
                new Address(country, "New-York", "Wall-street", 34),
                new Address(country, "Athens", "Musaka-street", 12),
                new Address(country, "Kiev", "Kreshchatyk-street", 9)};

        return new Hotel(names[generateNum(0, names.length)], address[generateNum(0, address.length)],
                generateNum(100000, 300000), generateNum(3, 6));
    }

}
