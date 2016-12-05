package week3.rozetka.models;

public class Address {

    private String country;
    private String city;
    private String street;
    private int houseNum;
    private int flatNum;

    public Address() {
    }

    public Address(String country, String city, String street, int houseNum, int flatNum) {

        if (country == null || city == null || street == null || houseNum <= 0 || flatNum <= 0) {
            return;
        }

        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
        this.flatNum = flatNum;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public int getFlatNum() {
        return flatNum;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNum=" + houseNum +
                ", flatNum=" + flatNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (houseNum != address.houseNum) return false;
        if (flatNum != address.flatNum) return false;
        if (country != null ? !country.equals(address.country) : address.country != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        return street != null ? street.equals(address.street) : address.street == null;
    }
}
