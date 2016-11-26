package week3.tourAgency.models;

import week3.tourAgency.models.templates.Admin;
import week3.tourAgency.models.templates.User;

public class Request {

    private User user;
    private Tour tour;
    private Date date;
    private boolean isConfirmed = false;

    public Request(User user, Tour tour, Date date) {

        if (user == null || tour == null || date == null) {
            return;
        }

        this.user = user;
        this.tour = tour;
        this.date = date;
    }

    public void confirm(Admin admin) {

        isConfirmed = admin != null;
    }

    public User getUser() {
        return user;
    }

    public Tour getTour() {
        return tour;
    }

    public Date getDate() {
        return date;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    @Override
    public String toString() {
        return "Request{" +
                "user=" + user +
                ", tour=" + tour +
                ", date=" + date +
                ", isConfirmed=" + isConfirmed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        return request.getUser().equals(((Request) o).getUser()) &&
                request.getTour().equals(((Request) o).getTour());

    }
}
