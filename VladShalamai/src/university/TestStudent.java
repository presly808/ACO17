package university;


import utils.SubjectUtils;
import week2.Address;

public class TestStudent {

    public static void main(String[] args) {

        Student student = new Student("John", new Address("Kiev", "Nizhynska", "12"));

        for (int i = 0; i < 10; i++) {
            student.getSubjects()[i] = SubjectUtils.generateSubject(student.getAmountOfSubject());
            student.setAmountOfSubject(student.getAmountOfSubject() + 1);
        }

        testStudy(student);
        testGetGPA(student);
        testShowAllInfo(student);
        testAddSubject(student);
        testRemoveLastSubject(student);

    }

    private static void testRemoveLastSubject(Student student) {

        student.removeLastSubject();

        System.out.println("method removeLastSubject() is " + !student.showAllInfo().contains("English"));
    }

    private static void testAddSubject(Student student) {

        student.addSubject(SubjectUtils.generateSubject(student.getAmountOfSubject()));

        System.out.println("method addSubject() is " + student.showAllInfo().contains("English"));

    }

    private static void testShowAllInfo(Student student) {

        String actual = student.showAllInfo();

        System.out.println("method showAllInfo() is " +
                (actual.contains("politology") && actual.contains("law")));

    }

    private static void testGetGPA(Student student) {

        double gpa = student.getGPA();
        System.out.println("method getGPA() is " + (gpa >= 3));

    }

    private static void testStudy(Student student) {

        student.study("politology");

        int expected = 5;
        int actual = student.getSubjects()[0].getWorkedHours();

        System.out.println("method study() is " + (expected == actual));

    }

}
