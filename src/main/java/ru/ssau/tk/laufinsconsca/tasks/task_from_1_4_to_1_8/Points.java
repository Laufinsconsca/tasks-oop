package ru.ssau.tk.laufinsconsca.tasks.task_from_1_4_to_1_8;

import ru.ssau.tk.laufinsconsca.tasks.task1_3.*;

public class Points {
    private Points(){}

    public static Point sum(Point p1, Point p2){
        return new Point(p1.x + p2.x,p1.y + p2.y,p1.z + p2.z);
    }

    public static Point subtract(Point p1, Point p2){
        return new Point(p1.x - p2.x,p1.y - p2.y,p1.z - p2.z);
    }

    public static Point multiply(Point p1, Point p2){
        return new Point(p1.x * p2.x,p1.y * p2.y,p1.z * p2.z);
    }

    public static Point divide(Point p1, Point p2){
        return new Point(p1.x / p2.x,p1.y / p2.y,p1.z / p2.z);
    }

    public static Point enlarge(Point p, double enlargeOn) {
        return new Point(p.x * enlargeOn,p.y * enlargeOn,p.z * enlargeOn);
    }

    public static double length(Point p){
        return p.length();
    }

    public static Point opposite(Point p){
        return new Point(-p.x,-p.y,-p.z);
    }

    public static Point inverse(Point p){
        return new Point(1 / p.x,1 / p.y,1 / p.z);
    }

    public static double scalarProduct(Point p1, Point p2){
        return p1.x*p2.x + p1.y*p2.y + p1.z*p2.z;
    }

    public static Point vectorProduct(Point p1, Point p2){
        return new Point(p1.y*p2.z - p1.z*p2.y, p1.z*p2.x - p1.x*p2.z, p1.x*p2.y-p1.y*p2.x);
    }
}
