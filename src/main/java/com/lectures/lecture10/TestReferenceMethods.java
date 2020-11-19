package com.lectures.lecture10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestReferenceMethods {
    public static void main(String[] args) {

        // Static Method Reference
        StudentMethodReference[] students = {new StudentMethodReference(3.4), new StudentMethodReference(5.3), new StudentMethodReference(2.8)};

        Arrays.sort(students, StudentMethodReference::compareGrades);

        for (StudentMethodReference student : students) {
            System.out.println(student.getAvgGrade());
        }

        // Object Method Reference

        StudentMethodReference[] studentNames = {new StudentMethodReference("Petar"), new StudentMethodReference("Georgi")};

        CompareObjects compareObjects = new CompareObjects();

        Arrays.sort(studentNames, compareObjects::compareByNames);

        for (StudentMethodReference student : studentNames) {
//            System.out.println(student.getName());
        }

        // Arbitrary method reference
        List<String> names = new ArrayList<>();
        names.add("Dimitar");
        names.add("Albena");
        names.add("Kristina");

        names.forEach(System.out::println);
    }
}
