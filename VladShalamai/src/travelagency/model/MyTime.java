package travelagency.model;

/**
 * Created by Влад on 26.11.2016.
 */
public class MyTime {

    private int hours;
    private int minutes;

    public MyTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
