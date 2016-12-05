package week4.circus.model;


import week4.circus.model.interfaces.StealCapable;

/**
 * Created by Влад on 04.12.2016.
 */
public class StrongMen extends Artist implements StealCapable {

    private int maxWeight;

    public StrongMen(String name, int age, int salary, int maxWeight) {
        super(name, age, salary);
        this.maxWeight = maxWeight;
    }

    @Override
    public void perform() {
        System.out.println("the strongmen " + this.getName() + " is raising the bar weighting " + maxWeight + "kg");
        countOfPerform++;
    }

    @Override
    public String toString() {
        return super.toString() + " skill: strong men";
    }

    @Override
    public void steal(Circus circus) {
        this.money += 200;
        circus.setBudget(circus.getBudget() - 200);
        System.out.println(getName() + "stole 200 $");
    }
}
