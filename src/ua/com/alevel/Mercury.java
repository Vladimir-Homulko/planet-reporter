package ua.com.alevel;

public class Mercury implements Planet {

    private String name = "Меркурий";
    private double acceleration = 3.72;

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
