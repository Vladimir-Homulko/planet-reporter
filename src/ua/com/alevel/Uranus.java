package ua.com.alevel;

public class Uranus implements Planet {

    private String name = "Уран";
    private double acceleration = 8.889;

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
