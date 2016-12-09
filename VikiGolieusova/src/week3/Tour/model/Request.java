package week3.Tour.model;


import java.util.Calendar;
import java.util.Date;

public class Request {
    private String name;
    private String phone;
    private int id;
    private Date dateRequest;

    public Request(int id, String name, String phone, Date dateRequest) {
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.dateRequest = dateRequest;
    }

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

    public Date getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(Date dateRequest) {
        this.dateRequest = dateRequest;
    }
}
