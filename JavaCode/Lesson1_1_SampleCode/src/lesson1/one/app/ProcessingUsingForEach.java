/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1.one.app;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import lesson1.one.model.Student;

/**
 *
 * @author xtecuan
 */
public class ProcessingUsingForEach {

    public static final int INITIAL_YEAR = 2011;
    public static final int FINAL_YEAR = 2015;
    public static final double MIN_SCORE = 0.00;
    public static final double MAX_SCORE = 100.00;

    public static double getScore() {
        return ThreadLocalRandom.current().nextDouble(MIN_SCORE, MAX_SCORE);
    }

    public static int getGradYear() {
        return ThreadLocalRandom.current().nextInt(INITIAL_YEAR, FINAL_YEAR);
    }

    public static List<Student> generateData(int howMany) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            students.add(new Student(getScore(), getGradYear()));
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = generateData(1000);
        double highestScore = 0.00;
        for (Student s : students) {
            if (s.getGradYear() == 2011) {
                if (s.getScore() > highestScore) {
                    highestScore = s.getScore();
                }
            }
        }

        System.out.println("Highest Score: " + highestScore);
    }
}
