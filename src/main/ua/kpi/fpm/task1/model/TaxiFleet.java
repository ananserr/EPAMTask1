package ua.kpi.fpm.task1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class TaxiFleet {
    /**
     * The ArrayList buffer into which the cars are stored.
     */
    private ArrayList<Car> taxicabArrayList = new ArrayList<>();

    /**
     * The comparator for sorting cars by fuel consumption, implementation of the Comparator interface.
     * Implements compare method.
     */
    public class CarFuelConsumptionComparator implements Comparator<Car> {

        /**
         * Overrides the compare method of the interface Comparator.
         * @param car1 first parameter for comparison
         * @param car2 second parameter for comparison
         * @return -1 if first parameter is lower then second, 1 if higher, 0 if equal
         */
        @Override
        public int compare(Car car1, Car car2) {
            float fc1 = car1.getFuelConsumption();
            float fc2 = car2.getFuelConsumption();

            return fc1 < fc2 ? -1
                    : fc1 > fc2 ? 1
                    : 0;
        }
    }

    /**
     * The comparator for sorting cars by speed, implementation of the Comparator interface.
     * Implements compare method.
     */
    public class CarSpeedComparator implements Comparator<Car> {

        /**
         * Overrides the compare method of the interface Comparator.
         * @param car1 first parameter for comparison
         * @param car2 second parameter for comparison
         * @return difference between first and second parameters
         */
        @Override
        public int compare(Car car1, Car car2) {
            int s1 = car1.getSpeed();
            int s2 = car2.getSpeed();
            return s1 < s2 ? -1
                    : s1 > s2 ? 1
                    : 0;
        }
    }

    /**
     * Returns the array of Cars which contain in this TaxiFleet.
     * @return the array of Cars which contain in this TaxiFleet.
     */
    public Car[] getTaxicabArray() {
        Car[] taxicabArray = new Car[this.taxicabArrayList.size()];
        this.taxicabArrayList.toArray(taxicabArray);
        return taxicabArray;
    }

    /**
     * Adds new Car to this taxi fleet.
     * @param car new car
     */
    public void addCar(Car car) {
        this.taxicabArrayList.add(car);
    }

    /**
     * Calculates the cost of this taxi fleet.
     * @return cost of fleet
     */
    public int cost() {
        int cost = 0;

        for (Car car : this.taxicabArrayList) {
            cost += car.getCost();
        }

        return cost;
    }

    /**
     * Sorts taxi fleet by fuel consumption using CarFuelConsumptionComparator.
     */
    public void sortByFuelConsumption() {
        Collections.sort(this.taxicabArrayList, new CarFuelConsumptionComparator());
    }

    /**
     * Sorts taxi fleet by speed using CarSpeedComparator.
     */
    public void sortBySpeed() {
        Collections.sort(this.taxicabArrayList, new CarSpeedComparator());
    }

    /**
     * Searches cars which are respective to defined interval of speed.
     * @param lowerLimit lower limit of interval
     * @param higherLimit higher limit of interval
     * @return ArrayList of found Cars
     */
    public ArrayList<Car> searchCarBySpeed(int lowerLimit, int higherLimit) {
        sortBySpeed();
        ArrayList<Car> matchedCars = new ArrayList<>();
        for (Car car : this.taxicabArrayList) {
            if (car.getSpeed() >= lowerLimit && car.getSpeed() <= higherLimit) {
                matchedCars.add(car);
            }
        }

        return matchedCars;
    }

    /**
     * Searches cars which have a speed equal or higher than defined limit.
     * @param lowerLimit defined lower limit
     * @return ArrayList of found Cars
     */
    public ArrayList<Car> searchCarBySpeed(int lowerLimit) {
        ArrayList<Car> matchedCars = new ArrayList<>();
        for (Car car : this.taxicabArrayList) {
            if (car.getSpeed() >= lowerLimit) {
                matchedCars.add(car);
            }
        }

        return matchedCars;
    }
}
