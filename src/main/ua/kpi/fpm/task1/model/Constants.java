package ua.kpi.fpm.task1.model;

/**
 * Constants.
 * Created on 6/10/16.
 * @author Anastasia Serhienko
 * @version 1.0
 */
public interface Constants {
    /**
     * Count of cars in taxicab fleet.
     */
    int TAXI_FLEET_SIZE = 6;
    /**
     * The minimal fuel consumption of a car.
     */
    float MINIMAL_FUEL_CONSUMPTION = 3.0f;
    /**
     * The maximal fuel consumption of a car.
     */
    float MAXIMAL_FUEL_CONSUMPTION = 9.9f;
    int MINIMAL_COST = 1000;
    int MAXIMAL_COST = 500000;
    int MINIMAL_SPEED = 100;
    int MAXIMAL_SPEED = 300;
    int MINIMAL_SEATS_COUNT = 1;
    int MAXIMAL_SEATS_COUNT = 6;
    int MINIMAL_CARGO_VOLUME = 10;
    int MAXIMAL_CARGO_VOLUME = 100;
    String[] NAMES_ARRAY = {"Mercury Monterey", "Chevrolet SS", "GAZ-21 Volga", "Chevrolet Colorado", "Nissan Quest",
            "Ford CC 40A", "Mercedes-Benz", "Toyota", "Fiat", "Mitsubishi", "Wolksvagen"};

    String[] CAR_TYPES = {"CABRIOLET", "MINIVAN", "PICKUP"};
    String[] ROOF_MATERIALS = {"vinyl", "plastic", "metal"};
}
