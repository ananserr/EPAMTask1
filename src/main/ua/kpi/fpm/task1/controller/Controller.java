package ua.kpi.fpm.task1.controller;

import ua.kpi.fpm.task1.model.Model;
import ua.kpi.fpm.task1.view.View;

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
    }
}
