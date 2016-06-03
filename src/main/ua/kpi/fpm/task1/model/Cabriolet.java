package ua.kpi.fpm.task1.model;

/**
 * Created by Anastasia Serhienko on 6/2/16.
 */
public class Cabriolet extends Car {
    private RoofType roofType;
    private String roofMaterial;

    public enum RoofType {SOFT, HARD};

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
