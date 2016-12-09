package avdieiev.week3.TravelAgency.model;


public class Tour {
    private int ID;
    private long price;
    private MyDate date;
    private String transport;
    private Hotel hotel;

    public Tour(int ID, long price, MyDate date, String transport, Hotel hotel) {
        this.ID = ID;
        this.price = price;
        this.date = date;
        this.transport = transport;
        this.hotel = hotel;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {

        return ID;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public long getPrice() {
        return price;
    }

    public MyDate getDate() {
        return date;
    }

    public String getTransport() {
        return transport;
    }

    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "ID=" + ID +
                ", price=" + price +
                ", date=" + date.toString() +
                ", transport='" + transport + '\'' +
                ", hotel=" + hotel.toString() +
                '}';
    }
}
