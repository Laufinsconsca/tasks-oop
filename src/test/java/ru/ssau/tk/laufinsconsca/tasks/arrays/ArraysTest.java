package ru.ssau.tk.laufinsconsca.tasks.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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

}