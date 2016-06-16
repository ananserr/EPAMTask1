package ua.kpi.fpm.task1.model;

/**
 * The Cabriolet class which extends the Car class, has a roof type and roof material.
 * Created on 6/2/16.
 * @author Anastasia Serhienko
 * @version 1.0
 */
public class Cabriolet extends Car {
    private RoofType roofType;
    private String roofMaterial;

    /**
     * Roof type.
     */
    public enum RoofType {SOFT, HARD};

    /**
     * Constructor. Refers to super. Also sets roof type and roof material, which are specific for the Cabriolet class.
     * @param name name of car
     * @param cost cost of car
     * @param fc fuel consumption of car
     * @param speed speed of car
     * @param seatsCount seats count of car
     * @param rType roof type of cabriolet
     * @param rMaterial roof material of cabriolet
     */
    public Cabriolet(String name, int cost, float fc, int speed, int seatsCount, RoofType rType, String rMaterial) {
        super(name, cost, fc, speed, seatsCount);
        this.roofType = rType;
        this.roofMaterial = rMaterial;
    }

    public String getRoofMaterial() {
        return roofMaterial;
    }

    public void setRoofMaterial(String roofMaterial) {
        this.roofMaterial = roofMaterial;
    }

    /**
     * Returns roof type of this cabriolet.
     * @return roof type of this cabriolet.
     */
    public RoofType getRoofType() {
        return this.roofType;
    }
}
