package university;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Subject {

    private String name;

    private double energyByPoint;
    private double learned;
    private double toLearn;
    private boolean exam;
    private int[] marks = new int[1];

    private int countOfMarks = 0;

    public Subject(String name, double toLearn, double energyByPoint) {
        this.name = name;
        this.toLearn = toLearn;
        this.energyByPoint = energyByPoint;

        this.learned = 0;
        this.exam = false;
    }

    // convert energy to mark - [1 ; 12]
    public int getMark(double energy) {

        int mark = ((int) (energy / 2));

        if (energy <= 0 || mark > 12) {
            return 0;
        }

        if (this.marks.length == this.countOfMarks) {
            this.marks = Arrays.copyOf(this.marks, this.marks.length * 2);
        }

        this.marks[countOfMarks] = mark;
        this.countOfMarks++;
        return mark;
    }

    // pass exam is true if average of marks is more than 7 and progress of learning == 100%
    public boolean passExam() {
        if (getProgress() == 100 && getAverage() >= 7) {
            this.exam = true;
        }

        return this.exam;
    }

    // buy exam
    public boolean passExam(int money) {
        this.exam = money >= 5000;
        return this.exam;
    }

    // Show all info about state of fields
    public String showInfo() {

        String res = "";
        for (int i = 0; i < this.marks.length; i++) {
            if (this.marks[i] != 0) {
                res += new StringBuilder().append(this.marks[i]) + ", ";
            }
        }

        res = res.substring(0, res.length());

        return String.format("name - %s\nlearned - %.2f\nto learn - %.2f\nprogress - %.2f%s\nyour marks - %s\nexam - %s",
                this.name, this.learned, this.toLearn, this.getProgress(), "%", res, this.exam);
    }

    // method that gives access to local private variable <learned>
    // this method needs to realize method <learn> in object <Student>
    public void learnInit(String key) {
        if (!key.equals("%i9vn!8520:/#")) {
            return;
        }

        if (this.toLearn < this.learned + 1) {
            this.learned = this.toLearn;
            return;
        }
        this.learned += 1;
    }

    // return average of marks
    public int getAverage() {
        return ((IntStream.of(this.marks).sum()) / this.marks.length);
    }

    public double getEnergyByPoint() {
        return energyByPoint;
    }

    public String getName() {
        return name;
    }

    public double getLearned() {
        return learned;
    }

    public double getToLearn() {
        return toLearn;
    }

    public boolean isExam() {
        return exam;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getCountOfMarks() {
        return countOfMarks;
    }

    public double getProgress() {
        return (this.learned / this.toLearn) * 100;
    }
}
