package ua.kpi.fpm.task1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class TaxiFleet {
    private ArrayList<Car> taxicabArrayList = new ArrayList<>();

    /**
     *
     */
    public class CarFuelConsumptionComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            float fc1 = o1.getFuelConsumption();
            float fc2 = o2.getFuelConsumption();

            return fc1 < fc2 ? -1
                    : fc1 > fc2 ? 1
                    : 0;
        }
    }

    /**
     *
     * @return
     */
    public Car[] getTaxicabArray() {
        Car[] taxicabArray = new Car[this.taxicabArrayList.size()];
        this.taxicabArrayList.toArray(taxicabArray);
        return taxicabArray;
    }

    /**
     *
     * @param car
     */
    public void addCar(Car car) {
        this.taxicabArrayList.add(car);
    }

    /**
     *
     * @return
     */
    public int cost() {
        int cost = 0;
        for (Car var : taxicabArrayList) {
            cost += var.getCost();
        }
        return cost;
    }

    public void sortByFuelConsumption() {
        Collections.sort(this.taxicabArrayList, new CarFuelConsumptionComparator());
    }
}
