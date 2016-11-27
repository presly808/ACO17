package week3.travel.model;

/**
 * Created by serhii on 11/26/16.
 */
public class MyAddress {


    private String country;
    private String city;
    private String street;
    private String houseNum;

    public MyAddress() {
    }

    public MyAddress(String country, String city, String street, String houseNum) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }
}
