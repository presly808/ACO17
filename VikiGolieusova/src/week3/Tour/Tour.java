package week3.Tour;

public class Tour {
    private int idTour;
    private long price;
    private MyDate date;
    private String transport;
    private Hotel hotel;


    public Tour(int idTour, MyDate date, Hotel hotel, String transport, long price) {
        this.idTour = idTour;
        this.date = date;
        this.hotel = hotel;
        this.transport = transport;
        this.price = price;
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
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