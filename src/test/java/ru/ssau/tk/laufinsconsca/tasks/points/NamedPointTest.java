package ru.ssau.tk.laufinsconsca.tasks.points;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NamedPointTest {

    @Test
    public void testFirstNamedPointConstructor() {
        NamedPoint namedPoint = new NamedPoint();
        assertEquals(namedPoint.length(), 0, 0.00001);
        assertEquals(namedPoint.getName(), "Origin");
    }

    @Test
    public void testSecondNamedPointConstructor() {
        NamedPoint namedPoint = new NamedPoint(1, 2, 2);
        assertEquals(namedPoint.length(), 3, 0.00001);
        namedPoint.setName("Point");
        assertEquals(namedPoint.getName(), "Point");
    }

    @Test
    public void testThirdNamedPointConstructor() {
        NamedPoint namedPoint = new NamedPoint("Point", 2, 1, 2);
        assertEquals(namedPoint.length(), 3, 0.00001);
        assertEquals(namedPoint.getName(), "Point");
    }


    @Test
    public void testReset() {
        NamedPoint namedPoint = new NamedPoint("Point", 2, 2, 1);
        namedPoint.reset();
        assertEquals(namedPoint.getName(), "Absent");
    }

    @Test
    public void testToString() {
        assertEquals(new NamedPoint("x", 1, 4, 3).toString(), "x [1.0, 4.0, 3.0]");
        assertEquals(new NamedPoint(-1, 0, 5).toString(), "[-1.0, 0.0, 5.0]");
    }


}