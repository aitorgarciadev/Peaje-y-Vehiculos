package dev.aitor.toll.model;


public class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateToll() {
        return 100.0;
    }
}
