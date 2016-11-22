package university;

public class SubjectList {

    public static Subject algebra() {
        return new Subject("algebra", 180, 3);
    }

    public static Subject geometry() {
        return new Subject("geometry", 180, 4);
    }

    public static Subject geography() {
        return new Subject("geography", 130, 2);
    }

    public static Subject it() {
        return new Subject("it", 130, 3);
    }

    public static Subject Biology() {
        return new Subject("biology", 130, 4);
    }

    public static Subject Chemistry() {
        return new Subject("chemistry", 150, 3);
    }

    public static Subject History() {
        return new Subject("history", 190, 3);
    }

    public static Subject english() {
        return new Subject("english", 170, 3);
    }
}
