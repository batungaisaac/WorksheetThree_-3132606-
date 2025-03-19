package griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Name: ISAAC BATUNGA
 * Student Number: 3132606
 * 
 * Test class for Rhombus
 */
public class RhombusTest {
    
    @Test
    public void testAreaCalculation() {
        Rhombus rhombus = new Rhombus("TestRhombus", 4.0, 6.0);
        assertEquals(12.0, rhombus.area(), 0.0001);
    }
    
    @Test
    public void testPerimeterCalculation() {
        Rhombus rhombus = new Rhombus("TestRhombus", 4.0, 6.0);
        double side = Math.sqrt(Math.pow(4.0/2, 2) + Math.pow(6.0/2, 2));
        assertEquals(4 * side, rhombus.perimeter(), 0.0001);
    }
    
    @Test
    public void testToString() {
        Rhombus rhombus = new Rhombus("TestRhombus", 4.0, 6.0);
        String expected = "Shape name: TestRhombus, Diagonal 1: 4.0, Diagonal 2: 6.0";
        assertEquals(expected, rhombus.toString());
    }
}
