package week4.circus.model;

import week4.circus.model.interfaces.DrinkCapable;

/**
 * Created by Влад on 04.12.2016.
 */
public class Equilibrist extends Artist implements DrinkCapable {


    public Equilibrist(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void perform() {
        System.out.println("equilibrist " + this.getName() + " is perfoming");
        countOfPerform++;
    }

    @Override
    public String toString() {
        return super.toString() + " skill: equilibrist";
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking");
        ++intoxication;
    }
}
