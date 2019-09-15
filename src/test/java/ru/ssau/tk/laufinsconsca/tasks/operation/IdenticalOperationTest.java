package ru.ssau.tk.laufinsconsca.tasks.operation;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IdenticalOperationTest {
    private static final double accuracy = 0.00001;
    private Operation id = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(id.apply(5), 5, accuracy);
        assertEquals(id.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, accuracy);
        assertEquals(id.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, accuracy);
        assertEquals(id.apply(Double.NaN), Double.NaN, accuracy);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(id.applyTriple(5), 5, accuracy);
        assertEquals(id.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, accuracy);
        assertEquals(id.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, accuracy);
        assertEquals(id.applyTriple(Double.NaN), Double.NaN, accuracy);
    }
}