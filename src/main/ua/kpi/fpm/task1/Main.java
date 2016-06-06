package ua.kpi.fpm.task1;

import ua.kpi.fpm.task1.model.*;
import ua.kpi.fpm.task1.view.View;
import ua.kpi.fpm.task1.controller.Controller;

/**
 * Created by Anastasia Serhienko on 5/31/16.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
