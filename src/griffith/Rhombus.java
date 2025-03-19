package griffith;

/**
 * Name: ISAAC BATUNGA
 * Student Number: 3132606
 * 
 * Rhombus class extending the Shape abstract class
 */
public class Rhombus extends Shape {
    private double diagonal1;
    private double diagonal2;
    
    /**
     * Constructor for Rhombus class
     * @param name The name of the rhombus
     * @param diagonal1 The length of the first diagonal
     * @param diagonal2 The length of the second diagonal
     */
    public Rhombus(String name, double diagonal1, double diagonal2) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    
    /**
     * Gets the length of the first diagonal
     * @return The length as a double
     */
    public double getDiagonal1() {
        return diagonal1;
    }
    
    /**
     * Sets the length of the first diagonal
     * @param diagonal1 The new length for the first diagonal
     */
    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }
    
    /**
     * Gets the length of the second diagonal
     * @return The length as a double
     */
    public double getDiagonal2() {
        return diagonal2;
    }
    
    /**
     * Sets the length of the second diagonal
     * @param diagonal2 The new length for the second diagonal
     */
    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
    
    /**
     * Calculates the area of the rhombus using (d1*d2)/2
     * @return The area as a double
     */
    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }
    
    /**
     * Calculates the perimeter of the rhombus using 4*side
     * where side is calculated using the Pythagorean theorem on half diagonals
     * @return The perimeter as a double
     */
    @Override
    public double perimeter() {
        double halfDiagonal1 = diagonal1 / 2;
        double halfDiagonal2 = diagonal2 / 2;
        double side = Math.sqrt(Math.pow(halfDiagonal1, 2) + Math.pow(halfDiagonal2, 2));
        return 4 * side;
    }
    
    /**
     * Returns a string representation of the rhombus
     * @return A string with the rhombus's name and diagonals
     */
    @Override
    public String toString() {
        return "Shape name: " + getName() + ", Diagonal 1: " + diagonal1 + ", Diagonal 2: " + diagonal2;
    }
}