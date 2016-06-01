package ua.kpi.fpm.task1.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class TaxiFleetTest {
    @Test
    public void testCost() throws Exception {
        TaxiFleet taxiFleet = new TaxiFleet();
        Car car1 = new Car(100);
        Car car2 = new Car(100);
        taxiFleet.addCar(car1);
        taxiFleet.addCar(car2);

        Assert.assertEquals("Cost of taxi fleet", 200, taxiFleet.cost());
    }
}