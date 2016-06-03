package ua.kpi.fpm.task1.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class TaxiFleetTest {
    @Test
    public void testCost() throws Exception {
        TaxiFleet taxiFleet = new TaxiFleet();
        Car car1 = new Car(200, 5.1f, 200);
        Car car2 = new Car(100, 5.1f, 200);
        taxiFleet.addCar(car1);
        taxiFleet.addCar(car2);

        assertEquals("Cost of taxi fleet", 300, taxiFleet.cost());
    }

    @Test
    public void testSortByFuelConsumption() throws Exception {
        TaxiFleet taxiFleet = new TaxiFleet();
        Car car1 = new Car(300, 5.1f, 200);
        Car car2 = new Car(300, 9.5f, 200);
        Car car3 = new Car(300, 4.6f, 200);
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
        Car car1 = new Car(100, 5.1f, 150);
        Car car2 = new Car(100, 5.1f, 100);
        Car car3 = new Car(100, 5.1f, 200);
        Car car4 = new Car(100, 5.1f, 80);
        Car car5 = new Car(100, 5.1f, 110);
        taxiFleet.addCar(car1);
        taxiFleet.addCar(car2);
        taxiFleet.addCar(car3);
        taxiFleet.addCar(car4);
        taxiFleet.addCar(car5);

        Car[] foundArray = taxiFleet.searchCarBySpeed(160);
        Car[] rightArray1 = {car4, car2, car5, car1};

        assertArrayEquals("Search car by speed (from 0 to higher limit)", rightArray1, foundArray);

        foundArray = taxiFleet.searchCarBySpeed(90, 160);
        Car[] rightArray2 = {car2, car5, car1};

        assertArrayEquals("Search car by speed (from lower limit to higher limit)", rightArray2, foundArray);
    }
}