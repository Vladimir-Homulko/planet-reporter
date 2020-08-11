package ua.com.alevel;

public class Earth implements Planet {

    private String name = "Земля";
    private double acceleration = 9.81;

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
