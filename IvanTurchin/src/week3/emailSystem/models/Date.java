package week3.emailSystem.models;

public class Date {

    private int year;
    private int month;
    private int day;
    private Time time;

    public Date(int year, int month, int day, Time time) {

        if (year < 2016 || month <= 0 || month > 12 || day <= 0 || day > 31 || time == null) {
            return;
        }

        this.year = year;
        this.month = month;
        this.day = day;
        this.time = time;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Date date = (Date) o;

        if (year != date.year) return false;
        if (month != date.month) return false;
        if (day != date.day) return false;
        return time != null ? time.equals(date.time) : date.time == null;

    }
}
