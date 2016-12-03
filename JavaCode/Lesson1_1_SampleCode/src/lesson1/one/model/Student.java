/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1.one.model;

import java.io.Serializable;

/**
 *
 * @author xtecuan
 */
public class Student implements Serializable {

    private String name;
    private String lastName;
    private Double score;
    private Integer gradYear;

    public Student() {
    }

    public Student(Double score, Integer gradYear) {
        this.score = score;
        this.gradYear = gradYear;
    }

    public Student(String name, String lastName, Double score, Integer gradYear) {
        this.name = name;
        this.lastName = lastName;
        this.score = score;
        this.gradYear = gradYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Integer getGradYear() {
        return gradYear;
    }

    public void setGradYear(Integer gradYear) {
        this.gradYear = gradYear;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", lastName=" + lastName + ", score=" + score + ", gradYear=" + gradYear + '}';
    }

}
