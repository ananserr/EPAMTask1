package ua.kpi.fpm.task1.model;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class Car {
    private String name;
    private int cost;
    private float fuelConsumption;
    private int speed;
    private int seatsCount;

    // Constructor
    public Car(String name, int cost, float fuelConsumption, int speed, int seatsCount) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.seatsCount = seatsCount;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
