package com.lectures.lecture15;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Iztok", 150000.0, Town.SOFIA);
        Owner owner1 = new Owner("Kiril", 20, "male");
        Apartment apartment2 = new Apartment("Mladost 1", 200000.0, Town.PLOVDIV, 2010, 120, 6, owner1);
        House house1 = new House("Sea Garden", 250000, Town.BURGAS, 2020, 200, new int[]{1, 2, 3}, owner1, true, 50);
        House house2 = new House("Sea Garden", 250000, Town.BURGAS, 2020, 200, new int[]{1, 2, 3, 4}, owner1, true, 50);

        log.info(apartment2.toString());
        apartment2.setPricePerLocation();
        log.info(apartment2.toString());
        house2.getNumberOfFloors();
        house1.sell(1000000);
        house1.printAllFloorsOfProperty();
    }
}
