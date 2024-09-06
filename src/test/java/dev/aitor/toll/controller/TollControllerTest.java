package dev.aitor.toll.controller;

import dev.aitor.toll.service.TollService;
import dev.aitor.toll.model.TollStation;
import dev.aitor.toll.model.Vehicle;
import dev.aitor.toll.model.Car;
import dev.aitor.toll.model.Motorcycle;
import dev.aitor.toll.model.Truck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class TollControllerTest {

    @InjectMocks
    private TollController tollController;

    @Mock
    private TollService tollService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddCar() {
        doNothing().when(tollService).processVehicle(any(Car.class));
        tollController.addCar("CAR123");

        verify(tollService).processVehicle(any(Car.class));
    }

    @Test
    public void testAddMotorcycle() {
        doNothing().when(tollService).processVehicle(any(Motorcycle.class));
        tollController.addMotorcycle("MOTO123");

        verify(tollService).processVehicle(any(Motorcycle.class));
    }

    @Test
    public void testAddTruck() {
        doNothing().when(tollService).processVehicle(any(Truck.class));
        tollController.addTruck("TRUCK123", 4);

        verify(tollService).processVehicle(any(Truck.class));
    }

    @Test
    public void testGetTotalCollected() {
        TollStation mockTollStation = new TollStation("Main Toll", "City");
        mockTollStation.processVehicle(new Car("CAR123")); 

        when(tollService.getTollStation()).thenReturn(mockTollStation);

        double total = tollController.getTotalCollected();
        assertEquals(mockTollStation.getTotalCollected(), total);
    }

    @Test
    public void testGetVehicles() {
        Vehicle car = new Car("CAR123");
        TollStation mockTollStation = new TollStation("Main Toll", "City");
        mockTollStation.processVehicle(car);

        when(tollService.getTollStation()).thenReturn(mockTollStation);

        assertEquals(1, tollController.getVehicles().size());
        assertEquals(car, tollController.getVehicles().get(0));
    }
}
