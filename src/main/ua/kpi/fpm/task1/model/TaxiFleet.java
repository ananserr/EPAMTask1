package ua.kpi.fpm.task1.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A collection of Cars.
 * Created on 5/31/16.
 * @author Anastasia Serhienko
 * @version 1.0
 */
public class TaxiFleet {
    /**
     * The ArrayList buffer into which the cars are stored.
     */
    private ArrayList<Car> taxicabArrayList = new ArrayList<>();

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
        Collections.sort(this.taxicabArrayList,
                (car1, car2) -> (int)Math.signum(car1.getFuelConsumption() - car2.getFuelConsumption()));
    }

    /**
     * Sorts taxi fleet by speed using CarSpeedComparator.
     */
    public void sortBySpeed() {
        Collections.sort(this.taxicabArrayList, (car1, car2) -> (int)Math.signum(car1.getSpeed() - car2.getSpeed()));
    }

    /**
     * Searches cars which are respective to defined interval of speed.
     * @param lowerLimit lower limit of interval
     * @param higherLimit higher limit of interval
     * @return ArrayList of found Cars
     */
    public ArrayList<Car> searchCarBySpeed(int lowerLimit, int higherLimit) {
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
