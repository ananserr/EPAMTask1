package ua.kpi.fpm.task1.model;

import java.util.ArrayList;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class TaxiFleet {
    private ArrayList<Car> taxicabList = new ArrayList<>();

    /**
     *
     * @param car
     */
    public void addCar(Car car) {
        this.taxicabList.add(car);
    }

    /**
     *
     * @return
     */
    public int cost() {
        int cost = 0;
        for (int i = 0; i < this.taxicabList.size(); i++) {
            cost += this.taxicabList.get(i).getCost();
        }
        return cost;
    }
}
