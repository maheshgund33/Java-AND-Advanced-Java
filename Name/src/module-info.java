public class Bottle {
    private double height;
    private double radius;

    // Constructor
    public Bottle(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Method to calculate the volume of the bottle
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to calculate the surface area of the bottle
    public double calculateSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        // Create a Bottle object
        Bottle bottle = new Bottle(10.0, 5.0);

        // Display information about the bottle
        System.out.println("Bottle Volume: " + bottle.calculateVolume());
        System.out.println("Bottle Surface Area: " + bottle.calculateSurfaceArea());
    }
}
