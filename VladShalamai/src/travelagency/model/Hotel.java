package travelagency.model;


/**
 * Created by Влад on 26.11.2016.
 */
public class Hotel {

    private String name;
    private Address address;
    private long price;
    private int rating;

    public Hotel(String name, Address address, long price, int rating) {
        this.name = name;
        this.address = address;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
