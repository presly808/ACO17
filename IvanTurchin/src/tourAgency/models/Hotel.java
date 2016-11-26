package tourAgency.models;

public class Hotel {

    private String name;
    private Address address;
    private int price;
    private int rating;

    public Hotel(String name, Address address, int price, int rating) {

        if (name == null || address == null) {
            return;
        }

        this.name = name;
        this.address = address;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
