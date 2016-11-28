package avdieiev.week3.TravelAgency;


public class MyDate {
    private int year;
    private int month;
    private int date;
    private Time time;

    public MyDate(int year, int month, int date, Time time) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.time = time;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getYear() {

        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }
}
