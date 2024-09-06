package dev.aitor.toll.model;

public class Truck extends Vehicle {
    private int axles;

    public Truck(String licensePlate, int axles) {
        super(licensePlate);
        this.axles = axles;
    }

    @Override
    public double calculateToll() {
        return 50.0 * axles;
    }
}
