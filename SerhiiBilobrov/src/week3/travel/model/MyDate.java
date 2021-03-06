package week3.travel.model;

/**
 * Created by serhii on 11/26/16.
 */
public class MyDate {

    private int year;
    private int month;
    private int day;
    private MyTime time;

    public MyDate() {
    }

    public MyDate(int year, int month, int day, MyTime time) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.time = time;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyTime getTime() {
        return time;
    }

    public void setTime(MyTime time) {
        this.time = time;
    }
}
