package ua.kpi.fpm.task1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class TaxiFleet {
    private ArrayList<Car> taxicabArrayList = new ArrayList<>();
    private TreeSet<Car> taxicabTreeSet = new TreeSet<>(new CarSpeedComparator());

    /**
     *
     */
    public class CarFuelConsumptionComparator implements Comparator<Car> {

        @Override
        public int compare(Car car1, Car car2) {
            float fc1 = car1.getFuelConsumption();
            float fc2 = car2.getFuelConsumption();

            return fc1 < fc2 ? -1
                    : fc1 > fc2 ? 1
                    : 0;
        }
    }

    public class CarSpeedComparator implements Comparator<Car> {

        @Override
        public int compare(Car car1, Car car2) {
            return car1.getSpeed() - car2.getSpeed();
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
        this.taxicabTreeSet.add(car);
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

    /**
     *
     */
    public void sortByFuelConsumption() {
        Collections.sort(this.taxicabArrayList, new CarFuelConsumptionComparator());
    }

    /**
     *
     * @param lowerLimit
     * @param higherLimit
     * @return
     */
    public Car[] searchCarBySpeed(int lowerLimit, int higherLimit) {
        // ...
        return
    }

    /**
     *
     * @param higherLimit
     * @return
     */
    public Car[] searchCarBySpeed(int higherLimit) {
        return searchCarBySpeed(0, higherLimit);
    }
}
