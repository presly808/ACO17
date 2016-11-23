package oop.week2;

/**
 * Created by Victoria on 11/23/2016.
 */
public class TestBike {
    public static void main(String[] args) {

        Bike bikeEve = new Bike("Germany", "eve", true, 150);
        System.out.println(bikeEve.getModelB());

        String bikeModel = bikeEve.getModelB();
        bikeEve.setColour("PinkBlack");
        String bikeColour = bikeEve.getColour();
        System.out.println("Model of bike is " + bikeModel.toUpperCase());
        System.out.println("Colour of bike is " + bikeColour.toUpperCase());

        Bike fire = new Bike("fire");
        int i = Bike.globalId;
        fire.setModelB(null);
        System.out.println(fire);

    }


    BikeShop shop1 = new BikeShop("VeloOnline", "Kiev", "Lva Tolstogo", true);
    BikeShop shop2 = new BikeShop("VeloMater", "Kiev", "podilska", false);
}

