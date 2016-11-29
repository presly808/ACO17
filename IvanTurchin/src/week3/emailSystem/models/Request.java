package week3.emailSystem.models;

public class Request {

    private int creatorId;
    private int receiverId;
    private Letter letter;

    public Request(int creatorId, int receiverId, Letter letter) {

        if (creatorId < 0 || receiverId < 0 || creatorId == receiverId || letter == null) {
            return;
        }

        this.creatorId = creatorId;
        this.receiverId = receiverId;
        this.letter = letter;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public Letter getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return "Request{" +
                "creatorId=" + creatorId +
                ", receiverId=" + receiverId +
                ", letter=" + letter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        if (creatorId != request.creatorId) return false;
        if (receiverId != request.receiverId) return false;
        return letter != null ? letter.equals(request.letter) : request.letter == null;
    }
}

