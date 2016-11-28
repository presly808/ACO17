package travelagency.model;

/**
 * Created by Влад on 26.11.2016.
 */
public class Request {

    private int id;
    private MyClient client;
    private MyDate date;

    public Request(int id, MyClient client, MyDate date) {
        this.id = id;
        this.client = client;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MyClient getClient() {
        return client;
    }

    public void setClient(MyClient client) {
        this.client = client;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    public String toString() {
        return String.format("id: %d, \t\tname: %s\ttime: %d/%d/%d \nphone: %s, email:%s\n", this.id,
                this.client.getName(), this.date.getDay(), this.date.getMonth(), this.date.getDay(),
                this.client.getPhone(), this.client.getEmail());
    }
}
