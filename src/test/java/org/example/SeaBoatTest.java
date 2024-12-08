package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeaBoatTest {
    private final SeaBoat testBoat = new SeaBoat("TestBoat", 20.5, 10, 2020, 25.0);
    private final SeaBoat sameBoat = new SeaBoat("TestBoat", 20.5, 10, 2020, 25.0);
    private final SeaBoat differentBoat = new SeaBoat("OtherBoat", 25.0, 15, 2021, 30.0);

    @Test
    void testEquals() {
        assertEquals(testBoat, sameBoat);
        assertNotEquals(testBoat, differentBoat);
        assertNotEquals(null, testBoat);
        assertEquals(testBoat, testBoat);
    }

    @Test
    void testHashCode() {
        assertEquals(testBoat.hashCode(), sameBoat.hashCode());
        assertNotEquals(testBoat.hashCode(), differentBoat.hashCode());
    }

    @Test
    void testCompareTo() {
        // Test length comparison
        assertTrue(testBoat.compareTo(differentBoat) < 0);
        assertEquals(0, testBoat.compareTo(sameBoat));

        // Test year comparison when lengths are equal
        SeaBoat sameLength = new SeaBoat("NewBoat", 20.5, 12, 2022, 28.0);
        assertTrue(testBoat.compareTo(sameLength) > 0); // 2022 should come before 2020
    }

    @Test
    void testToString() {
        String expected = "[TestBoat] 20.5m | 10 pax | Built 2020 | 25.0 knots";
        assertEquals(expected, testBoat.toString());
    }
}