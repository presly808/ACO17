package moto.tests;

import moto.Motorcycle;
import moto.Parking;

public class TestParking {
    public static void main(String[] args) {
        System.out.println("testOpen() && testClose() --> " + testOpen() +
                           "\ntestAddMoto() --> " + testAddMoto() +
                           "\ntestTakeLastMoto() --> " + testTakeLastMoto() +
                           "\ntestAddMotoByPlaceNumber() --> " + testAddMotoByPlaceNumber() +
                           "\ntestTakeMotoByPlaceNumber() --> " + testTakeMotoByPlaceNumber() +
                           "\ntestClearGarage() --> " + testClearGarage() +
                           "\ntestChangeAddress() --> " + testChangeAddress() +
                           "\ntestShowInfo() --> " + testShowInfo());
    }

    private static boolean testOpen() {
        Parking parking = new Parking("192.12.53","parkingKey");

        parking.open("parkingKey");
        boolean t1 = parking.isOpen();

        parking.close("parkingKey");
        boolean t2 = parking.isOpen();

        return t1 && !t2;
    }

    private static boolean testAddMoto() {
        Parking parking = new Parking("192.12.53", "parkingKey");
        Motorcycle motorcycle = new Motorcycle("yamaha", 2000, "yamahaKey");

        parking.open("parkingKey");

        parking.addMoto(motorcycle);
        return parking.getMotos()[0] == motorcycle;
    }

    private static boolean testTakeLastMoto() {
        Parking parking = new Parking("192.12.53", "parkingKey");
        Motorcycle motorcycle = new Motorcycle("yamaha", 2000, "yamahaKey");

        parking.open("parkingKey");
        parking.addMoto(motorcycle);

        Motorcycle take = parking.takeLastMoto();

        return motorcycle.equals(take);
    }

    private static boolean testAddMotoByPlaceNumber() {
        Parking parking = new Parking("192.12.53", "parkingKey");
        Motorcycle motorcycle = new Motorcycle("yamaha", 2000, "yamahaKey");

        parking.open("parkingKey");
        parking.addMotoByPlaceNumber(4, motorcycle);

        return parking.getMotos()[3] == motorcycle;
    }

    private static boolean testTakeMotoByPlaceNumber() {
        Parking parking = new Parking("192.12.53", "parkingKey");
        Motorcycle motorcycle = new Motorcycle("yamaha", 2000, "yamahaKey");

        parking.open("parkingKey");
        parking.addMotoByPlaceNumber(4, motorcycle);

        Motorcycle get = parking.takeMotoByPlaceNumber(4);

        return get.equals(motorcycle);
    }

    private static boolean testClearGarage() {
        Parking parking = new Parking("192.12.53", "parkingKey");
        Motorcycle motorcycle = new Motorcycle("yamaha", 2000, "yamahaKey");
        Motorcycle motorcycle1 = new Motorcycle("suzuki", 3000, "suzukiKey");

        parking.open("parkingKey");
        parking.addMotoByPlaceNumber(4, motorcycle);
        parking.addMotoByPlaceNumber(10, motorcycle1);

        parking.clearGarage();

        for (int i = 0; i < parking.getMotos().length; i++) {
            if (parking.getMotos()[i] != null) {
                return false;
            }
        }

        return true;
    }

    private static boolean testChangeAddress() {
        Parking parking = new Parking("192.12.53", "parkingKey");
        parking.changeAddress("Anni Ahmatovoy 12b");

        return parking.getAddress().equals("Anni Ahmatovoy 12b");
    }

    private static boolean testShowInfo() {
        Parking parking = new Parking("192.12.53", "parkingKey");

        String info = parking.showInfo();

        return info.contains(parking.getAddress()) && info.contains(parking.getKey())
                && info.contains(parking.getAllPlaces() + "");
    }
}
