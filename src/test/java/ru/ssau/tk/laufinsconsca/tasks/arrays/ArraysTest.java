package ru.ssau.tk.laufinsconsca.tasks.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {

    @Test
    public void testGetRandomArray() {
        int dim = 10;
        double[] array = Arrays.getRandomArray(dim);
        assertEquals(array.length, dim, 0.0001);
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

    @Test
    public void testGetOddArray() {
        int dim = 10;
        double[] array = Arrays.getOddArray(dim);
        for (int i = 0; i < dim; i++) {
            assertEquals(array[i], i*2 + 1, 0.0001);
        }
    }

    @Test
    public void testGetEvenArrayInDescendingOrder() {
        int dim = 10;
        double[] array = Arrays.getEvenArrayInDescendingOrder(dim);
        for (int i = dim - 1; i >= 0; i--) {
            assertEquals(array[i], i*2 + 2, 0.0001);
        }
    }

    @Test
    public void testGetFibonacciArray() {
        int dim = 10;
        double[] array = Arrays.getFibonacciArray(dim);
        assertEquals(array[dim - 1], 55, 0.0001);
    }

    @Test
    public void testGetSquareArray() {
        int dim = 10;
        double[] array = Arrays.getSquareArray(dim);
        assertEquals(array[dim - 1], 81, 0.0001);
    }

    @Test
    public void testGetSquareEquationArray() {
        double[] firstSolutionOfFullSquareEquation = Arrays.getSquareEquationArray(3,-11,10);
        double accuracy = 0.00001;
        if (firstSolutionOfFullSquareEquation != null) {
            assertEquals(firstSolutionOfFullSquareEquation[0], 2, accuracy);
            assertEquals(firstSolutionOfFullSquareEquation[1], 5./3, accuracy);
        }
        double[] solutionOfLinearEquation = Arrays.getSquareEquationArray(0,3,-9);
        if (firstSolutionOfFullSquareEquation != null) {
            assertEquals(solutionOfLinearEquation[0], 3, accuracy);
        }
        double[] secondSolutionOfFullSquareEquation = Arrays.getSquareEquationArray(2,-8,8);
        if (secondSolutionOfFullSquareEquation != null) {
            assertEquals(secondSolutionOfFullSquareEquation[0], 2, accuracy);
        }

        try {
            double[] solutionDoesNotExist = Arrays.getSquareEquationArray(0, 0, 5);
        }
        catch (NullPointerException e){
            assertEquals(e.getMessage(), "The solution doesn't exist");
        }

        try {
            double[] solutionIsAnyNumber = Arrays.getSquareEquationArray(0, 0, 0);
        }
        catch (NullPointerException e){
            assertEquals(e.getMessage(), "The solution belongs to the domain of all complex numbers");
        }

        try {
            double[] solutionBelongsDomainOfComplexNumbers = Arrays.getSquareEquationArray(3, 7, 10);
        }
        catch (NullPointerException e){
            assertEquals(e.getMessage(), "The solution doesn't belong to the domain of real numbers");
        }
    }
}