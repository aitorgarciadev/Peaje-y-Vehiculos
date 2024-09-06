package dev.aitor.toll.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTest {

    @Test
    public void testCalculateToll() {
        Vehicle motorcycle = new Motorcycle("MOTO123");
        assertEquals(50.0, motorcycle.calculateToll());
    }
}
