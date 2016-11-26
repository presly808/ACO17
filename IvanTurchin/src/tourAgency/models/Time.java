package tourAgency.models;

public class Time {

    private int hour;
    private int minute;

    public Time(int hour, int minute) {

        if (hour < 0 || minute < 0) {
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
}
