package oop.week2.student;

/**
 * Created by Victoria on 12/4/2016.
 */
public class Subject {

    private int hoursPerSemester;
    private String name;

    public Subject(int hoursPerSemester, String name) {
        this.hoursPerSemester = hoursPerSemester;
        this.name = name;
    }

    public int getHoursPerSemester() {
        return hoursPerSemester;
    }

    public void showHoursWorkedByStudent(Student student, Subject subject, int spentHours) {
        System.out.println("You worked on " + subject + " for " + spentHours);

    }

    public void getStudentmark(Student student) {
    }

    public String getName() {
        return name;
    }

    public void setHoursPerSemester(int hoursPerSemester) {
        this.hoursPerSemester = hoursPerSemester;
    }

}
