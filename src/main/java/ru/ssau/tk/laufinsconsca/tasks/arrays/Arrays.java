package ru.ssau.tk.laufinsconsca.tasks.arrays;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

    @Nullable
    static double[] getSquareEquationArray(double a, double b, double c) throws NullPointerException{
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    throw new NullPointerException("The solution doesn't exist");
                }
                else {
                    throw new NullPointerException("The solution belongs to the domain of all complex numbers");
                }
            }
            else {
                return new double[]{-c/b};
            }
        }
        else {
            if (b*b - 4*a*c > 0) {
                double d = Math.sqrt(b*b - 4*a*c);
                return new double[]{(-b + d)/(2*a),(-b - d)/(2*a)};
            }
            else if (b*b - 4*a*c == 0) {
                return new double[]{-b/(2*a)};
            }
            else {
                throw new NullPointerException("The solution doesn't belong to the domain of real numbers");
            }
        }
    }

    static double[] getNaturalNumbersNotDivisibleByThree(int dim) {
        double[] array = new double[dim];
        int j = 1;
        for(int i = 0; i < dim; i++) {
            if (j%3 == 0) {
                j++;
            }
            array[i] = j;
            j++;
        }
        return array;
    }

    static double[] getArithmeticProgression(double beginElement, double step, int dim) {
        double[] array = new double[dim];
        array[0] = beginElement;
        for(int i = 1; i < dim; i++) {
            array[i] = array[i-1] + step;
        }
        return array;
    }

    static double[] getGeometricProgression(double beginElement, double step, int dim) {
        double[] array = new double[dim];
        array[0] = beginElement;
        for(int i = 1; i < dim; i++) {
            array[i] = array[i-1]*step;
        }
        return array;
    }

    static double[] getDividersOfNumbers(int number) throws NullPointerException{
        if (number == 0) {
            throw new NullPointerException("The set of all natural numbers are dividers");
        }
        int sign = (number>0)?1:-1;
        number = Math.abs(number);
        int count = 0;
        for(int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        double[] array = new double[count*2 + (Math.sqrt(number)==(int)Math.sqrt(number)?1:0)];
        int j = 0;
        for(int i = 0; i < (int)Math.sqrt(number); i++) {
            if (number % (i+1) == 0) {
                array[j] = sign*(i+1);
                array[array.length - j - 1] = sign*number/(i+1);
                j++;
            }
        }
        return array;
    }

}
