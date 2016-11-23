package oop.week2;

/**
 * Created by Victoria on 11/23/2016.
 */
public class BikeShop {
    private String name;
    private String city;
    private String street;
    private boolean openWeekend;

    public BikeShop(String name, String city, String street, boolean openWeekend) {
        this.name = name;
        this.city = city;
        this.street = street;
        this.openWeekend = openWeekend;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public boolean isOpenWeekend() {
        return openWeekend;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setOpenWeekend(boolean openWeekend) {
        this.openWeekend = openWeekend;
    }
}
