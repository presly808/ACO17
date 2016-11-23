package oop.week2;

/**
 * Created by Victoria on 11/22/2016.
 */
public class Bike {
    private String country;
    private String modelB;
    private String colour;
    private boolean forWoman;
    private int height;
    private int id;

    public static int globalId = 0;


    public Bike() {
        System.out.println("This id default constructor");

    }

    public Bike(String country, String modelB, boolean forWoman, int height) {
        Bike eve = this; //объявляем this

        this.country = country;
        this.modelB = modelB;
        this.forWoman = forWoman;
        this.height = height;
    }

    public Bike(String model) {
        this.modelB = model;
    }

    public String getModelB() {
        return modelB;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //getColour(){}
    public String getColour() {
        return colour;
    }
    //getName(){}
    public boolean getForWoman() {
        return forWoman;
    }

    public void setModelB(String modelB){// it seems not to work
    if (modelB == null || modelB.isEmpty()){
        System.out.println("Specify the model");
    }
      this.modelB = modelB;
    }

}