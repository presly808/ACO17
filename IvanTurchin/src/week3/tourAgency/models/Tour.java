package week3.tourAgency.models;

public class Tour {

    private String name;
    private int price;
    private Date startDate;
    private String transport;
    private Hotel hotel;

    public Tour() {
    }

    public Tour(String name, int price, Date startDate, String transport, Hotel hotel) {

        if (name == null || price <= 0 || startDate == null || transport == null || hotel == null) {
            return;
        }

        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.transport = transport;
        this.hotel = hotel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", startDate=" + startDate +
                ", transport='" + transport + '\'' +
                ", hotel=" + hotel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tour tour = (Tour) o;

        if (price != tour.price) return false;
        if (startDate != null ? !startDate.equals(tour.startDate) : tour.startDate != null) return false;
        if (transport != null ? !transport.equals(tour.transport) : tour.transport != null) return false;
        return hotel != null ? hotel.equals(tour.hotel) : tour.hotel == null;

    }
}
