package ua.kpi.fpm.task1.controller;

import ua.kpi.fpm.task1.model.*;
import ua.kpi.fpm.task1.view.View;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        TaxiFleet taxiFleet = createNewTaxiFleet(sc);

        calculateTaxiFleetCost(taxiFleet);

        sortTaxiFleetByFuelConsumption(taxiFleet);

        searchCarBySpeed(taxiFleet, sc);
    }

    public TaxiFleet createNewTaxiFleet(Scanner sc) {
        view.printAvailableCars(View.AVAILABLE_CARS_LIST);
        TaxiFleet taxiFleet = new TaxiFleet();
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        for (char ch : chars) {
            switch (ch) {
                case '0':
                    taxiFleet.addCar(new Car("Mercury Monterey", 100, 7.1f, 230, 4));
                    break;
                case '1':
                    taxiFleet.addCar(new Cabriolet("Chevrolet SS Convertible", 90, 6.0f, 200, 2, Cabriolet.RoofType.SOFT,
                            "vinyl"));
                    break;
                case '2':
                    taxiFleet.addCar(new Car("GAZ-21 Volga", 60, 8.3f, 210, 4));
                    break;
                case '3':
                    taxiFleet.addCar(new Pickup("Chevrolet Colorado", 150, 6.7f, 200, 2, 40));
                    break;
                case '4':
                    taxiFleet.addCar(new Minivan("Nissan Quest", 125, 5.7f, 250, 7, Minivan.DoorType.SLIDING_DOOR));
                    break;
                case '5':
                    taxiFleet.addCar(new Cabriolet("Ford CC 40A", 250, 4.6f, 210, 1, Cabriolet.RoofType.HARD, "metal"));
            }
        }
        return taxiFleet;
    }

    public void calculateTaxiFleetCost(TaxiFleet fleet) {
        view.printMessageAndInt(View.COST, fleet.cost());
    }

    public void sortTaxiFleetByFuelConsumption(TaxiFleet fleet) {
        fleet.sortByFuelConsumption();
        view.printMessage(View.SORTED_BY_FUEL_CONSUMPTION_TITLE);

        for (Car car : fleet.getTaxicabArray()) {
            view.printCarFuelConsumption(View.FUEL_CONSUMPTION_LIST_FORMAT, car.getName(), car.getFuelConsumption(),
                    car.getSpeed());
        }
    }

    public void searchCarBySpeed(TaxiFleet fleet, Scanner sc) {
        view.printMessage(View.SEARCH_REQUEST_MESSAGE);
        int lowerLimit = sc.nextInt();
        int higherLimit = sc.nextInt();
        ArrayList<Car> foundCars = fleet.searchCarBySpeed(lowerLimit, higherLimit);
        Car[] foundCarsArray = new Car[foundCars.size()];
        foundCars.toArray(foundCarsArray);

        for (Car car : foundCarsArray) {
            view.printCarSpeed(View.CAR_SPEED_LIST_FORMAT, car.getName(), car.getSpeed());
        }
    }
}
