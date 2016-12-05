package week4.circus.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Влад on 05.12.2016.
 */
public class Circus {

    private List<Artist> artists = new ArrayList<>();
    private String place;
    private int budget;

    public Circus(List<Artist> artists, String place, int budget) {
        this.artists = artists;
        this.place = place;
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
