package university;

import java.util.Arrays;

public class Student {

    private String name;
    private String address;
    private Subject[] subjects = new Subject[1];
    private int money;
    private double energy;

    private static final String LEARN_INIT_KEY = "%i9vn!8520:/#";

    public Student(String name, String address, int money) {
        this.name = name;
        this.address = address;
        this.money = money;

        this.energy = 100;
    }

    public void addSubject(Subject subject) {
        if (this.subjects.length == lastIndex()) {
            this.subjects = Arrays.copyOf(this.subjects, this.subjects.length + 1);
        }

        this.subjects[lastIndex()] = subject;
    }

    public void removeSubject(int index) {

        if (index <= 0 || index > this.subjects.length) {
            return;
        }

        this.subjects[index - 1] = null;
        Subject[] temp = new Subject[this.subjects.length];
        int j = 0;

        for (int i = 0; i < this.subjects.length; i++) {
            if (this.subjects[i] != null) {
                temp[j] = this.subjects[i];
            }

            j++;
        }

        this.subjects = Arrays.copyOf(temp, temp.length - 1);
    }

    // get knowledges instead of energy
    // method continues in method <learnInit> in Object <Subject>
    public void learn(String name) {
        int index = -1;

        for (int i = 0; i < this.subjects.length; i++) {
            if (this.subjects[i].getName().equals(name)) {
                index = i;
            }
        }

        if (this.energy == 0 || index == -1) {
            return;
        }

        this.energy -= this.subjects[index].getEnergyByPoint();
        this.subjects[index].learnInit(LEARN_INIT_KEY);
    }

    private int lastIndex() {
        int res = 0;

        for (int i = 0; i < this.subjects.length; i++) {
            if (this.subjects[i] != null) {
                res++;
            }
        }

        return res;
    }

    public void addEnergy() {
        if (money < 4 || energy > 98) {
            return;
        }

        this.money -= 4;
        this.energy += 2;
    }

    public String showInfo() {

        int var = 0;

        for (int i = 0; i < this.subjects.length; i++) {
            if (this.subjects[i] != null) {
                var++;
            }
        }

        return String.format("name - %s\naddress - %s\ncount of subjects - %d\nmoney - %d\nenergy - %.1f%s",
                this.name, this.address, var, this.money, this.energy, "%");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public int getMoney() {
        return money;
    }

    public double getEnergy() {
        return energy;
    }
}
