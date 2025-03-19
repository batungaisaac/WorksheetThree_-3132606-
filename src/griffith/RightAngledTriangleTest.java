package griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Name: ISAAC BATUNGA
 * Student Number: 3132606
 * 
 * Test class for RightAngledTriangle
 */
public class RightAngledTriangleTest {
    
    @Test
    public void testAreaCalculation() {
        RightAngledTriangle triangle = new RightAngledTriangle("TestTriangle", 3.0, 4.0);
        assertEquals(6.0, triangle.area(), 0.0001);
    }
    
    @Test
    public void testPerimeterCalculation() {
        RightAngledTriangle triangle = new RightAngledTriangle("TestTriangle", 3.0, 4.0);
        // Hypotenuse is calculated using Pythagoras
        double hypotenuse = Math.sqrt(3.0*3.0 + 4.0*4.0);
        assertEquals(3.0 + 4.0 + hypotenuse, triangle.perimeter(), 0.0001);
    }
    
    @Test
    public void testToString() {
        RightAngledTriangle triangle = new RightAngledTriangle("TestTriangle", 3.0, 4.0);
        String expected = "Shape name: TestTriangle, Base: 3.0, Height: 4.0";
        assertEquals(expected, triangle.toString());
    }
}