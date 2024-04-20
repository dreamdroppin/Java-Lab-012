public class Implementation {
    private Sun theSun;
    private Planet thePlanet;

    class Sun {
        private String name;
        private double radius;
        private double mass;
        private double temp;
        private double x;
        private double y;

        public Sun(String name, double radius, double mass, double temp, double x, double y) {
            this.name = name;
            this.radius = radius;
            this.mass = mass;
            this.temp = temp;
            this.x = x;
            this.y = y;
        }

        // Method to get the x position of the sun
        public double getXPos() {
            return x;
        }

        // Method to get the y position of the sun
        public double getYPos() {
            return y;
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
    }

    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        double rx = theSun.getXPos() - thePlanet.getXPos();
        double ry = theSun.getYPos() - thePlanet.getYPos();
        double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

        double accX = G * theSun.mass * rx / Math.pow(r, 3);
        double accY = G * theSun.mass * ry / Math.pow(r, 3);

        thePlanet.setXVel(thePlanet.getXVel() + dt * accX);
        thePlanet.setYVel(thePlanet.getYVel() + dt * accY);

        thePlanet.moveTo(thePlanet.getXPos() + dt * thePlanet.getXVel(), thePlanet.getYPos() + dt * thePlanet.getYVel());
    }
}
