package oop.week2.student;

import oop.week2.student.*;

/**
 * Created by Victoria on 12/4/2016.
 */
public class StudentSubject {
    private Subject subject;
    private int hoursByStudent;
    private int mark;

    public StudentSubject(Subject subject) {
        this.subject = subject;
    }

    public void setHoursByStudent(int hoursByStudent) {///мені здається, що проблема у цьому методі
        // Я не знаю, як звязати предмет, студента і оцінку
        this.hoursByStudent = hoursByStudent;
    }

    public int getHoursByStudent() {
        return hoursByStudent;
    }

    public int getMark() {
        return mark;
    }

}
