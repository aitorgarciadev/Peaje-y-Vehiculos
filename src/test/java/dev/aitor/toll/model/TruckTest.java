package dev.aitor.toll.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruckTest {

    @Test
    public void testCalculateToll() {
        Vehicle truck = new Truck("TRUCK123", 3);
        assertEquals(150.0, truck.calculateToll());
    }
}
