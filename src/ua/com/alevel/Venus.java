package ua.com.alevel;

public class Venus implements Planet {

    private String name = "Венера";
    private double acceleration = 8.88;

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
