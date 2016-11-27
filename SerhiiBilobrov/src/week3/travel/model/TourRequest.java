package week3.travel.model;

/**
 * Created by serhii on 11/26/16.
 */
public class TourRequest {

    private int tourId;
    private MyClient client;
    private MyDate creationDate;

    public TourRequest(int tourId, MyClient client, MyDate creationDate) {
        this.tourId = tourId;
        this.client = client;
        this.creationDate = creationDate;
    }

    public TourRequest() {
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public MyClient getClient() {
        return client;
    }

    public void setClient(MyClient client) {
        this.client = client;
    }

    public MyDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(MyDate creationDate) {
        this.creationDate = creationDate;
    }
}
