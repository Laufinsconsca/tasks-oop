package ru.ssau.tk.laufinsconsca.tasks.arrays;

class Arrays {

    static double[] getRandomArray(int dim) {
        double[] array = new double[dim];
        for (int i = 0; i < dim; i++) {
            array[i] = Math.random() * 100;
        }
        return array;
    }
    static double[] getTwoOneTwoArray(int dim) {
        double[] array = new double[dim];
        array[0] = 2;
        array[dim - 1] = 2;
        for (int i = 1; i < dim - 1; i++) {
            array[i] = 1;
        }
        return array;
    }

    static double[] getOddArray(int dim) {
        double[] array = new double[dim];
        for (int i = 0; i < dim; i++) {
            array[i] = i*2 + 1;
        }
        return array;
    }

    static double[] getEvenArrayInDescendingOrder(int dim) {
        double[] array = new double[dim];
        for (int i = dim - 1; i >= 0; i--) {
            array[i] = i*2 + 2;
        }
        return array;
    }

    static double[] getFibonacciArray(int dim) {
        double[] array = new double[dim];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < dim; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    static double[] getSquareArray(int dim) {
        double[] array = new double[dim];
        for (int i = 0; i < dim; i++) {
            array[i] = i*i;
        }
        return array;
    }
}
