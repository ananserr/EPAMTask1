package ua.kpi.fpm.task1.model;

/**
 * Created by Anastasia Serhienko on 6/3/16.
 */
public class Pickup extends Car {
    private int cargoVolume;

    public Pickup(String name, int cost, float fuelConsumption, int speed, int seatsCount, int cargoVolume) {
        super(name, cost, fuelConsumption, speed, seatsCount);
        this.cargoVolume = cargoVolume;
    }

    public int getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(int cargoVolume) {
        this.cargoVolume = cargoVolume;
    }
}
