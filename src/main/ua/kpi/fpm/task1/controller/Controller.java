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
    public void manageTaxiCompany() {
        Scanner sc = new Scanner(System.in);
        view.printAvailableCars(View.AVAILABLE_CARS_LIST);
        TaxiFleet taxiFleet = new TaxiFleet();
        switch (sc.nextInt()) {
            case 0:
                taxiFleet.addCar(new Car("Mercury Monterey", 100, 7.1f, 230, 4));
                break;
            case 1:
                taxiFleet.addCar(new Cabriolet("Chevrolet SS Convertible", 90, 6.0f, 200, 2, Cabriolet.RoofType.SOFT,
                        "vinyl"));
                break;
            case 2:
                taxiFleet.addCar(new Car("GAZ-21 Volga", 60, 8.3f, 210, 4));
                break;
            case 3:
                taxiFleet.addCar(new Pickup("Chevrolet Colorado", 150, 6.7f, 200, 2, 40));
                break;
            case 4:
                taxiFleet.addCar(new Minivan("Nissan Quest", 125, 5.7f, 250, 7, Minivan.DoorType.SLIDING_DOOR));
                break;
            case 5:
                taxiFleet.addCar(new Cabriolet("Ford CC 40A", 250, 4.6f, 210, 1, Cabriolet.RoofType.HARD, "metal"));
        }

        System.out.println("cost: " + taxiFleet.cost());
        taxiFleet.sortByFuelConsumption();
        System.out.println("Sorted by fuel consumption:");
        for (Car car : taxiFleet.getTaxicabArray()) {
            System.out.println(car.getName() + " " + car.getFuelConsumption());
        }
        System.out.println("Search car by speed diapason (enter both higher and lower limit):");
        int lowerLimit = sc.nextInt();
        int higherLimit = sc.nextInt();
        ArrayList<Car> foundCars = taxiFleet.searchCarBySpeed(lowerLimit, higherLimit);
        Car[] foundCarsArray = new Car[foundCars.size()];
        foundCars.toArray(foundCarsArray);

        for (Car car : foundCars) {
            System.out.println(car.getName() + " " + car.getSpeed());
        }

    }
}
