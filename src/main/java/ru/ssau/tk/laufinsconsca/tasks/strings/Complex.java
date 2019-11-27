package ru.ssau.tk.laufinsconsca.tasks.strings;

public class Complex {
    private double real;
    private double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (real != 0) {
            if (imag > 0) {
                return real + " + " + imag + "i";
            } else if (imag < 0) {
                return real + " - " + Math.abs(imag) + "i";
            } else {
                return real + "";
            }
        } else {
            return imag + "*i";
        }
    }
}