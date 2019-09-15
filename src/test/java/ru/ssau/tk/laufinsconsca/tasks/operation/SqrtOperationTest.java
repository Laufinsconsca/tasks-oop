package ru.ssau.tk.laufinsconsca.tasks.operation;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SqrtOperationTest {
    private static final double accuracy = 0.00001;
    private Operation sqrt = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(sqrt.apply(5), Math.sqrt(5), accuracy);
        assertEquals(sqrt.apply(Double.NEGATIVE_INFINITY), Double.NaN, accuracy);
        assertEquals(sqrt.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, accuracy);
        assertEquals(sqrt.apply(-1), Double.NaN, accuracy);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(sqrt.applyTriple(5), Math.pow(5, 1. / 8), accuracy);
        assertEquals(sqrt.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, accuracy);
        assertEquals(sqrt.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, accuracy);
        assertEquals(sqrt.applyTriple(Double.NaN), Double.NaN, accuracy);
    }
}