package ru.ssau.tk.laufinsconsca.tasks.task1_3;

import ru.ssau.tk.laufinsconsca.tasks.task_from_1_4_to_1_8.*;

final public class Point {
    final public double x, y, z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return Math.sqrt(x*x + y*y + z*z);
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
        Point testPoint = new Point(0,0,0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(Points.sum(p1,p2));
    }
}