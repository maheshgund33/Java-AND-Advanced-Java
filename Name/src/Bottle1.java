
public class Bottle1 extends Bottle{
 
	private double height;
    private double radius;

    // Constructor
    
   

    // Method to calculate the volume of the bottle
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public Bottle1(double height, double radius, double height2, double radius2) {
		super(radius2, radius2);
		height = height2;
		radius = radius2;
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


}