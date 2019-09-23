package ru.ssau.tk.laufinsconsca.tasks.matrix;

import java.io.*;

public class Matrix implements Serializable {
    private double[][] matrix;
    private final int countRow;
    private final int countColumn;

    Matrix(int row, int column) {
        countColumn = column;
        countRow = row;
        matrix = new double[row][column];
        for (int i = 0; i < countRow; i++) {
            for (int j = 0; j < countColumn; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    Matrix(double[][] matrix) {
        countRow = matrix.length;
        countColumn = matrix[0].length;
        this.matrix = matrix;
    }

    int getCountRow() {
        return countRow;
    }

    int getCountColumn() {
        return countColumn;
    }

    void set(int n, int m, double number) {
        matrix[n - 1][m - 1] = number;
    }

    double get(int n, int m) {
        return matrix[n - 1][m - 1];
    }

    public Matrix clone() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream ous;
            ous = new ObjectOutputStream(baos);
            ous.writeObject(this);
            ous.close();
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (Matrix) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
