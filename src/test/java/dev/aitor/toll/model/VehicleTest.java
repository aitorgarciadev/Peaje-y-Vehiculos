package dev.aitor.toll.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void testCarCalculateToll() {
        Vehicle car = new Car("CAR123");
        assertEquals(100.0, car.calculateToll(), "The toll for the car should be 200.0");
    }

    @Test
    public void testMotorcycleCalculateToll() {
        Vehicle motorcycle = new Motorcycle("MOTO123");
        assertEquals(50.0, motorcycle.calculateToll(), "The toll for the motorcycle should be 100.0");
    }

    @Test
    public void testTruckCalculateToll() {
        Vehicle truck = new Truck("TRUCK123", 3);
        assertEquals(150.0, truck.calculateToll(), "The toll for the truck should be 150.0");
    }
}
