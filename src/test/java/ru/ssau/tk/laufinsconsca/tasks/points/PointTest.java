package ru.ssau.tk.laufinsconsca.tasks.points;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PointTest {

    @Test
    public void testToString() {
        assertEquals(new Point(1, 4, 3).toString(), "[1.0, 4.0, 3.0]");
        assertEquals(new Point(-1, 0, 5).toString(), "[-1.0, 0.0, 5.0]");
    }
}