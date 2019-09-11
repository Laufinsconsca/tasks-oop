package ru.ssau.tk.laufinsconsca.tasks.points;

class Points {

    private static double accuracy = 0.00005;

    private Points() {
    }

    static Point sum(Point p1, Point p2) {
        return new Point(p1.x + p2.x, p1.y + p2.y, p1.z + p2.z);
    }

    static Point subtract(Point p1, Point p2) {
        return new Point(p1.x - p2.x, p1.y - p2.y, p1.z - p2.z);
    }

    static Point multiply(Point p1, Point p2) {
        return new Point(p1.x * p2.x, p1.y * p2.y, p1.z * p2.z);
    }

    static Point divide(Point p1, Point p2) {
        return new Point(p1.x / p2.x, p1.y / p2.y, p1.z / p2.z);
    }

    static Point enlarge(Point p, double enlargeOn) {
        return new Point(p.x * enlargeOn, p.y * enlargeOn, p.z * enlargeOn);
    }

    static double length(Point p) {
        return p.length();
    }

    static Point opposite(Point p) {
        return new Point(-p.x, -p.y, -p.z);
    }

    static Point inverse(Point p) {
        return new Point(1 / p.x, 1 / p.y, 1 / p.z);
    }

    static double scalarProduct(Point p1, Point p2) {
        return p1.x * p2.x + p1.y * p2.y + p1.z * p2.z;
    }

    static Point vectorProduct(Point p1, Point p2) {
        return new Point(p1.y * p2.z - p1.z * p2.y, p1.z * p2.x - p1.x * p2.z, p1.x * p2.y - p1.y * p2.x);
    }

    private static boolean equalsApproximately(double a, double b) {
        return Math.abs(a - b) < accuracy;
    }

    static boolean equalsApproximately(Point p1, Point p2) {
        return equalsApproximately(p1.x, p2.x) && equalsApproximately(p1.y, p2.y) && equalsApproximately(p1.z, p2.z);
    }

}
