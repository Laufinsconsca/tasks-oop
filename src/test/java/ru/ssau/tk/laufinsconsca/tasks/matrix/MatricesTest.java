package ru.ssau.tk.laufinsconsca.tasks.matrix;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class MatricesTest {

    @Test
    public void testAdd() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.set(1, 1, 1);
        firstMatrix.set(1, 2, 2);
        firstMatrix.set(2, 1, 3);
        firstMatrix.set(2, 2, 4);
        Matrix secondMatrix = new Matrix(2, 2);
        secondMatrix.set(1, 1, -1);
        secondMatrix.set(1, 2, 3);
        secondMatrix.set(2, 1, 5);
        secondMatrix.set(2, 2, -4);

        Matrix firstResult = Matrices.add(firstMatrix, new Matrix(new double[][]{{1}, {2}}));
        assertNull(firstResult);

        assertNull(Matrices.add(firstMatrix, null));

        Matrix secondResult = Matrices.add(firstMatrix, secondMatrix);
        assertEquals(secondResult.get(1, 1), 0);
    }

    @Test
    public void testSubtract() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.set(1, 1, 1);
        firstMatrix.set(1, 2, 2);
        firstMatrix.set(2, 1, 3);
        firstMatrix.set(2, 2, 4);
        Matrix secondMatrix = new Matrix(2, 2);
        secondMatrix.set(1, 1, -1);
        secondMatrix.set(1, 2, 3);
        secondMatrix.set(2, 1, 5);
        secondMatrix.set(2, 2, -4);

        Matrix thirdResult = Matrices.subtract(firstMatrix, secondMatrix);
        assertEquals(thirdResult.get(1, 2), -1);
    }

    @Test
    public void testMultiply() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.set(1, 1, 1);
        firstMatrix.set(1, 2, 2);
        firstMatrix.set(2, 1, 3);
        firstMatrix.set(2, 2, 4);
        Matrix secondMatrix = new Matrix(2, 2);
        secondMatrix.set(1, 1, -1);
        secondMatrix.set(1, 2, 3);
        secondMatrix.set(2, 1, 5);
        secondMatrix.set(2, 2, -4);

        Matrix mul = Matrices.multiply(firstMatrix, secondMatrix);
        assertEquals(mul.get(2, 1), 17);

        assertNull(Matrices.multiply(firstMatrix, new Matrix(new double[][]{{1, 2, 3}, {4, 5, 6}})));
    }

    @Test
    public void testMultiplyOnTheNumber() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.set(1, 1, 1);
        firstMatrix.set(1, 2, 2);
        firstMatrix.set(2, 1, 3);
        firstMatrix.set(2, 2, 4);
        Matrix secondMatrix = new Matrix(2, 2);
        secondMatrix.set(1, 1, -1);
        secondMatrix.set(1, 2, 3);
        secondMatrix.set(2, 1, 5);
        secondMatrix.set(2, 2, -4);

        Matrix firstResult = Matrices.multiplyOnTheNumber(firstMatrix, 1);
        firstMatrix.set(2, 1, 4);
        assertEquals(firstResult.get(2, 1), 3);

        firstResult = Matrices.multiplyOnTheNumber(firstMatrix, 2);
        assertEquals(firstResult.get(2, 1), 8);
    }

    @Test
    public void testDet() {
        Matrix matrix = new Matrix(3, 3);
        matrix.set(1, 1, 1);
        matrix.set(1, 2, 2);
        matrix.set(1, 3, 3);
        matrix.set(2, 1, 4);
        matrix.set(2, 2, 10);
        matrix.set(2, 3, 12);
        matrix.set(3, 1, -7);
        matrix.set(3, 2, 8);
        matrix.set(3, 3, -9);
        assertEquals(Matrices.det(matrix), 24, 0.00001);
    }
}