package ua.com.alevel;

public class Neptune implements Planet {

    private String name = "Нептун";
    private double acceleration = 11.15;

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
