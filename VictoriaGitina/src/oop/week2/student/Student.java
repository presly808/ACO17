package oop.week2.student;

import java.util.Scanner;

/**
 * Created by Victoria on 12/4/2016.
 */
public class Student {

    private String name;
    private String adress;

    public Student(String name, Zalikovka zalikovka) {
        this.name = name;
    }//student constructor

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
