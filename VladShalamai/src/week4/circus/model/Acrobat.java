package week4.circus.model;

import week4.circus.model.interfaces.DrinkCapable;
import week4.circus.model.interfaces.StealCapable;

/**
 * Created by Влад on 04.12.2016.
 */
public class Acrobat extends Artist implements StealCapable, DrinkCapable {

    private int maxHeight;

    public Acrobat(String name, int age, int salary, int maxHeight) {
        super(name, age, salary);
        this.maxHeight = maxHeight;
    }

    @Override
    public void perform() {
        System.out.println("acrobat " + this.getName() + "is doing the trick at height " + maxHeight + "meters");
        countOfPerform++;
    }


    @Override
    public String toString() {
        return super.toString() + " skill: acrobat";
    }

    @Override
    public void steal(Circus circus) {
        this.money += 100;
        circus.setBudget(circus.getBudget() - 100);
        System.out.println(getName() + "stole 100 $");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking");
        ++intoxication;
    }
}
