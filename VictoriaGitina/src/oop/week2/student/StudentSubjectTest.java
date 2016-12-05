package oop.week2.student;

import oop.week2.student.*;

/**
 * Created by Victoria on 12/4/2016.
 */
public class StudentSubjectTest {
    public static void main(String[] args) {

        Zalikovka myZalikovka = new Zalikovka();
        Subject math = new Subject(150, "Math");
        Subject french = new Subject(80, "French");

        Student tonia = new Student("Tonia", myZalikovka);

        math.setHoursPerSemester(150);
        french.setHoursPerSemester(80);

        myZalikovka.addSubject(math);
        myZalikovka.addSubject(french);

        StudentSubject toniaFrench = new StudentSubject(french);
        StudentSubject toniaMath = new StudentSubject(math);

        toniaFrench.setHoursByStudent(40);
        toniaMath.setHoursByStudent(200);


        myZalikovka.calculateMark(math);
        myZalikovka.calculateMark(french);


        myZalikovka.calculateAverageMark();
        myZalikovka.calculateAverageMark();


    }


}
