package travelagency.model;

/**
 * Created by Влад on 26.11.2016.
 */
public class Address {

    private String country;
    private String city;
    private String street;
    private int houseNum;

    public Address(String country, String city, String street, int houseNum) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNum() {
        return houseNum;
    }

}
