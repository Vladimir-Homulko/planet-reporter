package ua.com.alevel;

public class Makemake implements Planet {

    private String name = "Макемаке";
    private double acceleration = 0.4444444;

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
