package ru.ssau.tk.laufinsconsca.tasks.points;

final public class Point {
    final double x, y, z;

    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }
}
