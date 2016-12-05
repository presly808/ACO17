package week3.rozetka.models;

public class User {

    private String name;
    private String email;
    private int money;
    private int id;
    private String password;
    private Address address;

    public User() {
    }

    public User(String name, String email, int money, String password, Address address) {

        if (name == null || email == null || password == null || address == null) {
            return;
        }

        this.name = name;
        this.email = email;
        this.money = money;
        this.password = password;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getMoney() {
        return money;
    }

    public String getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", money=" + money +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        return password != null ? !password.equals(user.password) : user.password != null;
    }
}
