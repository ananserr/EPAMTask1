package ua.kpi.fpm.task1;

import org.junit.Test;

import static org.junit.Assert.*;

import ua.kpi.fpm.task1.model.TaxiFleet;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class TaxiFleetTest {
    TaxiFleet taxiFleet = new TaxiFleet();
    Car car1 = new Car(100);
    Car car2 = new Car(100);
    taxiFleet.addCar(car1);
    taxiFleet.addCar(car2);

    assertEquals("Cost of taxi fleet", 2, taxiFleet.cost());
}