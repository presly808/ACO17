package university;

import week2.Address;


public class Student {

    private static final int MAX_SIZE = 10;
    private String name;
    private Address address;
    private Subject[] subjects = new Subject[MAX_SIZE];
    private int amountOfSubject;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
        this.amountOfSubject = 0;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public int getAmountOfSubject() {
        return amountOfSubject;
    }

    public void setAmountOfSubject(int amountOfSubject) {
        this.amountOfSubject = amountOfSubject;
    }


    public void study(String subject) {

        if (subject == null) {
            System.out.println("incorrect subject");
        }

        for (int i = 0; i < amountOfSubject; i++) {

            if (subjects[i].getName().equals(subject)) {
                subjects[i].setWorkedHours(subjects[i].getWorkedHours() + 5);
                return;
            }

        }

        System.out.println("subject does not exist");
    }

    public double getGPA() {
        int sum = 0;

        for (int i = 0; i < amountOfSubject; i++) {
            sum += subjects[i].getMark();
        }

        return (double)sum / amountOfSubject;
    }

    public String showAllInfo() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < amountOfSubject; i++) {
            sb.append(subjects[i].showInfo()).append("\n");
        }
        return sb.toString();
    }
}
