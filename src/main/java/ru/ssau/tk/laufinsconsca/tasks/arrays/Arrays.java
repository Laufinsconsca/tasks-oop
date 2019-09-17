package ru.ssau.tk.laufinsconsca.tasks.arrays;

class Arrays {
    static double[] getRandomArray(int dim) {
        double[] array = new double[dim];
        for (int i = 0; i < dim; i++) {
            array[i] = Math.random() * 100;
        }
        return array;
    }
}
