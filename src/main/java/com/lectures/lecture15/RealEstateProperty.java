package com.lectures.lecture15;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class RealEstateProperty implements RealEstateActions {
    String location;
    double price;
    Town town;
    int yearOfConstruction;
    int totalSize;
    int[] floor;
    Owner owner;

    public int getNumberOfFloors(){
        int numberOfFloors = floor.length;
        log.info("The number of floors are: {}", numberOfFloors);
        return numberOfFloors;
    }

    public void printAllFloorsOfProperty(){
        int floorNumber;
        for (int j : floor) {
            floorNumber = j;
            log.info("The floor for property is: {}", floorNumber);
        }
    }

    @Override
    public void sell(double price) {
        log.info("Selling the property");
    }

    @Override
    public void buy(double price) {
        log.info("Buying the property");
    }

    @Override
    public void giveRent(double price) {
        log.info("Giving the property on rent");
    }

    @Override
    public void takeRent(double price) {
        log.info("Taking the property on rent");
    }
}
