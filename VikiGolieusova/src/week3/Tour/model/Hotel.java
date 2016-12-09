package week3.Tour.model;

import week3.Tour.model.Adress;

public class Hotel {
    private String name;
    private Adress adress;

    private long price;
    private int rating;

    public Hotel(String name, Adress adress, long price, int rating) {
        this.name = name;
        this.adress = adress;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
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

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", adress=" + adress.toString() +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}

