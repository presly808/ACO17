package tourAgency.models;

public class User {

    private String name;
    private int money;
    private String email;
    private int id;

    private Tour expected;

    public User(String name, int money, String email, int id) {

        if (name == null || money < 0 || email == null || id < 0) {
            return;
        }

        this.name = name;
        this.money = money;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setExpected(Tour expected) {
        this.expected = expected;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;

        if (obj == null) {
            return false;
        }

        return user.getName().equals(this.getName()) && user.getEmail().equals(this.getEmail()) &&
                user.getId() == this.getId();
    }
}
