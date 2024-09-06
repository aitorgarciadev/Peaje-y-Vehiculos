package dev.aitor.toll.service;

import dev.aitor.toll.model.TollStation;
import dev.aitor.toll.model.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class TollService {
    private final TollStation tollStation;

    public TollService() {
        this.tollStation = new TollStation("Central Toll", "Springfield");
    }

    public void processVehicle(Vehicle vehicle) {
        tollStation.processVehicle(vehicle);
    }

    public TollStation getTollStation() {
        return tollStation;
    }
}
