package travelagency.model;

/**
 * Created by Влад on 26.11.2016.
 */
public class Tour {

    private static int count = 1;
    private int id;
    private String name;
    private long price;
    private MyDate startDate;
    private MyDate endDate;
    private String transport;
    private Hotel hotel;

    public Tour(String name, long price, MyDate startDate, MyDate endDate, String transport, Hotel hotel) {
        this.id = count++;
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.transport = transport;
        this.hotel = hotel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public MyDate getStartDate() {
        return startDate;
    }

    public void setStartDate(MyDate startDate) {
        this.startDate = startDate;
    }

    public MyDate getEndDate() {
        return endDate;
    }

    public void setEndDate(MyDate endDate) {
        this.endDate = endDate;
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

    public String toString() {

        return String.format("id: %d\t\t%s\nwhere? %s\thow much? %d$\twhen? %d/%d/%d - %d/%d/%d" +
                        "\nhotel: %s, rating: %d, price: %s$\ntransportation by %s\n\n", this.id, this.name,
                this.hotel.getAddress().getCountry(), this.price / 100,
                this.startDate.getDay(), this.startDate.getMonth(),
                this.startDate.getYear(), this.endDate.getDay(),
                this.endDate.getMonth(), this.endDate.getYear(),
                this.hotel.getName(), this.hotel.getRating(),
                this.hotel.getPrice() / 100,this.transport);
    }
}
