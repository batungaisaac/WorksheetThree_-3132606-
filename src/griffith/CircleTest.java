package griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Name: ISAAC BATUNGA
 * Student Number: 3132606
 * 
 * Test class for Circle
 */
public class CircleTest {
    
    @Test
    public void testAreaCalculation() {
        Circle circle = new Circle("TestCircle", 5.0);
        assertEquals(Math.PI * 25.0, circle.area(), 0.0001);
    }
    
    @Test
    public void testPerimeterCalculation() {
        Circle circle = new Circle("TestCircle", 5.0);
        assertEquals(2 * Math.PI * 5.0, circle.perimeter(), 0.0001);
    }
    
    @Test
    public void testToString() {
        Circle circle = new Circle("TestCircle", 5.0);
        String expected = "Shape name: TestCircle, Radius: 5.0";
        assertEquals(expected, circle.toString());
    }
}
