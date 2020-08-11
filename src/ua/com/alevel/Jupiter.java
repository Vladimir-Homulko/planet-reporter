package ua.com.alevel;

public class Jupiter implements Planet {

    private String name = "Юпитер";
    private double acceleration = 24.784;

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
