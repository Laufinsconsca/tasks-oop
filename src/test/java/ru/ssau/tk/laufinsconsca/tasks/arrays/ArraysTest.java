package ru.ssau.tk.laufinsconsca.tasks.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {

    @Test
    public void testGetRandomArray() {
        double[] array = Arrays.getRandomArray(10);
        assertEquals(array.length, 10, 0.0001);
    }

    @Test
    public void testGetTwoOneTwoArray() {
        int dim = 10;
        double[] array = Arrays.getTwoOneTwoArray(dim);
        assertEquals(array[0], 2, 0.0001);
        for (int i = 1; i < dim - 1; i++) {
            assertEquals(array[i], 1, 0.0001);
        }
        assertEquals(array[dim - 1], 2, 0.0001);
    }
}