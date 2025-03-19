package griffith;

/**
 * Name: ISAAC BATUNGA
 * Student Number: 3132606
 * 
 * Circle class extending the Shape abstract class
 */
public class Circle extends Shape {
    private double radius;
    
    /**
     * Constructor for Circle class
     * @param name The name of the circle
     * @param radius The radius of the circle
     */
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    /**
     * Gets the radius of the circle
     * @return The radius as a double
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Sets the radius of the circle
     * @param radius The new radius for the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Calculates the area of the circle using π*r²
     * @return The area as a double
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Calculates the perimeter (circumference) of the circle using 2*π*r
     * @return The perimeter as a double
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * Returns a string representation of the circle
     * @return A string with the circle's name and radius
     */
    @Override
    public String toString() {
        return "Shape name: " + getName() + ", Radius: " + radius;
    }
}
