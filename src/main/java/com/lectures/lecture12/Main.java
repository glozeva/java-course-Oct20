package com.lectures.lecture12;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("Number with static call {}", StaticNumbers.nextValue());
        StaticNumbers obj1 = new StaticNumbers();
        log.info("First object");
        obj1.printArray();
        StaticNumbers obj2 = new StaticNumbers();
        log.info("Second object");
        obj2.printArray();

        MathOperations mathOperations = new MathOperations();
        mathOperations.calculateTriangleFace(2, 2, 60);

        RandomGeneration randomGeneration = new RandomGeneration();
        randomGeneration.toto5From35Generation();
        randomGeneration.randomNumberBetweenRange(10, 50);
        randomGeneration.generateRandomId(14);
        randomGeneration.generateRandomPassword();
    }
}
