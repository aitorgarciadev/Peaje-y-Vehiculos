package dev.aitor.toll.controller;

import dev.aitor.toll.model.Car;
import dev.aitor.toll.model.Motorcycle;
import dev.aitor.toll.model.Truck;
import dev.aitor.toll.model.Vehicle;
import dev.aitor.toll.service.TollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toll")
public class TollController {

    @Autowired
    private TollService tollService;

    @PostMapping("/car")
    public void addCar(@RequestParam String licensePlate) {
        Vehicle car = new Car(licensePlate);
        tollService.processVehicle(car);
    }

    @PostMapping("/motorcycle")
    public void addMotorcycle(@RequestParam String licensePlate) {
        Vehicle motorcycle = new Motorcycle(licensePlate);
        tollService.processVehicle(motorcycle);
    }

    @PostMapping("/truck")
    public void addTruck(@RequestParam String licensePlate, @RequestParam int axles) {
        Vehicle truck = new Truck(licensePlate, axles);
        tollService.processVehicle(truck);
    }

    @GetMapping("/total")
    public double getTotalCollected() {
        return tollService.getTollStation().getTotalCollected();
    }

    @GetMapping("/vehicles")
    public List<Vehicle> getVehicles() {
        return tollService.getTollStation().getVehicles();
    }
}
