package ua.com.alevel;

public class Mars implements Planet {

    private String name = "Марс";
    private double acceleration = 3.711;

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
