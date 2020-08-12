package ua.com.alevel;

public class Haumea implements Planet {

    private String name = "Хаумеа";
    private double acceleration = 0.44;

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
