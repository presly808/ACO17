package week3.Tour.model;

public class Time {

    int hh;
    int mm;

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hh=" + hh +
                ", mm=" + mm +
                '}';
    }
}
