package week4.circus.model;

/**
 * Created by Влад on 04.12.2016.
 */
public abstract class Artist {

    private String name;
    private int age;
    private int salary;
    protected int money;
    protected int countOfPerform;
    protected int intoxication;

    public Artist(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.money = 0;
        this.countOfPerform = 0;
        this.intoxication = 0;
    }

    public String getName() {
        return name;
    }

    public int getIntoxication() {
        return intoxication;
    }

    public int getCountOfPerform() {
        return countOfPerform;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return  "name is '" + name + '\'' +
                ", age:" + age +
                ", salary: " + salary +
                ", count of perform: " + countOfPerform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        if (age != artist.age) return false;
        if (salary != artist.salary) return false;
        if (money != artist.money) return false;
        if (countOfPerform != artist.countOfPerform) return false;
        if (intoxication != artist.intoxication) return false;
        return name != null ? name.equals(artist.name) : artist.name == null;
    }

    public abstract void perform();

    public void takeMoney() {
        this.money += this.salary;
    }

}
