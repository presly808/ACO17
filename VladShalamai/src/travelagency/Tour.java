package travelagency;

/**
 * Created by Влад on 26.11.2016.
 */
public class Tour {

    private int id;
    private long price;
    private MyDate startDate;
    private MyDate endDate;
    private String transport;
    private Hotel hotel;

    public Tour(int id, long price, MyDate startDate, MyDate endDate, String transport, Hotel hotel) {
        this.id = id;
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
}
