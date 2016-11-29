package week3.emailSystem.models;

public class FriendRequest {

    private User creator;
    private int idReceiver;
    private Date date;
    private Letter letter;

    public FriendRequest(User creator, int idReceiver, Date date, Letter letter) {

        if (creator == null || idReceiver < 0 || date == null || letter == null) {
            return;
        }

        this.creator = creator;
        this.idReceiver = idReceiver;
        this.date = date;
        this.letter = letter;
    }

    public User getCreator() {
        return creator;
    }

    public int getIdReceiver() {
        return idReceiver;
    }

    public Date getDate() {
        return date;
    }

    public Letter getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return "FriendRequest{" +
                "creator=" + creator +
                ", idReceiver=" + idReceiver +
                ", date=" + date +
                ", letter=" + letter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FriendRequest that = (FriendRequest) o;

        if (idReceiver != that.idReceiver) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        return letter != null ? letter.equals(that.letter) : that.letter == null;

    }
}
