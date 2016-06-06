package ua.kpi.fpm.task1.model;

/**
 * Created by Anastasia Serhienko on 5/31/16.
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

    public void addCarToFleet(Car car) {
        this.taxiFleet.addCar(car);
    }
}
