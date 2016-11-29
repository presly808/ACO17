package week3.emailSystem.models;

public class Time {

    private int hour;
    private int minute;

    public Time(int hour, int minute) {

        if (hour <= 0 || hour > 24 || minute < 0 || minute > 60) {
            return;
        }

        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Time time = (Time) o;

        if (hour != time.hour) return false;
        return minute == time.minute;
    }
}
