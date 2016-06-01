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
        Car car1 = new Car(200, 5.1f);
        Car car2 = new Car(100, 5.1f);
        taxiFleet.addCar(car1);
        taxiFleet.addCar(car2);

        assertEquals("Cost of taxi fleet", 300, taxiFleet.cost());
    }

    @Test
    public void testSortByFuelConsumption() throws Exception {
        //5.1f 9.5f 4.6
        TaxiFleet taxiFleet = new TaxiFleet();
        Car car1 = new Car(300, 5.1f);
        Car car2 = new Car(100, 9.5f);
        Car car3 = new Car(200, 4.6f);
        taxiFleet.addCar(car1);
        taxiFleet.addCar(car2);
        taxiFleet.addCar(car3);

        taxiFleet.sortByFuelConsumption();
        Car[] taxiFleetArray = taxiFleet.getTaxicabArray();

        Car[] sortedArray = {car3, car1, car2};

        assertArrayEquals("Sort ascending by fuel consumption", sortedArray, taxiFleetArray);
        //assertEquals("Sort descending by fuel consumption", );
    }
}