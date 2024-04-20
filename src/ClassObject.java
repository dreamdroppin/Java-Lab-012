import java.util.ArrayList;
import java.util.List;

public class ClassObject {
    public static void main(String[] args) {
        SolarSystem aSolarSystem = new SolarSystem();
        Sun theSun = new Sun("Sun", 6.957e8, 1.989e30, 5778);
        aSolarSystem.addSun(theSun);
        Planet planet1 = new Planet("Earth", 6371, 5.972e24, 1.496e8, 0, 0);
        aSolarSystem.addPlanet(planet1);

        aSolarSystem.showPlanets();
        aSolarSystem.movePlanets();
    }
}

class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;

    public SolarSystem() {
        planets = planets = new ArrayList<>();

    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addSun(Sun sun) {
        theSun = sun;
    }

    public void showPlanets() {
        for (Planet planet : planets) {
            System.out.println(planet.toString());
        }
    }

    public void movePlanets() {
        for (Planet planet : planets) {
            double newX = planet.getXPos() + planet.getXVel();
            double newY = planet.getYPos() + planet.getYVel();
            planet.moveTo(newX, newY);
        }
    }
}

class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double distance, double x, double y) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.x = x;
        this.y = y;
    }

    public double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }

    public void moveTo(double newX, double newY) {
        x = newX;
        y = newY;
    }

    public double getXVel() {
        return velX;
    }

    public double getYVel() {
        return velY;
    }

    public void setXVel(double newVelX) {
        velX = newVelX;
    }

    public void setYVel(double newVelY) {
        velY = newVelY;
    }

    public String toString() {
        return "Planet " + name + ": Position(" + x + ", " + y + ")";
    }
}

class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    public Sun(String name, double radius, double mass, double temp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
    }

    public double getXVel() {
        return 0; // Sun is stationary for this simulation
    }

    public double getYVel() {
        return 0; // Sun is stationary for this simulation
    }

    public double getMass() {
        return mass;
    }

    public String toString() {
        return "Sun " + name + ": Mass = " + mass;
    }
}
