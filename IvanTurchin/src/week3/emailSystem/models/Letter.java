package week3.emailSystem.models;

public class Letter {

    private int ownerId;
    private int receiverId;
    private String title;
    private String context;
    private Date created;

    public Letter(int ownerId, int receiverId, String title, String context, Date created) {

        if (ownerId < 0 || title == null || context == null || created == null)

        this.ownerId = ownerId;
        this.receiverId = receiverId;
        this.title = title;
        this.context = context;
        this.created = created;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public String getTitle() {
        return title;
    }

    public String getContext() {
        return context;
    }

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "ownerId=" + ownerId +
                ", receiverId=" + receiverId +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", created=" + created +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Letter letter = (Letter) o;

        if (ownerId != letter.ownerId) return false;
        if (title != null ? !title.equals(letter.title) : letter.title != null) return false;
        if (context != null ? !context.equals(letter.context) : letter.context != null) return false;
        return created != null ? created.equals(letter.created) : letter.created == null;

    }
}
