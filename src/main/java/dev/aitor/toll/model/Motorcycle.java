package dev.aitor.toll.model;

public class Motorcycle extends Vehicle {
    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateToll() {
        return 50.0;
    }
}
