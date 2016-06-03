package ua.kpi.fpm.task1.model;

/**
 * Created by Anastasia Serhienko on 6/3/16.
 */
public class Minivan extends Car {
    DoorType doorType;

    public enum DoorType {SLIDING_DOOR, CLASSIC_DOOR};

    public Minivan(String name, int cost, float fuelConsumption, int speed, int seatsCount, DoorType type) {
        super(name, cost, fuelConsumption, speed, seatsCount);
        this.doorType = type;
    }

    /**
     * Returns door type of this minivan.
     * @return door type of this minivan.
     */
    public DoorType getDoorType() {
        return this.doorType;
    }
}
