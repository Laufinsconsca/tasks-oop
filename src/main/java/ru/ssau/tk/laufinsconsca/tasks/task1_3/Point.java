package ru.ssau.tk.laufinsconsca.tasks.task1_3;

final class Point {
    private double x, y, z;
    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString(){
        return x + " " + y + " " + z;
    }
}

class Task1_3{
    public static void main(String[] args) {
        Point p1 = new Point(1.5,2,3);
        Point p2 = new Point(4,1,-3.5);
        Point p3 = new Point(3.1,-0.5,2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}