package travelagency.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Влад on 26.11.2016.
 */
public class Request {

    private int id;
    private MyClient client;
    private GregorianCalendar date;

    public Request(int id, MyClient client, GregorianCalendar date) {
        this.id = id;
        this.client = client;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("id: %d, \t\tname: %s\ttime: %d/%d/%d \nphone: %s, email:%s\n", this.id,
                this.client.getName(), this.date.get(Calendar.DATE), this.date.get(Calendar.MONTH),
                this.date.get(Calendar.YEAR), this.client.getPhone(), this.client.getEmail());
    }
}
