package ua.kpi.fpm.task1.model;

/**
 * The Minivan class which extends the Car class, has a door type.
 * Created on 6/3/16.
 * @author Anastasia Serhienko
 * @version 1.0
 */
public class Minivan extends Car {
    DoorType doorType;

    /**
     * Types of minivan door.
     */
    public enum DoorType {SLIDING_DOOR, CLASSIC_DOOR};

    /**
     * Constructor. Refers to super. Also sets door type, which is specific for the Minivan class.
     * @param name name of car
     * @param cost cost of car
     * @param fuelConsumption fuel consumption of car
     * @param speed speed of car
     * @param seatsCount seats count of car
     * @param type door type of minivan
     */
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
