package week3.tourAgency.models;

public class Date {

    private int year;
    private int month;
    private int date;
    private Time time;

    public Date() {
    }

    public Date(int year, int month, int date, Time time) {

        if (year < 2016 || month <= 0 || month > 12 || date <= 0 || date > 31 || time == null) {
            return;
        }

        this.year = year;
        this.month = month;
        this.date = date;
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + date +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Date date1 = (Date) o;

        if (year != date1.year) return false;
        if (month != date1.month) return false;
        if (date != date1.date) return false;
        return time != null ? time.equals(date1.time) : date1.time == null;

    }
}
