package main73;

import java.io.*;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private String id;
    private String fullName;
    private int yob;
    private double avgscore;


    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String fullName, int dob, double avgscore) {
        this.id = id;
        this.fullName = fullName;
        this.yob = dob;
        this.avgscore = avgscore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDob() {
        return yob;
    }

    public void setDob(int yob) {
        this.yob = yob;
    }

    public double getAvgscore() {
        return avgscore;
    }

    public void setAvgscore(double avgscore) {
        this.avgscore = avgscore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", yob=" + yob +
                ", avgscore=" + avgscore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) ;
    }





}
