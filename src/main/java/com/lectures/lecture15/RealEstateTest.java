package com.lectures.lecture15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RealEstateTest {
    Apartment apartment1;
    Owner owner1;
    Apartment apartment2;
    House house1;
    House house2;

    @BeforeEach
    public void setUp() {
        apartment1 = new Apartment("Iztok", 150000.0, Town.SOFIA);
        owner1 = new Owner("Kiril", 20, "male");
        apartment2 = new Apartment("Mladost 1", 200000.0, Town.PLOVDIV, 2010, 120, 6, owner1);
        house1 = new House("Sea Garden", 250000, Town.BURGAS, 2020, 200, new int[]{1, 2, 3}, owner1, true, 50);
        house2 = new House("Sea Garden", 250000, Town.BURGAS, 2020, 200, new int[]{1, 2, 3, 4}, owner1, true, 50);
    }

    @Test
    public void verifyNumberOfFloors(){
        assert house1.getNumberOfFloors() == 3;
        Assertions.assertEquals(house1.getNumberOfFloors(), 3);
        Assertions.assertTrue(house1.getNumberOfFloors() == 3);
        Assertions.assertFalse(house1.getNumberOfFloors() == 2);

        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            house2.getNumberOfFloors();
        });
    }
}
