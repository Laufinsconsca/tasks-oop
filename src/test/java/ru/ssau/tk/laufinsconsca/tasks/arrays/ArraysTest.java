package ru.ssau.tk.laufinsconsca.tasks.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {

    private final double accuracy = 0.0001;

    @Test
    public void testGetRandomArray() {
        int dim = 10;
        double[] array = Arrays.getRandomArray(dim);
        assertEquals(array.length, dim, accuracy);
    }

    @Test
    public void testGetTwoOneTwoArray() {
        int dim = 10;
        double[] array = Arrays.getTwoOneTwoArray(dim);
        assertEquals(array[0], 2, accuracy);
        for (int i = 1; i < dim - 1; i++) {
            assertEquals(array[i], 1, accuracy);
        }
        assertEquals(array[dim - 1], 2, accuracy);
    }

    @Test
    public void testGetOddArray() {
        int dim = 10;
        double[] array = Arrays.getOddArray(dim);
        for (int i = 0; i < dim; i++) {
            assertEquals(array[i], i * 2 + 1, accuracy);
        }
    }

    @Test
    public void testGetEvenArrayInDescendingOrder() {
        int dim = 10;
        double[] array = Arrays.getEvenArrayInDescendingOrder(dim);
        for (int i = dim - 1; i >= 0; i--) {
            assertEquals(array[i], i * 2 + 2, accuracy);
        }
    }

    @Test
    public void testGetFibonacciArray() {
        int dim = 10;
        double[] array = Arrays.getFibonacciArray(dim);
        assertEquals(array[dim - 1], 55, accuracy);
    }

    @Test
    public void testGetSquareArray() {
        int dim = 10;
        double[] array = Arrays.getSquareArray(dim);
        assertEquals(array[dim - 1], 81, accuracy);
    }

    @Test
    public void testGetSquareEquationArray() {
        double[] firstSolutionOfFullSquareEquation = Arrays.getSquareEquationArray(3, -11, 10);
        if (firstSolutionOfFullSquareEquation != null) {
            assertEquals(firstSolutionOfFullSquareEquation[0], 2, accuracy);
            assertEquals(firstSolutionOfFullSquareEquation[1], 5. / 3, accuracy);
        }
        double[] solutionOfLinearEquation = Arrays.getSquareEquationArray(0, 3, -9);
        if (firstSolutionOfFullSquareEquation != null) {
            assertEquals(solutionOfLinearEquation[0], 3, accuracy);
        }
        double[] secondSolutionOfFullSquareEquation = Arrays.getSquareEquationArray(2, -8, 8);
        if (secondSolutionOfFullSquareEquation != null) {
            assertEquals(secondSolutionOfFullSquareEquation[0], 2, accuracy);
        }

        try {
            Arrays.getSquareEquationArray(0, 0, 5);
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "The solution doesn't exist");
        }

        try {
            Arrays.getSquareEquationArray(0, 0, 0);
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "The solution belongs to the domain of all complex numbers");
        }

        try {
            Arrays.getSquareEquationArray(3, 7, 10);
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "The solution doesn't belong to the domain of real numbers");
        }
    }

    @Test
    public void testGetNaturalNumbersNotDivisibleByThree() {
        double[] array = Arrays.getNaturalNumbersNotDivisibleByThree(11);
        assertEquals(array[0], 1, accuracy);
        assertEquals(array[1], 2, accuracy);
        assertEquals(array[2], 4, accuracy);
        assertEquals(array[3], 5, accuracy);
        assertEquals(array[4], 7, accuracy);
        assertEquals(array[5], 8, accuracy);
        assertEquals(array[6], 10, accuracy);
    }

    @Test
    public void testArithmeticProgression() {
        double[] array = Arrays.getArithmeticProgression(0, 5, 11);
        assertEquals(array[10], 50, accuracy);
    }

    @Test
    public void testGeometricProgression() {
        double[] array = Arrays.getGeometricProgression(2, 2, 11);
        assertEquals(array[10], 2048, accuracy);
    }

    @Test
    public void testGetDividersOfNumbers() {
        int[] fourthArray = Arrays.getDividersOfNumbers(256);
        for (int i = 0; i < fourthArray.length; i++) {
            if (i < 9) {
                assertEquals(fourthArray[i], -Math.pow(2, 8 - i), accuracy);
            } else {
                assertEquals(fourthArray[i], Math.pow(2, i - 9), accuracy);
            }
        }

        try {
            Arrays.getDividersOfNumbers(0);
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "The set of all natural numbers are dividers excepts zero");
        }
    }

    @Test
    public void testGetPrimeNumbersUpTo() throws NullPointerException {
        int[] array = Arrays.getPrimeNumbersUpTo(11);
        double accuracy = 0.0001;
        assertEquals(array[0], 1, accuracy);
        assertEquals(array[1], 2, accuracy);
        assertEquals(array[2], 3, accuracy);
        assertEquals(array[3], 5, accuracy);
        assertEquals(array[4], 7, accuracy);
        assertEquals(array[5], 11, accuracy);
        try {
            Arrays.getPrimeNumbersUpTo(0);
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "Zero is not prime or compound number");
        }
    }


    @Test
    public void testGetSymmetricArray() {
        int[] firstArray = Arrays.getSymmetricArray(11);
        double accuracy = 0.0001;
        assertEquals(firstArray[0], 1, accuracy);
        assertEquals(firstArray[10], 1, accuracy);
        assertEquals(firstArray[1], 2, accuracy);
        assertEquals(firstArray[9], 2, accuracy);
        assertEquals(firstArray[5], 6, accuracy);
        int[] secondArray = Arrays.getSymmetricArray(10);
        assertEquals(secondArray[0], 1, accuracy);
        assertEquals(secondArray[9], 1, accuracy);
        assertEquals(secondArray[1], 2, accuracy);
        assertEquals(secondArray[8], 2, accuracy);
        assertEquals(secondArray[5], 5, accuracy);
        try {
            Arrays.getSymmetricArray(0);
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "Incorrect size");
        }
    }

    @Test
    public void testNegate() {
        Number[] array = new Number[5];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = i - 2;
            } else {
                array[i] = i - 2.;
            }
        }
        Arrays.negate(array);
        assertEquals((array[0]).doubleValue(), 2, 0.00001);
        assertEquals((array[3]).doubleValue(), -1, 0.00001);
    }

    @Test
    public void doesArrayContainTheValue() {
        Number[] array = new Number[5];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = i - 2;
            } else {
                array[i] = i - 2.5;
            }
        }
        assertTrue(Arrays.doesArrayContainTheValue(array, -2));
        assertTrue(Arrays.doesArrayContainTheValue(array, 0.5));
        try {
            Arrays.doesArrayContainTheValue(null, 0);
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "The empty array was passed");
        }
    }

    @Test
    public void testDoesArrayContainNull() {
        Integer[] array = new Integer[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        array[2] = null;
        assertTrue(Arrays.doesArrayContainNull(array));
        array[2] = 4;
        assertFalse(Arrays.doesArrayContainNull(array));
    }

    @Test
    public void testGetCountOfEvenNumbers() {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 10) * (i + 10);
        }
        assertEquals(Arrays.getCountOfEvenNumbers(array), 6);
    }

    @Test
    public void testGetMaxElementInteger() {
        Integer[] array = new Integer[]{1, 4, 8, 2, 9, 4, 5, 11, 6};
        assertEquals((int) Arrays.getBoundaryElement(array, true), 11, 0.00001);
        assertNull(Arrays.getBoundaryElement(new Integer[]{}, true));
    }

    @Test
    public void testGetMaxElementLong() {
        Long[] array = new Long[]{0L, -3L, 2L, 2L, -3L, 0L, 0L, 0L, 2L, -3L, 0L, -3L, 3L, 3L, 0L, -3L, 2L, -3L, 2L, 1L};
        assertEquals((long) Arrays.getBoundaryElement(array, true), 3L, 0.00001);
        assertNull(Arrays.getBoundaryElement(new Long[]{}, true));
    }

    @Test
    public void testGetMaxElementFloat() {
        Float[] array = new Float[]{0F, -3F, 2F, 2F, -3F, 0F, 0F, 0F, 2F, -3F, 0F, -3F, 3F, 3F, 0F, -3F, 2F, -3F, 2F, 1F};
        assertEquals((float) Arrays.getBoundaryElement(array, true), 3L, 0.00001);
        assertNull(Arrays.getBoundaryElement(new Long[]{}, true));
    }

    @Test
    public void testGetMaxElementDouble() {
        Double[] array = new Double[]{0D, -3D, 2D, 2D, -3D, 0D, 0D, 0D, 2D, -3D, 0D, -3D, 3D, 3D, 0D, -3D, 2D, -3D, 2D, 1D};
        assertEquals((double) Arrays.getBoundaryElement(array, true), 3L, 0.00001);
        assertNull(Arrays.getBoundaryElement(new Long[]{}, true));
    }

    @Test
    public void testGetMinElement() {
        Integer[] array = new Integer[]{10, 4, 8, 2, 9, 4, 5, 11, 6};
        assertEquals((int) Arrays.getBoundaryElement(array, false), 2, 0.00001);
        assertNull(Arrays.getBoundaryElement(new Integer[]{}, false));
    }

    @Test
    public void testGetSumOfNumbersWithEvenIndices() {
        int[] array = new int[]{1, 4, 8, 2, 9, 4, 5, 11, 6};
        assertEquals(Arrays.getSumOfNumbersWithEvenIndices(array), 29, 0.00001);
    }

    @Test
    public void testIsCountOfNumbersDivisibleByTheFirstElementOfTheArrayIsGreaterThanTheLast() {
        int[] array = new int[]{1, 4, 8, 2, 9, 4, 5, 11, 6};
        assertTrue(Arrays.isCountOfNumbersDivisibleByTheFirstElementOfTheArrayIsGreaterThanTheLast(array));
    }

    @Test
    public void testGetMostFrequentElementInteger() {
        Integer[] array = new Integer[]{0, -3, 2, 2, -3, 0, 0, 0, 2, -3, 0, -3, 3, 3, 0, -3, 2, -3, 2, 1};
        assertEquals((int) Arrays.getMostFrequentElement(array), 0);
        array[0] = array[0] - array[1];
        array[1] = array[0] + array[1];
        array[0] = -array[0] + array[1];
        assertEquals((int) Arrays.getMostFrequentElement(array), -3);
        assertNull(Arrays.getMostFrequentElement(new Number[]{}));
        assertEquals(Arrays.getMostFrequentElement(new Number[]{1}), 1);
    }

    @Test
    public void testGetMostFrequentElementLong() {
        Long[] array = new Long[]{0L, -3L, 2L, 2L, -3L, 0L, 0L, 0L, 2L, -3L, 0L, -3L, 3L, 3L, 0L, -3L, 2L, -3L, 2L, 1L};
        assertEquals((int) (long) Arrays.getMostFrequentElement(array), 0);
        array[0] = array[0] - array[1];
        array[1] = array[0] + array[1];
        array[0] = -array[0] + array[1];
        assertEquals((int) (long) Arrays.getMostFrequentElement(array), -3);
    }

    @Test
    public void testGetMostFrequentElementDouble() {
        Double[] array = new Double[]{0d, 0.5, 1d, 1.5, 1.2, 1.2, 1.7, 1.2};
        assertEquals((double) Arrays.getMostFrequentElement(array), 1.2, 0.0001);
    }

    @Test
    public void testGetIndex() {
        assertEquals(Arrays.getIndex(new int[]{1, 4, 8, 2, 9, 4, 5, 11, 6}, 4), 1);
    }
}