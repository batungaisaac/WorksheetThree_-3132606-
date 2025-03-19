package griffith;

/**
 * Name: ISAAC BATUNGA
 * Student Number: 3132606
 * 
 * Abstract class representing a geometric shape.
 */
public abstract class Shape {
    private String name;
    
    /**
     * Constructor for Shape class
     * @param name The name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }
    
    /**
     * Gets the name of the shape
     * @return The name of the shape
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the shape
     * @param name The new name for the shape
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Calculates the area of the shape
     * @return The area as a double
     */
    public abstract double area();
    
    /**
     * Calculates the perimeter of the shape
     * @return The perimeter as a double
     */
    public abstract double perimeter();
    
    /**
     * Returns a string representation of the shape
     * @return A string with the shape's name
     */
    @Override
    public String toString() {
        return "Shape name: " + name;
    }
}