package ua.kpi.fpm.task1.model;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class Car {
    private int cost;
    private float fuelConsumption;
    private int speed;
    private int passengers;

    // Constructor
    public Car(int cost, float fuelConsumption, int speed) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
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
}
