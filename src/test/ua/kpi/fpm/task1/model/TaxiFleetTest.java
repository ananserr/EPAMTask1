package ua.kpi.fpm.task1.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class TaxiFleetTest {
    @Test
    public void testCost() throws Exception {
        TaxiFleet taxiFleet = new TaxiFleet();
        Car car1 = new Car("Ford", 200, 5.1f, 200, 4);
        Car car2 = new Car("Ford", 100, 5.1f, 200, 4);
        taxiFleet.addCar(car1);
        taxiFleet.addCar(car2);

        assertEquals("Cost of taxi fleet", 300, taxiFleet.cost());
    }

    @Test
    public void testSortByFuelConsumption() throws Exception {
        TaxiFleet taxiFleet = new TaxiFleet();
        Car car1 = new Car("Chevrolet", 300, 5.1f, 200, 4);
        Car car2 = new Car("Chevrolet", 300, 9.5f, 200, 4);
        Car car3 = new Car("Chevrolet", 300, 4.6f, 200, 4);
        taxiFleet.addCar(car1);
        taxiFleet.addCar(car2);
        taxiFleet.addCar(car3);

        taxiFleet.sortByFuelConsumption();
        Car[] taxiFleetArray = taxiFleet.getTaxicabArray();

        Car[] sortedArray = {car3, car1, car2};

        assertArrayEquals("Sort ascending by fuel consumption", sortedArray, taxiFleetArray);
        //assertEquals("Sort descending by fuel consumption", );
    }

    @Test
    public void testSearchCarBySpeed() throws Exception {
        TaxiFleet taxiFleet = new TaxiFleet();
        Car car1 = new Car("Mercury", 100, 5.1f, 200, 2);
        Car car2 = new Car("Mercury", 100, 5.1f, 100, 2);
        Car car3 = new Car("Mercury", 100, 5.1f, 150, 2);
        Car car4 = new Car("Mercury", 100, 5.1f, 80, 2);
        Car car5 = new Car("Mercury", 100, 5.1f, 110, 2);
        taxiFleet.addCar(car1);
        taxiFleet.addCar(car2);
        taxiFleet.addCar(car3);
        taxiFleet.addCar(car4);
        taxiFleet.addCar(car5);

        ArrayList<Car> foundCars = taxiFleet.searchCarBySpeed(150);
        Car[] foundCarsArray = new Car[foundCars.size()];
        foundCars.toArray(foundCarsArray);
        Car[] rightArray1 = {car1, car3};

        assertArrayEquals("Search car by speed (from lower limit)", rightArray1, foundCarsArray);

        foundCars = taxiFleet.searchCarBySpeed(90, 160);
        foundCarsArray = new Car[foundCars.size()];
        foundCars.toArray(foundCarsArray);
        Car[] rightArray2 = {car2, car3, car5};

        assertArrayEquals("Search car by speed (from lower limit to higher limit)", rightArray2, foundCarsArray);
    }
}