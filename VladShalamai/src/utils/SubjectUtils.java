package utils;

import university.Subject;

public class SubjectUtils {

    public static Subject generateSubject(int num) {
        return new Subject(generateName(num), CarUtils.generateNum(60, 100), CarUtils.generateNum(3, 6));
    }

    public static String generateName(int num) {

        String[] subjects = {"politology", "math", "chemistry", "physics", "law", "English", "physical training"};

        return subjects[num];
    }

}
