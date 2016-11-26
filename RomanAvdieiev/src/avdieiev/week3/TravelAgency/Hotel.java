package avdieiev.week3.TravelAgency;

public class Hotel {
    private String name;
    private Adress adress;
    private long price;
    private int rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {

        return name;
    }

    public Adress getAdress() {
        return adress;
    }

    public long getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}
