package ua.com.alevel;

import java.util.ArrayList;
import java.util.List;

public class PlanetReporter {

    public void reporter() {
        List<Planet> planets = new ArrayList<>();
        planets.add(new Venus());
        planets.add(new Mercury());
        planets.add(new Earth());
        planets.add(new Mars());
        planets.add(new Jupiter());
        planets.add(new Saturn());

        for (Planet planet : planets) {
            System.out.println("Укорение свободного падения планеты " + planet.name() + " = " + planet.freeFallAcceleration());
        }
    }

}
