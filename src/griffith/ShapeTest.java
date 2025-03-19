package griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

/**
 * Name: ISAAC BATUNGA
 * Student Number: 3132606
 * 
 * Test class for integrating all shape classes
 */
public class ShapeTest {
    
    // Unit tests for Circle
    @Test
    public void testCircleArea() {
        Circle circle = new Circle("UnitTestCircle", 3.0);
        assertEquals(Math.PI * 9.0, circle.area(), 0.0001);
    }
    
    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle("UnitTestCircle", 3.0);
        assertEquals(2 * Math.PI * 3.0, circle.perimeter(), 0.0001);
    }
    
    @Test
    public void testCircleToString() {
        Circle circle = new Circle("UnitTestCircle", 3.0);
        assertEquals("Shape name: UnitTestCircle, Radius: 3.0", circle.toString());
    }
    
    // Unit tests for Rhombus
    @Test
    public void testRhombusArea() {
        Rhombus rhombus = new Rhombus("UnitTestRhombus", 6.0, 8.0);
        assertEquals(24.0, rhombus.area(), 0.0001);
    }
    
    @Test
    public void testRhombusPerimeter() {
        Rhombus rhombus = new Rhombus("UnitTestRhombus", 6.0, 8.0);
        double side = Math.sqrt(Math.pow(6.0/2, 2) + Math.pow(8.0/2, 2));
        assertEquals(4 * side, rhombus.perimeter(), 0.0001);
    }
    
    @Test
    public void testRhombusToString() {
        Rhombus rhombus = new Rhombus("UnitTestRhombus", 6.0, 8.0);
        assertEquals("Shape name: UnitTestRhombus, Diagonal 1: 6.0, Diagonal 2: 8.0", rhombus.toString());
    }
    
    // Unit tests for RightAngledTriangle
    @Test
    public void testTriangleArea() {
        RightAngledTriangle triangle = new RightAngledTriangle("UnitTestTriangle", 5.0, 12.0);
        assertEquals(30.0, triangle.area(), 0.0001);
    }
    
    @Test
    public void testTrianglePerimeter() {
        RightAngledTriangle triangle = new RightAngledTriangle("UnitTestTriangle", 5.0, 12.0);
        double hypotenuse = Math.sqrt(Math.pow(5.0, 2) + Math.pow(12.0, 2));
        assertEquals(5.0 + 12.0 + hypotenuse, triangle.perimeter(), 0.0001);
    }
    
    @Test
    public void testTriangleToString() {
        RightAngledTriangle triangle = new RightAngledTriangle("UnitTestTriangle", 5.0, 12.0);
        assertEquals("Shape name: UnitTestTriangle, Base: 5.0, Height: 12.0", triangle.toString());
    }
    
    // Integration test for all shapes
    @Test
    public void testShapeIntegration() {
        // Create a list of shapes
        ArrayList<Shape> shapes = new ArrayList<>();
        
        // Add two of each shape
        shapes.add(new Circle("IntegrationCircle1", 3.5));
        shapes.add(new Circle("IntegrationCircle2", 7.0));
        shapes.add(new Rhombus("IntegrationRhombus1", 5.0, 12.0));
        shapes.add(new Rhombus("IntegrationRhombus2", 8.0, 10.0));
        shapes.add(new RightAngledTriangle("IntegrationTriangle1", 9.0, 12.0));
        shapes.add(new RightAngledTriangle("IntegrationTriangle2", 6.0, 8.0));
        
        // Expected values for areas and perimeters
        double[] expectedAreas = {
            Math.PI * 3.5 * 3.5,               // Circle 1
            Math.PI * 7.0 * 7.0,               // Circle 2
            (5.0 * 12.0) / 2,                  // Rhombus 1
            (8.0 * 10.0) / 2,                  // Rhombus 2
            (9.0 * 12.0) / 2,                  // Triangle 1
            (6.0 * 8.0) / 2                    // Triangle 2
        };
        
        double[] expectedPerimeters = {
            2 * Math.PI * 3.5,                 // Circle 1
            2 * Math.PI * 7.0,                 // Circle 2
            4 * Math.sqrt(Math.pow(5.0/2, 2) + Math.pow(12.0/2, 2)),  // Rhombus 1
            4 * Math.sqrt(Math.pow(8.0/2, 2) + Math.pow(10.0/2, 2)),  // Rhombus 2
            9.0 + 12.0 + Math.sqrt(Math.pow(9.0, 2) + Math.pow(12.0, 2)),  // Triangle 1
            6.0 + 8.0 + Math.sqrt(Math.pow(6.0, 2) + Math.pow(8.0, 2))     // Triangle 2
        };
        
        // Test each shape in the list
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            // Test area
            assertEquals(expectedAreas[i], shape.area(), 0.0001, 
                "Area test failed for " + shape.getName());
            // Test perimeter
            assertEquals(expectedPerimeters[i], shape.perimeter(), 0.0001, 
                "Perimeter test failed for " + shape.getName());
            // Verify toString is not empty
            assertFalse(shape.toString().isEmpty(), 
                "toString test failed for " + shape.getName());
        }
    }
}