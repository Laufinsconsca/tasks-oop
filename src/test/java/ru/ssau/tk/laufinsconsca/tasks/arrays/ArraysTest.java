package ru.ssau.tk.laufinsconsca.tasks.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {

    private final double ACCURACY = 0.0001;

    @Test
    public void testGetRandomArray() {
        int dim = 10;
        double[] array = Arrays.getRandomArray(dim);
        assertEquals(array.length, dim, ACCURACY);
    }

    @Test
    public void testGetTwoOneTwoArray() {
        int dim = 10;
        double[] array = Arrays.getTwoOneTwoArray(dim);
        assertEquals(array[0], 2, ACCURACY);
        for (int i = 1; i < dim - 1; i++) {
            assertEquals(array[i], 1, ACCURACY);
        }
        assertEquals(array[dim - 1], 2, ACCURACY);
    }

    @Test
    public void testGetOddArray() {
        int dim = 10;
        double[] array = Arrays.getOddArray(dim);
        for (int i = 0; i < dim; i++) {
            assertEquals(array[i], i * 2 + 1, ACCURACY);
        }
    }

    @Test
    public void testGetEvenArrayInDescendingOrder() {
        int dim = 10;
        double[] array = Arrays.getEvenArrayInDescendingOrder(dim);
        for (int i = dim - 1; i >= 0; i--) {
            assertEquals(array[i], i * 2 + 2, ACCURACY);
        }
    }

    @Test
    public void testGetFibonacciArray() {
        int dim = 10;
        double[] array = Arrays.getFibonacciArray(dim);
        assertEquals(array[dim - 1], 55, ACCURACY);
    }

    @Test
    public void testGetSquareArray() {
        int dim = 10;
        double[] array = Arrays.getSquareArray(dim);
        assertEquals(array[dim - 1], 81, ACCURACY);
    }

    @Test
    public void testGetSquareEquationArray() {
        double[] firstSolutionOfFullSquareEquation = Arrays.getSquareEquationArray(3, -11, 10);
        if (firstSolutionOfFullSquareEquation != null) {
            assertEquals(firstSolutionOfFullSquareEquation[0], 2, ACCURACY);
            assertEquals(firstSolutionOfFullSquareEquation[1], 5. / 3, ACCURACY);
        }
        double[] solutionOfLinearEquation = Arrays.getSquareEquationArray(0, 3, -9);
        if (firstSolutionOfFullSquareEquation != null) {
            assertEquals(solutionOfLinearEquation[0], 3, ACCURACY);
        }
        double[] secondSolutionOfFullSquareEquation = Arrays.getSquareEquationArray(2, -8, 8);
        if (secondSolutionOfFullSquareEquation != null) {
            assertEquals(secondSolutionOfFullSquareEquation[0], 2, ACCURACY);
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
        assertEquals(array[0], 1, ACCURACY);
        assertEquals(array[1], 2, ACCURACY);
        assertEquals(array[2], 4, ACCURACY);
        assertEquals(array[3], 5, ACCURACY);
        assertEquals(array[4], 7, ACCURACY);
        assertEquals(array[5], 8, ACCURACY);
        assertEquals(array[6], 10, ACCURACY);
    }

    @Test
    public void testArithmeticProgression() {
        double[] array = Arrays.getArithmeticProgression(0, 5, 11);
        assertEquals(array[10], 50, ACCURACY);
    }

    @Test
    public void testGeometricProgression() {
        double[] array = Arrays.getGeometricProgression(2, 2, 11);
        assertEquals(array[10], 2048, ACCURACY);
    }

    @Test
    public void testGetDividersOfNumbers() {
        int[] fourthArray = Arrays.getDividersOfNumbers(256);
        for (int i = 0; i < fourthArray.length; i++) {
            if (i < 9) {
                assertEquals(fourthArray[i], -Math.pow(2, 8 - i), ACCURACY);
            } else {
                assertEquals(fourthArray[i], Math.pow(2, i - 9), ACCURACY);
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
        assertEquals((array[0]).doubleValue(), 2, ACCURACY);
        assertEquals((array[3]).doubleValue(), -1, ACCURACY);
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
        assertEquals((int) Arrays.getBoundaryElement(array, true), 11, ACCURACY);
        assertNull(Arrays.getBoundaryElement(new Integer[]{}, true));
    }

    @Test
    public void testGetMaxElementLong() {
        Long[] array = new Long[]{0L, -3L, 2L, 2L, -3L, 0L, 0L, 0L, 2L, -3L, 0L, -3L, 3L, 3L, 0L, -3L, 2L, -3L, 2L, 1L};
        assertEquals((long) Arrays.getBoundaryElement(array, true), 3L, ACCURACY);
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
        assertEquals(Arrays.getSumOfNumbersWithEvenIndices(array), 29, ACCURACY);
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
        assertEquals((double) Arrays.getMostFrequentElement(array), 1.2, ACCURACY);
    }

    @Test
    public void testGetIndex() {
        assertEquals((int) Arrays.getIndex(new Integer[]{1, 4, 8, 2, 9, 4, 5, 11, 6}, 4), 1);
        assertEquals((int) Arrays.getIndex(new Integer[]{1, 4, 8, 2, 9, 4, 5, 11, 6}, 10), -1);
    }

    @Test
    public void testSwapMinAndMaxElements() {
        Integer[] array = new Integer[]{10, 4, 8, 2, 9, 4, 5, 11, 6};
        Arrays.swapMinAndMaxElements(array);
        assertEquals(array, new Integer[]{10, 4, 8, 11, 9, 4, 5, 2, 6});
    }


    @Test
    public void testNot() {
        Integer[] array = new Integer[]{10, 4, 8, 2, 9, 4, 5, 11, 6};
        Arrays.not(array);
        assertEquals(array, new Integer[]{-11, -5, -9, -3, -10, -5, -6, -12, -7});
        Arrays.not(array);
        assertEquals(array, new Integer[]{10, 4, 8, 2, 9, 4, 5, 11, 6});
    }

    @Test
    public void testTestNot() {
        int[] array = new int[]{10, 4, 8, 2, 9, 4, 5, 11, 6};
        Arrays.not(array);
        assertEquals(array, new int[]{-11, -5, -9, -3, -10, -5, -6, -12, -7});
        Arrays.not(array);
        assertEquals(array, new int[]{10, 4, 8, 2, 9, 4, 5, 11, 6});
    }

    @Test
    public void testGetPairwiseSum() {
        assertEquals(Arrays.getPairwiseSum(new int[]{10, 4, 8, 2, 9}), new int[]{14, 10, 9});
        assertEquals(Arrays.getPairwiseSum(new int[]{10, 4, 8, 2, 9, 1, 2, 5}), new int[]{14, 10, 10, 7});
    }

    @Test
    public void testIsEven() {
        assertEquals(Arrays.isEven(new int[]{10, 4, -3, 2, 9}), new boolean[]{true, true, false, true, false});
    }

    @Test
    public void testLongToInt() {
        assertEquals(Arrays.intToLong(Arrays.longToInt(2143713422628356095L)), 2143713422628356095L);
        assertEquals(Arrays.intToLong(Arrays.longToInt(2143713422594793439L)), 2143713422594793439L);
        assertEquals(Arrays.intToLong(Arrays.longToInt(2143713420447309791L)), 2143713420447309791L);
        assertEquals(Arrays.intToLong(Arrays.longToInt(-7079658614259982369L)), -7079658614259982369L);
        assertEquals(Arrays.intToLong(Arrays.longToInt(-2467972597980078113L)), -2467972597980078113L);
    }

    @Test
    public void testGetCyclicFillingArray() {
        assertEquals(Arrays.getCyclicFillingArray(7, 4), new int[]{4, 5, 6, 7, 1, 2, 3});
        try {
            Arrays.getCyclicFillingArray(7, 7);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals(e.getMessage(), "Index of the beginning of filling cannot be greater than the dimension of the array");
        }
    }

    @Test
    public void testGetTriangleArray() {
        assertEquals(Arrays.getTriangleArray(4), new int[][]{{1, 2, 3, 4}, {5, 6, 7}, {8, 9}, {10}});
    }
}