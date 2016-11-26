package tourAgency.models;

public class Request {

    private User user;
    private Tour tour;
    private Date date;

    public Request(User user, Tour tour) {

        if (user == null || tour == null) {
            return;
        }

        this.user = user;
        this.tour = tour;
    }

    public User getUser() {
        return user;
    }

    public Tour getTour() {
        return tour;
    }

    @Override
    public String toString() {
        return "Request{" +
                "user=" + user +
                ", tour=" + tour +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        Request request = (Request) obj;

        if (obj == null) {
            return false;
        }

        return request.user.equals(this.user) && this.tour.equals(request.tour);
    }
}
