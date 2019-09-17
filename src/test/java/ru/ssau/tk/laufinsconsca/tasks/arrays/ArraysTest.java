package ru.ssau.tk.laufinsconsca.tasks.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {

    @Test
    public void testGetRandomArray() {
        double[] array = Arrays.getRandomArray(10);
        assertEquals(array.length, 10, 0.0001);
    }
}