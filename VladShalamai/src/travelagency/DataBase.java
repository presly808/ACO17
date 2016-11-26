package travelagency;

import utils.TravelAgencyUtils;

/**
 * Created by Влад on 26.11.2016.
 */
public class DataBase {

    private static final int MAX_SIZE = 30;
    private static Tour[] tours = new Tour[MAX_SIZE];
    private static Request[] requests;

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            tours[i] = new Tour(i, TravelAgencyUtils.generateNum(100000, 300000),
                    TravelAgencyUtils.generateDate(2016), TravelAgencyUtils.generateDate(2017),
                    TravelAgencyUtils.generateTransport(), TravelAgencyUtils.generateHotel());
        }

    }
}
