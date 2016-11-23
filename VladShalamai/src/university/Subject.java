package university;


public class Subject {

    private String name;
    private int hoursInSemester;
    private int workedHours;
    private int mark;

    public Subject(String name, int hoursInSemester, int mark) {
        this.name = name;
        this.hoursInSemester = hoursInSemester;
        this.workedHours = 0;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursInSemester() {
        return hoursInSemester;
    }

    public void setHoursInSemester(int hoursInSemester) {
        this.hoursInSemester = hoursInSemester;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public boolean passExam() {

        return (hoursInSemester - workedHours) < 20;
    }

    public String showInfo() {

        return String.format("subject: %s, hoursInSemester: %d, workedHours: %d, mark: %d",
                name, hoursInSemester, workedHours, mark);
    }
}
