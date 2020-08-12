package ua.com.alevel;

public class Ceres implements Planet {

    private String name = "Церера";
    private double acceleration = 0.27;

    public String getName() {
        return name;
    }

    public double getAcceleration() {
        return acceleration;
    }

    @Override
    public String name() {
        return getName();
    }

    @Override
    public double freeFallAcceleration() {
        return getAcceleration();
    }
}
