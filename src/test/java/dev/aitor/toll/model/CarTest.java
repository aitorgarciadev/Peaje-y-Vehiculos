package dev.aitor.toll.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void testCalculateToll() {
        Vehicle car = new Car("CAR123");
        assertEquals(100.0, car.calculateToll());
    }
}
