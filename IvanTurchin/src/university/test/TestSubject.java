package university.test;

import university.Student;
import university.Subject;
import university.SubjectList;

public class TestSubject {

    public static void main(String[] args) {

        System.out.println("testGetMark() --> " + testGetMark());
        System.out.println("testPassExam() --> " + testPassExam());
        System.out.println("testPassExam(int money) --> " + testPassExam2());
        System.out.println("testShowInfo() --> " + testShowInfo());
    }

    private static boolean testGetMark() {
        Subject subject = SubjectList.Chemistry();
        subject.getMark(8);
        subject.getMark(10);

        return subject.getMarks()[0] == 4 && subject.getMarks()[1] == 5;
    }

    private static boolean testPassExam() {
        Student student = new Student("Max", "192.45.12", 20000);
        Subject subject = SubjectList.algebra();
        student.addSubject(subject);

        for (int i = 0; i < 180; i++) {
            student.learn("algebra");
            for (int j = 0; j < 3; j++) {
                student.addEnergy();
            }
        }

        subject.getMark(22);
        subject.getMark(20);
        subject.passExam();

        return subject.isExam();
    }

    private static boolean testPassExam2() {
        Subject subject = SubjectList.History();
        subject.passExam(6000);
        return subject.isExam();
    }

    private static boolean testShowInfo() {
        Subject subject = SubjectList.it();
        String info = subject.showInfo();

        return info.contains(subject.getName()) && info.contains(subject.getAverage() + "") &&
                info.contains(subject.getToLearn() + "");
    }
}
