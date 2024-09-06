package dev.aitor.toll.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TollStationTest {

    @Test
    public void testProcessVehicleAndTotalCollected() {
        TollStation tollStation = new TollStation("Main Toll", "City");

        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ789");
        Vehicle truck = new Truck("TRK456", 4);

        tollStation.processVehicle(car);
        tollStation.processVehicle(motorcycle);
        tollStation.processVehicle(truck);

        assertEquals(100.0 + 50.0 + (50.0 * 4), tollStation.getTotalCollected());
        assertEquals(3, tollStation.getVehicles().size());
    }
}
