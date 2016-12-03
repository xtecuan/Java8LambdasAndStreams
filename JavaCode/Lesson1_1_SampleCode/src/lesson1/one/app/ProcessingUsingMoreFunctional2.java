/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1.one.app;

import java.util.List;
import java.util.stream.Stream;
import lesson1.one.model.Student;

/**
 *
 * @author xtecuan
 */
public class ProcessingUsingMoreFunctional2 extends ProcessingUsingForEach {

    public static void main(String[] args) {
        List<Student> data = generateData(1000);
        Stream<Student> students = data.stream();
        double highestScore
                = students
                        .filter(s -> s.getGradYear() == 2011)
                        .map(s -> s.getScore())
                        .max(Double::compareTo).get();
        System.out.println("Highest Score: " + highestScore);

    }
}
