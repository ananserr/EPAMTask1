package ua.kpi.fpm.task1.view;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class View {
    public static final String AVAILABLE_CARS = "Available cars: ";
    public static final String SORTED_BY_FUEL_CONSUMPTION_TITLE = "Sorted by fuel consumption: ";
    public static final String FUEL_CONSUMPTION_LIST_FORMAT = "%s    Fuel consumption: %f    Speed: %d\n";
    public static final String CAR_SPEED_LIST_FORMAT = "%s    Speed: %d\n";
    public static final String SEARCH_REQUEST_MESSAGE = "Search car by speed diapason " +
            "(enter both higher and lower limit): ";
    public static final String COST = "Taxicab fleet cost: $";
    public static final String MENU = "--- Main menu ---\nCalculate COST of taxicab fleet - press 1\n" +
            "SORT fleet by FUEL consumption - press 2\nSEARCH car by SPEED - press 3\nQuit - press 0";
    public static final String WRONG_INPUT_DATA = "Wrong input data. ";
    public static final String NOT_INTEGER = "Inputted data is not an integer number. Please, try again. ";
    public static final String INCORRECT_OPTION = "There is no such option in this menu. Try another option. ";
    public static final String QUIT = "Program finished!";
    private static final String CARS_LIST_FORMAT = "%d - %s\n";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printCarsList(int no, String car) {
        System.out.printf(CARS_LIST_FORMAT, no, car);
    }
    public void printCarFuelConsumption(String message, String name, float fc, int speed) {
        System.out.printf(message, name, fc, speed);
    }

    public void printCarSpeed(String message, String name, int speed) {
        System.out.printf(message, name, speed);
    }

    public void printMessageAndInt(String message, int intValue) {
        System.out.println(message + intValue);
    }
}
