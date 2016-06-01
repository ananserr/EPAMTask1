package ua.kpi.fpm.task1.model;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class Car {
    private int cost;
    private float fuelConsumption;

    // Constructor
    public Car(int cost, float fuelConsumption) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
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
}
