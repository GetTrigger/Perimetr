/**
 * Created by Devil Trigger S on 11.10.2014.
 */
class Point {
    public double x;
    public double y;

    public Point(double x1, double y1) {
        y = y1;
        x = x1;
    }
}

class MyMath {
    public static double sqr(double f) {
        return f * f;
    }
}

public class Geometry {
    public static void main(String[] args) {
        Point p1 = new Point(0, 2);
        Point p2 = new Point(1, 2);
        System.out.println(distance(p1, p2));
    }

    public static double distance(Point a, Point b) {
        return Math.sqrt(MyMath.sqr(a.x - b.x) + MyMath.sqr(a.y - b.y));
    }
}
