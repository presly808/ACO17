package week3.rozetka.models;

public class Data {

    private int year;
    private int month;
    private int day;
    private Time time;

    public Data() {
    }

    public Data(int year, int month, int day, Time time) {

        if (year < 2016 || month <= 0 || month > 12 || day < 0 || day > 31 || time == null) {
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
        return "Data{" +
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

        Data data = (Data) o;

        if (year != data.year) return false;
        if (month != data.month) return false;
        if (day != data.day) return false;
        return time != null ? time.equals(data.time) : data.time == null;

    }
}
