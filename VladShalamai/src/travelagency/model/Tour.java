package travelagency.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Влад on 26.11.2016.
 */
public class Tour {

    private static int count = 1;
    private int id;
    private String name;
    private long price;
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;
    private String transport;
    private Hotel hotel;

    public Tour(String name, long price, GregorianCalendar startDate, GregorianCalendar endDate, String transport, Hotel hotel) {
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public String toString() {

        return String.format("id: %d\t\t%s\nwhere? %s\thow much? %d$\twhen? %d/%d/%d - %d/%d/%d" +
                        "\nhotel: %s, rating: %d, price: %s$\ntransportation by %s\n\n", this.id, this.name,
                this.hotel.getAddress().getCountry(), this.price / 100,
                this.startDate.get(Calendar.DATE), this.startDate.get(Calendar.MONTH),
                this.startDate.get(Calendar.YEAR), this.endDate.get(Calendar.DATE),
                this.endDate.get(Calendar.MONTH), this.endDate.get(Calendar.YEAR),
                this.hotel.getName(), this.hotel.getRating(),
                this.hotel.getPrice() / 100,this.transport);
    }
}
