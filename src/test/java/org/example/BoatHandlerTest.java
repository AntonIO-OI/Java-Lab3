package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoatHandlerTest {
    private BoatHandler handler;
    private SeaBoat[] testFleet;

    @BeforeEach
    void setUp() {
        testFleet = new SeaBoat[] {
                new SeaBoat("Boat1", 25.0, 12, 2020, 30.0),
                new SeaBoat("Boat2", 18.3, 8, 2021, 25.5),
                new SeaBoat("Boat3", 18.3, 10, 2019, 28.0)
        };
        handler = new BoatHandler(testFleet);
    }

    @Test
    void testContains() {
        SeaBoat existingBoat = new SeaBoat("Boat1", 25.0, 12, 2020, 30.0);
        SeaBoat nonExistentBoat = new SeaBoat("Boat4", 22.0, 15, 2022, 32.0);

        assertTrue(handler.contains(existingBoat));
        assertFalse(handler.contains(nonExistentBoat));
    }

    @Test
    void testSortLengthAscendingYearDescending() {
        handler.sortLengthAscendingYearDescending();

        // Check if boats with same length are sorted by year in descending order
        assertEquals(2021, testFleet[0].getYearBuilt());
        assertEquals(2019, testFleet[1].getYearBuilt());

        // Check if lengths are sorted in ascending order
        assertTrue(testFleet[0].getLength() <= testFleet[2].getLength());
    }
}
