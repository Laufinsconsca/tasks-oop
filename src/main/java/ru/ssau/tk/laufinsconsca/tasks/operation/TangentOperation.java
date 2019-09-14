package ru.ssau.tk.laufinsconsca.tasks.operation;

class TangentOperation extends Operation {
    @Override
    double apply(double number) {
        return Math.tan(number);
    }
}
