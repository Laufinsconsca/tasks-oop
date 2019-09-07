package ru.ssau.tk.laufinsconsca.tasks.task_from_1_4_to_1_8;

import ru.ssau.tk.laufinsconsca.tasks.task1_3.*;

public class Points {
    private Points(){}

    public static Point sum(Point p1, Point p2){
        return new Point(p1.getX() + p2.getX(),p1.getY() + p2.getY(),p1.getZ() + p2.getZ());
    }

    public static Point subtract(Point p1, Point p2){
        return new Point(p1.getX() - p2.getX(),p1.getY() - p2.getY(),p1.getZ() - p2.getZ());
    }

    public static Point multiply(Point p1, Point p2){
        return new Point(p1.getX() * p2.getX(),p1.getY() * p2.getY(),p1.getZ() * p2.getZ());
    }

    public static Point divide(Point p1, Point p2){
        return new Point(p1.getX() / p2.getX(),p1.getY() / p2.getY(),p1.getZ() / p2.getZ());
    }

    public static Point enlarge(Point p, double enlargeOn) {
        return new Point(p.getX() * enlargeOn,p.getY() * enlargeOn,p.getZ() * enlargeOn);
    }

    public static double length(Point p){
        return p.length();
    }

    public static Point opposite(Point p){
        return new Point(-p.getX(),-p.getY(),-p.getZ());
    }

    public static Point inverse(Point p){
        return new Point(1 / p.getX(),1 / p.getY(),1 / p.getZ());
    }

    public static double scalarProduct(Point p1, Point p2){
        return p1.getX()*p2.getX() + p1.getY()*p2.getY() + p1.getZ()*p2.getZ();
    }

    public static Point vectorProduct(Point p1, Point p2){
        return new Point(p1.getY()*p2.getZ() - p1.getZ()*p2.getY(), p1.getZ()*p2.getX() - p1.getX()*p2.getZ(), p1.getX()*p2.getY()-p1.getY()*p2.getX());
    }
}
