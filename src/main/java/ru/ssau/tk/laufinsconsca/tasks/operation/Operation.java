package ru.ssau.tk.laufinsconsca.tasks.operation;

abstract class Operation {
    abstract double apply(double number);

    double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
