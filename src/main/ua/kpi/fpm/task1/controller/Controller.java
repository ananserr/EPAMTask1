package ua.kpi.fpm.task1.controller;

import ua.kpi.fpm.task1.model.*;
import ua.kpi.fpm.task1.view.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class Controller {

    private static final int FIRST_MENU_OPTION = 0;
    private static final int LAST_MENU_OPTION = 3;

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    /**
     * Main work method. Provides work with user.
     */
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        TaxiFleet taxiFleet = createNewTaxiFleet(sc);
        menu(sc, taxiFleet);
    }

    /**
     * Provides work of menu. Invokes methods which corresponds to each menu option.
     * Menu options inputs with scanner by special method.
     * @param sc scanner link
     * @param fleet taxicab fleet link
     */
    public void menu(Scanner sc, TaxiFleet fleet) {
        int quitMenuOption = FIRST_MENU_OPTION;
        int option = inputMenuOptionWithScanner(sc);

        while (option != quitMenuOption) {
            switch (option) {
                case 1:
                    calculateTaxiFleetCost(fleet);
                    break;
                case 2:
                    sortTaxiFleetByFuelConsumption(fleet);
                    break;
                case 3:
                    searchCarBySpeed(fleet, sc);
            }
            option = inputMenuOptionWithScanner(sc);
        }

        view.printMessage(View.QUIT);
    }

    /**
     * Method for input menu options with scanner. Also checks if inputted arguments are valid.
     * @param sc scanner link
     * @return menu option
     */
    public int inputMenuOptionWithScanner(Scanner sc) {
        boolean inputIsValid = false;
        int menuOption = -1;

        view.printMessage(View.MENU);
        while (!inputIsValid) {

                while (!sc.hasNextInt()) {
                    view.printMessage(View.WRONG_INPUT_DATA + View.NOT_INTEGER);
                    view.printMessage(View.MENU);
                }

                menuOption = sc.nextInt();

                if (menuOption >= FIRST_MENU_OPTION && menuOption <= LAST_MENU_OPTION) {
                    inputIsValid = true;
                } else {
                    view.printMessage(View.WRONG_INPUT_DATA + View.INCORRECT_OPTION);
                }
            }

            return menuOption;
    }

    /**
     * Creates new TaxiFleet and gets values with scanner for this new fleet.
     * @param sc scanner link
     * @return TaxiFleet
     */
    public TaxiFleet createNewTaxiFleet(Scanner sc) {
        ArrayList<String> strings = new ArrayList<String>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("resources/Cars.txt"));
            String line = reader.readLine();

            while (line != null) {
                strings.add(line);
                line = reader.readLine();
            }

            reader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        view.printMessage(View.AVAILABLE_CARS);

        for (int i = 0; i < strings.size(); i++) {
            view.printCarsList(i, strings.get(i));
        }

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
                    break;
                default:
                    view.printMessage(View.WRONG_INPUT_DATA + View.INCORRECT_OPTION);
            }
        }

        return taxiFleet;
    }

    /**
     * Calls the method cost of the TaxiFleet class and provides output of returned value to the terminal.
     * @param fleet taxi fleet
     */
    public void calculateTaxiFleetCost(TaxiFleet fleet) {
        view.printMessageAndInt(View.COST, fleet.cost());
    }

    /**
     * Calls the method sortByFuelConsumption of the TaxiFleet class and provides output of sorted fleet
     * to the terminal.
     * @param fleet taxi fleet
     */
    public void sortTaxiFleetByFuelConsumption(TaxiFleet fleet) {
        fleet.sortByFuelConsumption();
        view.printMessage(View.SORTED_BY_FUEL_CONSUMPTION_TITLE);

        for (Car car : fleet.getTaxicabArray()) {
            view.printCarFuelConsumption(View.FUEL_CONSUMPTION_LIST_FORMAT, car.getName(), car.getFuelConsumption(),
                    car.getSpeed());
        }
    }

    /**
     * Provides work with searchCarBySpeed method of the TaxiFleet class.
     * Gets lower and higher limits of search from the terminal, calls search method and provides output of found cars.
     * @param fleet taxi fleet
     * @param sc scanner link
     */
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
