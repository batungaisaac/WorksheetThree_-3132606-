package griffith;

/**
 * Name: ISAAC BATUNGA
 * Student Number: 3132606
 * 
 * RightAngledTriangle class extending the Shape abstract class
 */
public class RightAngledTriangle extends Shape {
    private double base;
    private double height;
    
    /**
     * Constructor for RightAngledTriangle class
     * @param name The name of the triangle
     * @param base The base length of the triangle
     * @param height The height of the triangle
     */
    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }
    
    /**
     * Gets the base length of the triangle
     * @return The base length as a double
     */
    public double getBase() {
        return base;
    }
    
    /**
     * Sets the base length of the triangle
     * @param base The new base length for the triangle
     */
    public void setBase(double base) {
        this.base = base;
    }
    
    /**
     * Gets the height of the triangle
     * @return The height as a double
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Sets the height of the triangle
     * @param height The new height for the triangle
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Calculates the area of the right-angled triangle using (base*height)/2
     * @return The area as a double
     */
    @Override
    public double area() {
        return (base * height) / 2;
    }
    
    /**
     * Calculates the perimeter of the right-angled triangle
     * using base + height + hypotenuse
     * @return The perimeter as a double
     */
    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return base + height + hypotenuse;
    }
    
    /**
     * Returns a string representation of the right-angled triangle
     * @return A string with the triangle's name, base, and height
     */
    @Override
    public String toString() {
        return "Shape name: " + getName() + ", Base: " + base + ", Height: " + height;
    }
}
