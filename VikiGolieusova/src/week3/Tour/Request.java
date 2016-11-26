package week3.Tour;

public class Request {
    private String name;
    private String phone;
    private int id;
    private MyDate dateRequest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MyDate getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(MyDate dateRequest) {
        this.dateRequest = dateRequest;
    }

}
