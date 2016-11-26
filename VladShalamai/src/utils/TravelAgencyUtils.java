package utils;

import travelagency.*;


/**
 * Created by Влад on 26.11.2016.
 */
public class TravelAgencyUtils {

    public static int generateNum(int left, int right) {
        return left + (int) (Math.random() * (right - left));
    }


    public static MyDate generateDate(int year) {
        return new MyDate(year, generateNum(0, 12),
                generateNum(0, 30), new MyTime(generateNum(0, 23), generateNum(0, 60)));
    }

    public static String generateTransport() {
        String[] transport = {"plane", "bus", "helicopter", "bicycle"};

        return transport[generateNum(0, transport.length)];
    }

    public static Hotel generateHotel() {
        String[] names = {};
        Address[] address = {new Address("India", "Deli", "Crishnu-street", 23),
                new Address("India", "NewDeli", "Some-street", 56),
                new Address("USA", "New-York", "Wall-street", 34),
                new Address("Greece", "Athens", "Musaka-street", 12),
                new Address("Ukraine", "Kiev", "Kreshchatyk-street", 9)};

        return new Hotel(names[generateNum(0, names.length)], address[generateNum(0, address.length)],
                generateNum(100000, 300000), generateNum(3, 5));
    }


}
