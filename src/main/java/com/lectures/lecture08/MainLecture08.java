package com.lectures.lecture08;

import java.util.ArrayList;
import java.util.List;

public class MainLecture08 {
    public static void main(String[] args) {
        Student student = new Student("Kiril", 19, "Software", "CST", 2121);

        List<String> studentCourses = new ArrayList<>();
        studentCourses.add("Math");
        studentCourses.add("Programming");

        student.setCourses(studentCourses);
        student.setFacultyNumber(5665);
        student.prepareForExam();
        student.levelOfEducation(EducationLevel.NO);

    }

}
