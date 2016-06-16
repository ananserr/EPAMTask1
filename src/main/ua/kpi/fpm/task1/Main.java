package ua.kpi.fpm.task1;

import ua.kpi.fpm.task1.model.*;
import ua.kpi.fpm.task1.view.View;
import ua.kpi.fpm.task1.controller.Controller;

/**
 * Created on 5/31/16.
 * @author Anastasia Serhienko
 * @version 1.0
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
