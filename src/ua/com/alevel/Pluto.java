package ua.com.alevel;

public class Pluto implements Planet {

    private String name = "Плутон";
    private double acceleration = 0.58;

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
