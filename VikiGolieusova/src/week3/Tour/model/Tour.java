package week3.Tour.model;

import week3.Tour.model.Hotel;
import week3.Tour.model.MyDate;

public class Tour {
    private int idTour;
    private long price;
    private MyDate startDate;
    private MyDate endDate;
    private String transport;
    private Hotel hotel;

    public Tour(int idTour, MyDate startDate, MyDate endDate, Hotel hotel, String transport, long price) {
        this.idTour = idTour;
        this.endDate = endDate;
        this.startDate = startDate;
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
//    public String asString() {
//        String result = "";
//        for (int i = 0; i < bs.tours.length; i++) {
//            if (tours[i] != null) {
//                Tour current = tours[i];
//                result += "Tour ID: " + current.getIdTour() + ", price: " + current.getPrice() + "\n"
//                        +", start of tour: " + current.getStartDate() + ", end of tour: " + current.getEndDate() + ", transport: " +current.getTransport()+ "\n"
//                        +",hotel: " + current.getTransport() + "\n";
//            }
//        }
//        return result;
//    }

    @Override
    public String toString() {
        return "Tour{" +
                "idTour=" + idTour +
                ", price=" + price +
                ", startDate=" + startDate.toString() +
                ", endDate=" + endDate.toString() +
                ", transport='" + transport + '\'' +
                ", hotel=" + hotel.toString() +
                '}';
    }
}