package university;

public class TestSubject {

    public static void main(String[] args) {
        Subject subject = new Subject("Sociology", 100, 4);

        testPassExam(subject);
        testGetMark(subject);
        testShowInfo(subject);

    }

    private static void testShowInfo(Subject subject) {
        String expected = "subject: Sociology, hoursInSemester: 100, workedHours: 0, mark: 4";
        String actual = subject.showInfo();

        System.out.println("method showInfo() is " + actual.equals(expected));
    }

    private static void testGetMark(Subject subject) {
        int expected = 4;
        int actual = subject.getMark();

        System.out.println("method getMark() is " + (expected == actual));
    }

    private static void testPassExam(Subject subject) {

        boolean actual = subject.passExam();

        System.out.println("method passExam() is " + !actual);

    }

}
