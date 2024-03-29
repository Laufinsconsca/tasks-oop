package ru.ssau.tk.laufinsconsca.tasks.points;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PointsTest {

    @Test
    public void testSum() {
        assertTrue(Points.equalsApproximately(Points.sum(new Point(1.0, 1.0, 1.0), new Point(2.0, 2.0, 2.0)), new Point(3.0, 3.0, 3.0)));
    }

    @Test
    public void testSubtract() {
        assertTrue(Points.equalsApproximately(Points.subtract(new Point(1.0, 1.0, 1.0), new Point(2.0, 2.0, 2.0)), new Point(-1.0, -1.0, -1.0)));
    }

    @Test
    public void testMultiply() {
        assertTrue(Points.equalsApproximately(Points.multiply(new Point(1.0, 1.5, 0.5), new Point(2.0, 3.0, -1.0)), new Point(2.0, 4.5, -0.5)));
    }

    @Test
    public void testDivide() {
        assertTrue(Points.equalsApproximately(Points.divide(new Point(1.0, 1.5, 0.5), new Point(2.0, 0.8, -0.6)), new Point(0.5, 1.875, -0.833333)));
    }

    @Test
    public void testEnlarge() {
        assertTrue(Points.equalsApproximately(Points.enlarge(new Point(1.0, 1.5, 0.5), 2.3), new Point(2.3, 3.45, 1.15)));
    }

    @Test
    public void testLength() {
        assertEquals(Points.length(new Point(1.0, 1.0, 1.0)), Math.sqrt(3), 0.00005);
    }

    @Test
    public void testOpposite() {
        assertTrue(Points.equalsApproximately(Points.opposite(new Point(1.0, 1.5, -0.5)), new Point(-1.0, -1.5, 0.5)));
    }

    @Test
    public void testInverse() {
        assertTrue(Points.equalsApproximately(Points.inverse(new Point(1.0, 1.5, 0.5)), new Point(1.0, 0.66666, 2.0)));
    }

    @Test
    public void testScalarProduct() {
        assertEquals(Points.scalarProduct(new Point(1.0, 0.5, 2.0), new Point(3.0, -0.5, 4.0)), 10.75, 0.00005);
    }

    @Test
    public void testVectorProduct() {
        assertTrue(Points.equalsApproximately(Points.vectorProduct(new Point(3.0, 2.0, 1.0), new Point(-1.0, 4.0, 5.0)), new Point(6.0, -16.0, 14.0)));
    }

}