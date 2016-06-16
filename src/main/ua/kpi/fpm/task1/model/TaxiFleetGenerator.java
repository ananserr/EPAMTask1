package ua.kpi.fpm.task1.model;

import java.util.Random;

/**
 * Generates random taxi fleet.
 * Created on 5/31/16.
 * @author Anastasia Serhienko
 * @version 1.0
 */
public class TaxiFleetGenerator {

    /**
     * Generates random taxi fleet.
     * @return random taxi fleet
     */
    public static TaxiFleet generateTaxiFleet() {
        Random rand = new Random();
        TaxiFleet taxiFleet = new TaxiFleet();

        for (int i = 0; i < Constants.TAXI_FLEET_SIZE; i++) {
            String name = Constants.NAMES_ARRAY[rand.nextInt(Constants.NAMES_ARRAY.length)];
            int cost = Constants.MINIMAL_COST + rand.nextInt(Constants.MAXIMAL_COST - Constants.MINIMAL_COST);
            float fc = Constants.MINIMAL_FUEL_CONSUMPTION +
                    (Constants.MAXIMAL_FUEL_CONSUMPTION - Constants.MINIMAL_FUEL_CONSUMPTION) * rand.nextFloat();
            int speed = Constants.MINIMAL_SPEED + rand.nextInt(Constants.MAXIMAL_SPEED - Constants.MINIMAL_SPEED);
            int seats = Constants.MINIMAL_SEATS_COUNT + rand.nextInt(Constants.MAXIMAL_SEATS_COUNT -
                    Constants.MINIMAL_SEATS_COUNT);
            int carType = rand.nextInt(Constants.CAR_TYPES.length);

            switch (Constants.CAR_TYPES[carType]) {
                case "CABRIOLET":
                    Cabriolet.RoofType roofType;
                    String roofMaterial = Constants.ROOF_MATERIALS[rand.nextInt(Constants.ROOF_MATERIALS.length)];
                    int rType = rand.nextInt(2);

                    if (rType == 0) {
                        roofType = Cabriolet.RoofType.HARD;
                    }
                    else {
                        roofType = Cabriolet.RoofType.SOFT;
                    }

                    taxiFleet.addCar(new Cabriolet(name, cost, fc, speed, seats, roofType, roofMaterial));
                    break;
                case "MINIVAN":
                    Minivan.DoorType doorType;
                    int dType = rand.nextInt(2);

                    if (dType == 0) {
                        doorType = Minivan.DoorType.CLASSIC_DOOR;
                    }
                    else {
                        doorType = Minivan.DoorType.SLIDING_DOOR;
                    }

                    taxiFleet.addCar(new Minivan(name, cost, fc, speed, seats, doorType));
                    break;
                case "PICKUP":
                    int cargo = Constants.MAXIMAL_CARGO_VOLUME +
                            rand.nextInt(Constants.MAXIMAL_CARGO_VOLUME - Constants.MINIMAL_CARGO_VOLUME);
                    taxiFleet.addCar(new Pickup(name, cost, fc, speed, seats, cargo));
                    break;
                default:
                    taxiFleet.addCar(new Car(name, cost, fc, speed, seats));
                    break;
            }

        }

        return taxiFleet;
    }
}
