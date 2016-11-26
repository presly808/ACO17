package avdieiev.week3.TravelAgency;


public class Tour {
    private int ID;
    private long price;
    private MyDate date;
    private String transport;
    private Hotel hotel;

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
}
