package ua.com.alevel;

public class Saturn implements Planet{

    private String name = "Сатурн";
    private double acceleration = 10.44;

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
