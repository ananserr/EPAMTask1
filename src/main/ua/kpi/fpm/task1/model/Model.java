package ua.kpi.fpm.task1.model;

/**
 * Created on 5/31/16.
 * @author Anastasia Serhienko
 * @version 1.0
 */
public class Model {
    TaxiFleet taxiFleet;

    /**
     * Returns taxi fleet.
     * @return taxi fleet
     */
    public TaxiFleet getTaxiFleet() {
        return taxiFleet;
    }

    /**
     * Sets taxi fleet.
     * @param fleet taxi fleet
     */
    public void setTaxiFleet(TaxiFleet fleet) {
        this.taxiFleet = fleet;
    }

    /**
     * Adds new Car to this taxi fleet.
     * @param car new car
     */
    public void addCarToFleet(Car car) {
        this.taxiFleet.addCar(car);
    }
}
