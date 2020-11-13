package com.lectures.lecture08;

public abstract class Person {
    private String name;
    private int age;
    private ContactInfo contactInfo; // Person HAS-A ContactInfo (Aggregation)

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void levelOfEducation(EducationLevel educationLevel){
        switch(educationLevel){
            case NO:
                System.out.println("Person has no education. Needs to be educated");
        }
    }

    public abstract void profession();

}
