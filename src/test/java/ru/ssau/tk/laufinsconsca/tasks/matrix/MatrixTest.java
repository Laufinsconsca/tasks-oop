package ru.ssau.tk.laufinsconsca.tasks.matrix;

import org.testng.annotations.Test;

public class MatrixTest {

    @Test
    public void testToString() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.set(1, 1, 1);
        firstMatrix.set(1, 2, 2);
        firstMatrix.set(2, 1, 3);
        firstMatrix.set(2, 2, 4);
        System.out.println(firstMatrix + "\n");
        Matrix secondMatrix = new Matrix(3, 3);
        secondMatrix.set(1, 1, 1);
        secondMatrix.set(1, 2, 2);
        secondMatrix.set(1, 3, 3);
        secondMatrix.set(2, 1, 4);
        secondMatrix.set(2, 2, 10);
        secondMatrix.set(2, 3, 12);
        secondMatrix.set(3, 1, -7);
        secondMatrix.set(3, 2, 8);
        secondMatrix.set(3, 3, -9);
        System.out.println(secondMatrix);
    }
}