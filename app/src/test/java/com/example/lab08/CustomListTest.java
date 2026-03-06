package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        //This will fail initially because hasCity() DNE
        assertTrue(list.hasCity(calgary));
    }

    @Test void testDeleteCity() {
        // Create two new dummy cities and add them to the list
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);

        // Delete only ONE of the cities and check the other is still there
        // Test will fail initially because deleteCity(city) DNE
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
        assertTrue(list.hasCity(edmonton));
    }

    @Test void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);

        assertEquals(2, list.countCities());
    }
}
