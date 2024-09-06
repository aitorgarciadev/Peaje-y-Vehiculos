package dev.aitor.toll.service;

import dev.aitor.toll.model.Car;
import dev.aitor.toll.model.Motorcycle;
import dev.aitor.toll.model.Truck;
import dev.aitor.toll.model.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TollServiceTest {

    @Test
    public void testProcessVehicle() {
        TollService tollService = new TollService();
        Vehicle car = new Car("CAR123");
        Vehicle motorcycle = new Motorcycle("MOTO123");
        Vehicle truck = new Truck("TRUCK123", 2);

        tollService.processVehicle(car);
        tollService.processVehicle(motorcycle);
        tollService.processVehicle(truck);

        double expectedTotal = 200.0 + 50.0;
        assertEquals(expectedTotal, tollService.getTollStation().getTotalCollected());
        assertEquals(3, tollService.getTollStation().getVehicles().size());
    }
}
