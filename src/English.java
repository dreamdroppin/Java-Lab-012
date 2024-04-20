import java.util.ArrayList;

public class English {
    public SolarSystem solarSystem;

    public English() {
        //Constructor
        solarSystem = new SolarSystem();
    }

    //Create a new planet
    public void createPlanet(String name, double mass, double size, Coordinate position) {
        Planet planet = new Planet(name, mass, size, position);
        solarSystem.addPlanet(planet);
    }

    //Move all the planets
    public void movePlanets() {
        solarSystem.movePlanets();
    }

    //Show the positions of planets
    public void showPlanetPositions() {
        solarSystem.showPlanetPositions();
    }

    //Set position of planet
    public void setPlanetPosition(String name, Coordinate position) {
        solarSystem.setPlanetPosition(name, position);
    }

    //Set velocity of planet
    public void setPlanetVelocity(String name, Coordinate velocity) {
        solarSystem.setPlanetVelocity(name, velocity);
    }


    //Coordinate class in the English class
    static class Coordinate {
        private double x;
        private double y;

        public Coordinate(double x, double y) {
            //Coordinates of given vaules
            this.x = x;
            this.y = y;
        }

        //Retrieve the x value of the coordinate
        public double getX() {
            return x;
        }

        //Retrieve the y value of the coordinate
        public double getY() {
            return y;
        }

        //Find distance of two coordinates
        public double calculateDistance(Coordinate other) {
            //Find distance from the x and y values
            double distance = Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2));
            return distance;
        }

    }

    //Define the planet class in the English class
    static class Planet {
        private String name;
        private double mass;
        private double size;
        private Coordinate position;

        public Planet(String name, double mass, double size, Coordinate position) {
            //Constructor
            this.name = name;
            this.mass = mass;
            this.size = size;
            this.position = position;
        }

        //Retrieve the planet's name
        public String getName() {
            return name;
        }

        //Retrieve the planet's mass
        public double getMass() {
            return mass;
        }

        //Retrieve the planet's size
        public double getSize() {
            return size;
        }

        //Retrieve the planet's position
        public Coordinate getPosition() {
            return position;
        }

        //Set the planet's position
        public void setPosition(Coordinate position) {
            this.position = position;
        }

        //Find the distance between the planet and the sun
        public double calculateDistanceFromSun(Coordinate sunPosition) {
            double distance = position.calculateDistance(sunPosition);
            return distance;
        }

    }

    // Sun class within the English class
    static class Sun {
        private double mass;
        private double size;
        private Coordinate position;

        public Sun() {
            mass = 1.989e30; //kilograms
            size = 6.957e8; //meters
            position = new Coordinate(0.0, 0.0); //Position of the sun at center
        }

        //retrieve the sun's mass
        public double getMass() {
            return mass;
        }

        //retrieve the sun's size
        public double getSize() {
            return size;
        }

        //Retrieve the sun's position
        public Coordinate getPosition() {
            return position;
        }
    }

    private class SolarSystem {
        public void addPlanet(Planet planet) {
        }

        public void movePlanets() {
        }

        public void showPlanetPositions() {
        }

        public void setPlanetPosition(String name, Coordinate position) {
        }

        public void setPlanetVelocity(String name, Coordinate velocity) {
        }
    }
}
