package week3.tourAgency.models;

public class Hotel {

    private String name;
    private Address address;
    private int price;
    private int rating;

    public Hotel() {
    }

    public Hotel(String name, Address address, int price, int rating) {

        if (name == null || address == null || price <= 0 || rating <= 0 || rating > 6) {
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

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
                ", address=" + address +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (price != hotel.price) return false;
        if (rating != hotel.rating) return false;
        if (name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        return address != null ? address.equals(hotel.address) : hotel.address == null;

    }
}
