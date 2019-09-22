package ru.ssau.tk.laufinsconsca.tasks.arrays;

import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.ListIterator;

class Arrays {

    private Arrays() {
    }

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
            array[i] = i * 2 + 1;
        }
        return array;
    }

    static double[] getEvenArrayInDescendingOrder(int dim) {
        double[] array = new double[dim];
        for (int i = dim - 1; i >= 0; i--) {
            array[i] = i * 2 + 2;
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
            array[i] = i * i;
        }
        return array;
    }

    @Nullable
    static double[] getSquareEquationArray(double a, double b, double c) throws NullPointerException {
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    throw new NullPointerException("The solution doesn't exist");
                } else {
                    throw new NullPointerException("The solution belongs to the domain of all complex numbers");
                }
            } else {
                return new double[]{-c / b};
            }
        } else {
            if (b * b - 4 * a * c > 0) {
                double d = Math.sqrt(b * b - 4 * a * c);
                return new double[]{(-b + d) / (2 * a), (-b - d) / (2 * a)};
            } else if (b * b - 4 * a * c == 0) {
                return new double[]{-b / (2 * a)};
            } else {
                throw new NullPointerException("The solution doesn't belong to the domain of real numbers");
            }
        }
    }

    static double[] getNaturalNumbersNotDivisibleByThree(int dim) {
        double[] array = new double[dim];
        int j = 1;
        for (int i = 0; i < dim; i++) {
            if (j % 3 == 0) {
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
        for (int i = 1; i < dim; i++) {
            array[i] = array[i - 1] + step;
        }
        return array;
    }

    static double[] getGeometricProgression(double beginElement, double step, int dim) {
        double[] array = new double[dim];
        array[0] = beginElement;
        for (int i = 1; i < dim; i++) {
            array[i] = array[i - 1] * step;
        }
        return array;
    }

    static int[] getDividersOfNumbers(int number) throws NullPointerException {
        if (number == 0) {
            throw new NullPointerException("The set of all natural numbers are dividers excepts zero");
        }
        number = Math.abs(number);
        int count = 0;
        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] array = new int[(count * 2 + (Math.sqrt(number) == (int) Math.sqrt(number) ? 1 : 0)) * 2];
        int j = array.length / 2;
        for (int i = 0; i < (int) Math.sqrt(number); i++) {
            if (number % (i + 1) == 0) {
                array[j] = i + 1;
                array[array.length - j - 1] = -i - 1;
                array[j - array.length / 2] = -number / (i + 1);
                array[3 * array.length / 2 - j - 1] = number / (i + 1);
                j++;
            }
        }
        return array;
    }

    static int[] getPrimeNumbersUpTo(int number) {
        if (number == 0) {
            throw new NullPointerException("Zero is not prime or compound number");
        }
        LinkedList<Integer> temp = new LinkedList<>();
        temp.add(1);
        for (int i = 2; i <= number; i++) {
            if (Arrays.getDividersOfNumbers(i).length == 4) {
                temp.add(i);
            }
        }
        int[] array = new int[temp.size()];
        ListIterator<Integer> iterator = temp.listIterator();
        for (int i = 0; iterator.hasNext(); i++) {
            array[i] = iterator.next();
        }
        return array;
    }

    static int[] getSymmetricArray(int size) {
        if (size <= 0) {
            throw new NullPointerException("Incorrect size");
        }
        int[] array = new int[size];
        for (int i = 0; i < Math.ceil((double) size / 2); i++) {
            array[i] = i + 1;
            array[size - i - 1] = i + 1;
        }
        return array;
    }

    static void negate(Number[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Double) {
                array[i] = -((Double) array[i]);
            }
            if (array[i] instanceof Integer) {
                array[i] = -((Integer) array[i]);
            }
        }
    }

    static boolean doesArrayContainTheValue(Number[] array, double value) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("The empty array was passed");
        }
        for (Number n : array) {
            if (value == n.doubleValue() && n instanceof Double) {
                return true;
            }
            if (value == n.doubleValue() && n instanceof Integer) {
                return true;
            }
        }
        return false;
    }

    static boolean doesArrayContainNull(Integer[] array) {
        try {
            for (Integer n : array) {
                n += 0;
            }
        } catch (NullPointerException e) {
            return true;
        }
        return false;
    }

    static int getCountOfEvenNumbers(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int getSumOfNumbersWithEvenIndices(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    static boolean isCountOfNumbersDivisibleByTheFirstElementOfTheArrayIsGreaterThanTheLast(int[] array) {
        int countElementsDivisibleByTheFirstElement = 0;
        int countElementsDivisibleByTheLastElement = 0;
        for (int n : array) {
            if (n % array[0] == 0) {
                countElementsDivisibleByTheFirstElement++;
            }
            if (n % array[array.length - 1] == 0) {
                countElementsDivisibleByTheLastElement++;
            }
        }
        return countElementsDivisibleByTheFirstElement > countElementsDivisibleByTheLastElement;
    }

    static Number getBoundaryElement(Number[] array, boolean isMaxElement) {
        if (array.length == 0) {
            return null;
        }
        Number boundaryElement = 0;
        if (array instanceof Integer[]) {
            boundaryElement = (isMaxElement) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        if (array instanceof Long[]) {
            boundaryElement = (isMaxElement) ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (array instanceof Double[]) {
            boundaryElement = (isMaxElement) ? Double.MIN_VALUE : Double.MAX_VALUE;
        }
        if (array instanceof Float[]) {
            boundaryElement = (isMaxElement) ? Float.MIN_VALUE : Float.MAX_VALUE;
        }
        for (Number n : array) {
            if ((isMaxElement) ? n.doubleValue() > boundaryElement.doubleValue() : n.doubleValue() < boundaryElement.doubleValue()) {
                boundaryElement = n.doubleValue();
            }
        }
        if (array instanceof Integer[]) {
            return boundaryElement.intValue();
        } else if (array instanceof Long[]) {
            return boundaryElement.longValue();
        } else if (array instanceof Double[]) {
            return boundaryElement.doubleValue();
        } else if (array instanceof Float[]) {
            return boundaryElement.floatValue();
        } else {
            return null;
        }
    }

    static Number getMostFrequentElement(Number[] array) {
        if (array instanceof Double[] || array instanceof Float[]) {
            return getMostFrequentElement((Double[]) array);
        }
        boolean instanceOfInteger = false;
        if (array instanceof Integer[]) {
            array = integerToLong((Integer[]) array);
            instanceOfInteger = true;
        }
        if (array.length == 0) {
            return null;
        }
        if (array.length == 1) {
            return array[0];
        }
        long max = (long) Arrays.getBoundaryElement(array, true);
        long min = (long) Arrays.getBoundaryElement(array, false);
        int[][] numCounts = new int[(int) (max - min + 1)][2];
        for (int i = 0; i < numCounts.length; i++) {
            numCounts[i][0] = 0;
            numCounts[i][1] = -1;
        }
        for (int i = 0; i < array.length; i++) {
            numCounts[(int) (array[i].longValue() - min)][0] = numCounts[(int) (array[i].longValue() - min)][0] + 1;
            if (numCounts[(int) (array[i].longValue() - min)][1] == -1) {
                numCounts[(int) (array[i].longValue() - min)][1] = i;
            }
        }
        long mostFrequentElement = min;
        long currentMostFrequentElement = Long.MIN_VALUE;
        for (int i = 0; i < numCounts.length; i++) {
            if (numCounts[i][0] > currentMostFrequentElement || (numCounts[i][0] == currentMostFrequentElement && numCounts[(int) (mostFrequentElement - min)][1] > numCounts[i][1])) {
                currentMostFrequentElement = numCounts[i][0];
                mostFrequentElement = i + min;
            }
        }
        if (!instanceOfInteger) {
            return mostFrequentElement;
        } else {
            return (int) mostFrequentElement;
        }
    }

    private static Double getMostFrequentElement(Double[] array) {
        Long[] longArray = doubleToLong(array);
        int pow = (int) (long) longArray[longArray.length - 1];
        long mostFrequentElement = (long) getMostFrequentElement(longArray);
        return mostFrequentElement * Math.pow(10, -pow);
    }

    private static Long[] doubleToLong(Double[] array) {
        long k = 0L;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != (long) (double) array[i]) {
                for (int j = 0; j < array.length; j++) {
                    array[j] *= 10;
                }
                k++;
            }
        }
        Long[] longArray = new Long[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            longArray[i] = (long) (double) array[i];
        }
        longArray[array.length] = k;
        return longArray;
    }

    private static Long[] integerToLong(Integer[] array) {
        Long[] longArray = new Long[array.length];
        for (int i = 0; i < array.length; i++) {
            longArray[i] = (long) (int) array[i];
        }
        return longArray;
    }

    static Integer getIndex(Number[] array, Number number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(number)) {
                return i;
            }
        }
        return -1;
    }

    static void swapMinAndMaxElements(Number[] array) {
        int indexOfMax = getIndex(array, getBoundaryElement(array, true));
        int indexOfMin = getIndex(array, getBoundaryElement(array, false));
        Number temp = array[indexOfMax];
        array[indexOfMax] = array[indexOfMin];
        array[indexOfMin] = temp;
    }

    static void not(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    static int[] not(final int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
        return result;
    }

    static int[] getPairwiseSum(int[] array) {
        int[] result = new int[array.length / 2 + (array.length % 2 == 0 ? 0 : 1)];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[2 * i] + (2 * i + 1 < array.length ? array[2 * i + 1] : 0);
        }
        return result;
    }

    static boolean[] isEven(int[] array) {
        boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] % 2 == 0;
        }
        return result;
    }

    static int[] longToInt(long number) {
        return new int[]{(int) (number >>> 32), (int) number};
    }

    static long intToLong(int[] number) {
        return ((long) number[0] << 32) | ((long) number[1] & 4294967295L);
    }

    static int[] getCyclicFillingArray(int dim, int indexOfTheBeginningOfFilling) {
        if (indexOfTheBeginningOfFilling >= dim) {
            throw new ArrayIndexOutOfBoundsException("Index of the beginning of filling cannot be greater than the dimension of the array");
        }
        int[] result = new int[dim];
        for (int i = 0; i < dim; i++) {
            result[i + indexOfTheBeginningOfFilling - (i + indexOfTheBeginningOfFilling >= dim ? dim : 0)] = i + 1;
        }
        return result;
    }

    static int[][] getTriangleArray(int dim) {
        int[][] result = new int[dim][];
        int k = 1;
        for (int i = 0; i < dim; i++) {
            result[i] = new int[dim - i];
            for (int j = 0; j < dim - i; j++) {
                result[i][j] = k;
                k++;
            }
        }
        return result;
    }

}
