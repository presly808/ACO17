package university.test;

import university.Student;
import university.Subject;
import university.SubjectList;

public class TestStudent {
    public static void main(String[] args) {

        System.out.println("testAddSubject() --> " + testAddSubject());
        System.out.println("testRemoveSubject() --> " + testRemoveSubject());
        System.out.println("testTestLearn() --> " + testLearn());
        System.out.println("testAddEnergy() --> " + testAddEnergy());
        System.out.println("testShowInfo() --> " + testShowInfo());
    }

    private static boolean testAddSubject() {
        Student student = new Student("Max", "192.65.29", 10000);
        student.addSubject(SubjectList.algebra());
        student.addSubject(SubjectList.english());
        student.addSubject(SubjectList.Biology());

        return student.getSubjects()[0] != SubjectList.algebra()
                && student.getSubjects()[1] != SubjectList.english()
                && student.getSubjects()[2] != SubjectList.Biology();
    }

    private static boolean testRemoveSubject() {
        Student student = new Student("Max", "192.65.29", 10000);
        student.addSubject(SubjectList.algebra());
        student.addSubject(SubjectList.english());
        student.addSubject(SubjectList.Biology());

        student.removeSubject(2);

        return student.getSubjects().length == 2 && student.getSubjects()[1] != SubjectList.english();
    }

    private static boolean testLearn() {
        Subject subject = SubjectList.algebra();
        Student student = new Student("Max", "192.65.29", 10000);
        student.addSubject(subject);

        for (int i = 0; i < 6; i++) {
            student.learn("algebra");
        }

        return subject.getLearned() == 6 && student.getEnergy() == (100 - (subject.getEnergyByPoint() * 6));
    }

    private static boolean testAddEnergy() {
        Student student = new Student("Max", "192.65.29", 10000);
        student.addSubject(SubjectList.geometry());

        for (int i = 0; i < 50; i++) {
            student.learn("geometry");
        }

        student.addEnergy();
        student.addEnergy();

        return student.getEnergy() == 4 && student.getMoney() == 9992;
    }

    private static boolean testShowInfo() {
        Student student = new Student("Max", "192.65.29", 10000);
        String info = student.showInfo();

        return info.contains(student.getName()) && info.contains(student.getAddress())
                && info.contains(student.getMoney() + "") && info.contains(student.getEnergy() + "");
    }
}
