package oop.week2.student;

import oop.week2.student.*;

import java.util.ArrayList;

/**
 * Created by Victoria on 12/4/2016.
 */
public class Zalikovka {
    public int nbOfMarks = 0;
    private int mark;
    private Subject subject;
    private int studentWorkedHours;
    ArrayList<StudentSubject> studentSubjects = new ArrayList();

    public void addSubject(Subject subject) {
        studentSubjects.add(new StudentSubject((subject)));
    }

    public void setStudentWorkedHours(int studentWorkedHours, Subject subject) {
        this.studentWorkedHours = studentWorkedHours;
    }

    public void calculateMark(Subject subject) {

        if (subject == null) {
            return;
        }
        double percent = ((studentWorkedHours / 100));
        if (percent * 80 >= subject.getHoursPerSemester()) {
            mark = 5;
        } else if (percent * 60 >= subject.getHoursPerSemester()) {
            mark = 4;
        } else if (percent * 40 >= subject.getHoursPerSemester()) {
            mark = 3;
        } else {
            mark = 1;
        }
        System.out.println("student's mark for " + subject.getName() + " is " + mark);
        nbOfMarks++;
    }

    public void calculateAverageMark() {
        int totalmark = 0;
        for (StudentSubject currentStudentSubject : studentSubjects) {
            totalmark = totalmark + currentStudentSubject.getMark();
        }
        if (nbOfMarks > 0) {
            int avg = totalmark / nbOfMarks;
            System.out.println("Average mark is" + avg);
        }

    }


}


