package ru.ssau.tk.laufinsconsca.tasks.points;

class FirstTask {
    public static void main(String[] args) {
        Point p1 = new Point(1.5, 2, 3);
        Point p2 = new Point(4, 1, -3.5);
        Point p3 = new Point(3.1, -0.5, 2);
        Point testPoint = new Point(0, 0, 0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(Points.sum(p1, p2));
    }
}