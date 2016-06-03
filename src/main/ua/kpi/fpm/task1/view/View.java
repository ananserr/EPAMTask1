package ua.kpi.fpm.task1.view;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class View {
    public static final String AVAILABLE_CARS_LIST = "Available cars:\n" +
            "%d - sedan Mercury Monterey, $100 000, Fuel Consumption: 7.1, Speed: 230 km/h, 4 seats\n" +
            "%d - convertible (cabriolet) Chevrolet SS Convertible, $90 000, Fuel Consumption: 6.0, " +
            "Speed: 200 km/h, 2 seats, soft vinyl top\n" +
            "%d - sedan GAZ-21 Volga, $60 000, Fuel Consumption: 8.3, Speed: 210 km/h, 4 seats\n" +
            "%d - pickup Chevrolet Colorado, $150 000, Fuel Consumption: 6.7, Speed: 200 km/h, 2 seats, " +
            "Cargo volume: 40\n" +
            "%d - minivan Nissan Quest, $125 000, Fuel Consumption: 5.7, Speed 250 km/h, 7 seats, sliding doors\n" +
            "%d - convertible Ford CC 40A, $250 000, Fuel Consumption: 4.6, Speed 210 km/h, 1 seat, " +
            "hard metal top";
    // Text constants

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printAvailableCars(String message){
        System.out.printf(message, 0, 1, 2, 3, 4, 5);
    }
}
