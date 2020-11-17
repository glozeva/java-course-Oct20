package com.lectures.lecture08;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person{
    private String faculty;
    private String specialty;
    private int facultyNumber;
    private List<String> courses;


    public Student(String name, int age, String faculty, String specialty, int facultyNumber) {
        super(name, age);
        this.faculty = faculty;
        this.specialty = specialty;
        this.facultyNumber = facultyNumber;
    }

    public void prepareForExam(int numberOfCourses){
        if(numberOfCourses>5){
            System.out.println("Study hard");
        } else{
            System.out.println("Play hard");
        }
    }

    public void prepareForExam(int numberOfCourses, int daysBeforeExam){
        if(numberOfCourses>5 && daysBeforeExam<2){
            System.out.println("No time");
        } else{
            System.out.println("Play hard");
        }
    }

    public void prepareForExam(){
        System.out.println("no preparation" + facultyNumber + specialty);
    }

    @Override
    public void levelOfEducation(EducationLevel educationLevel) {
        System.out.println("UNIVERSITY education");
    }

    @Override
    public void profession() {
        System.out.println("I'm still student.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "faculty='" + faculty + '\'' +
                ", specialty='" + specialty + '\'' +
                ", facultyNumber=" + facultyNumber +
                ", courses=" + courses +
                '}';
    }
}
