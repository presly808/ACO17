package tourAgency.models;

public class Tour {

    private String name;
    private String country;
    private int id;
    private int price;
    private Date startDay;
    private Date endDate;
    private String transport;
    private Hotel hotel;

    public Tour(String name, String country, int id, int price, Date startDay, Date endDate, String transport, Hotel hotel) {

        if (id < 0 || country == null || price < 0 || startDay == null ||
                endDate == null || transport == null || hotel == null || name == null) {
            return;
        }

        this.name = name;
        this.country = country;
        this.id = id;
        this.price = price;
        this.startDay = startDay;
        this.endDate = endDate;
        this.transport = transport;
        this.hotel = hotel;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Date getStartDay() {
        return startDay;
    }

    public Date getEndDate() {
        return endDate;
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
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", startDay=" + startDay +
                ", endDate=" + endDate +
                ", transport='" + transport + '\'' +
                ", hotel=" + hotel +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        Tour tour = (Tour) obj;

        if (tour == null) {
            return false;
        }

        return tour.getName().equals(this.name) && tour.getCountry().equals(this.country)
                && tour.getId() == this.id && tour.getHotel() == this.hotel &&
                tour.getStartDay() == this.startDay && tour.getEndDate() == this.endDate
                && tour.getTransport().equals(this.transport);
    }
}
