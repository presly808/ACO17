package week4.circus.controller;

import week4.circus.model.*;
import week4.circus.model.interfaces.IntoxicateComparator;

import java.util.Arrays;


/**
 * Created by Влад on 04.12.2016.
 */
public class DirectorController {

    private Circus circus;

    public DirectorController(Circus circus) {
        this.circus = circus;
    }

    public Circus getCircus() {
        return circus;
    }

    /**
     * method shows info about all artists in your circus
     *
     * @return string of artists
     */

    public String showAllArtist() {

        StringBuilder sb = new StringBuilder();

        for (Artist artist : circus.getArtists()) {
            sb.append(artist.toString()).append("\n");
        }

        return sb.toString();
    }

    /**
     * this method add new strongmen to list of artists
     *
     * @param name      the name of strongme
     * @param age       the age of strongmen
     * @param salary    the salary of strongmen
     * @param maxWeight the maxWeight of strongman
     */

    public void hireNewStrongMen(String name, int age, int salary, int maxWeight) {

        circus.getArtists().add(new StrongMen(name, age, salary, maxWeight));
    }

    /**
     * this method add new strongmen to list of artists
     *
     * @param name      the name of acrobat
     * @param age       the age of acrobat
     * @param salary    the salary of acrobat
     * @param maxHeight the maxWeight of acrobat
     */

    public void hireNewAcrobat(String name, int age, int salary, int maxHeight) {

        circus.getArtists().add(new Acrobat(name, age, salary, maxHeight));
    }

    /**
     * @param name   the name of equilibrist
     * @param age    the age of equilibrist
     * @param salary the salary of equilibrist
     */

    public void hireNewEquilibrist(String name, int age, int salary) {

        circus.getArtists().add(new Equilibrist(name, age, salary));
    }

    /**
     * this method remove the most drinking artist from circus
     * @return removed artist
     */

    public Artist dismissMoreDrinking() {

        Artist[] buffer = new Artist[getCircus().getArtists().size()];
        getCircus().getArtists().toArray(buffer);

        Arrays.sort(buffer, new IntoxicateComparator());
        getCircus().getArtists().remove(buffer[buffer.length - 1]);

        return buffer[buffer.length - 1];
    }

    /**
     *  this method invoke method perform() of object that comes
     * @param artist object which you want to order to perform
     */

    public void orderToPerform(Artist artist) {

        artist.perform();

    }


    /**
     * method returns string which consist name and count of perform for all artist
     * @return string of artists
     */

    public String getCountOfPerform() {

        StringBuilder sb = new StringBuilder();

        for (Artist artist : circus.getArtists()) {
            sb.append(artist.getName()).append(" - ").append(artist.getCountOfPerform()).append("\n");
        }

        return sb.toString();
    }

    /**
     * this method give salary for each artist
     */

    public void pay() {

        for (Artist artist : getCircus().getArtists()) {
            artist.takeMoney();
        }
    }

    /**
     * this method change place of circus
     */

    public void changePlace() {

        String[] places = {"Odessa", "Mahachkala", "Deli", "Mariupol"};

        getCircus().setPlace(places[(int) (Math.random() * 4)]);

    }
}

