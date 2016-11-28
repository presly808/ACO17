package avdieiev.week3.TravelAgency.db;


import avdieiev.week3.TravelAgency.Hotel;
import avdieiev.week3.TravelAgency.MyDate;
import avdieiev.week3.TravelAgency.Tour;

public class InitDataBase {

    public static Tour generateTours() {
        int ID = generateID();
        long price = generatePrice();
        MyDate date = ;
        String transport = generateTransport();
        Hotel hotel = ;

        return new Tour( ID, price, date, transport, hotel);
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

