package week3.travel.db;

import week3.travel.model.Tour;
import week3.travel.model.TourRequest;

import java.util.Arrays;

/**
 * Created by serhii on 11/27/16.
 */
public class AppDB {

    // * * * * n * * * * _ _ _
    private Tour[] tours = new Tour[10];
    private int freeTourCell = 0;

    private TourRequest[] tourRequests = new TourRequest[10];

    public AppDB() {
    }

    public void addTour(Tour tour){

        if(tour == null){
            System.err.println("Can not add null tour");
            return;
        }

        if(freeTourCell == tours.length){
            tours = Arrays.copyOf(tours, tours.length * 2);
        }

        tours[freeTourCell++] = tour;
    }

    public Tour removeTour(int id){
        for (int i = 0; i < freeTourCell; i++) {
            if(tours[i].getId() == id){
                Tour removed = tours[i];
                System.arraycopy(tours, i + 1, tours, i, freeTourCell - i);
                freeTourCell--;
                return removed;
            }
        }

        return null;
    }

    public Tour[] getTours() {
        return Arrays.copyOf(tours, getSize());
    }

    public int getSize(){
        return freeTourCell;
    }

}
