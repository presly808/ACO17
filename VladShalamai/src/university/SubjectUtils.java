package university;

import week2.CarUtils;

public class SubjectUtils {

    public static Subject generateSubject(int num) {
        return new Subject(generateName(num), CarUtils.generateNum(60, 100), CarUtils.generateNum(3, 5));
    }

    public static String generateName(int num) {

        String[] subjects = {"politology", "math", "chemistry", "physics", "law", "English", "physical training"};

        return subjects[num];
    }

}
