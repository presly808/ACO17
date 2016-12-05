package week4.circus.model.interfaces;

import week4.circus.model.Artist;

import java.util.Comparator;

/**
 * Created by Влад on 05.12.2016.
 */
public class IntoxicateComparator implements Comparator<Artist> {
    @Override
    public int compare(Artist a1, Artist a2) {
        return a1.getIntoxication() - a2.getIntoxication();
    }
}
