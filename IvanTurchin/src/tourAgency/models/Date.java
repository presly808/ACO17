package tourAgency.models;

public class Date {

    private int year;
    private int month;
    private int day;
    private Time time;

    public Date(int year, int month, int day, Time time) {

        if (time == null) {
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
}
