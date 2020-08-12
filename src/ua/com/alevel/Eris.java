package ua.com.alevel;

public class Eris implements Planet {

    private String name = "Эрида";
    private double acceleration = 0.827;

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
