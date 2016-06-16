package ua.kpi.fpm.task1.model;

/**
 * The Pickup class which extends the Car class, has a cargo volume.
 * Created on 6/3/16.
 * @author Anastasia Serhienko
 * @version 1.0
 */
public class Pickup extends Car {
    private int cargoVolume;

    /**
     * Constructor. Refers to super. Also sets cargo volume, which is specific for the Pickup class.
     * @param name name of car
     * @param cost cost of car
     * @param fuelConsumption fuel consumption of car
     * @param speed speed of car
     * @param seatsCount seats count of car
     * @param cargoVolume cargo volume of pickup
     */
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
