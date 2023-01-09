package gr.aueb.cf.ch14.factory;

import java.util.Random;

public class Point {
    private double x;

    public Point( ) {};

    public Point(double x) {
        this.x = x;
    }

    /**
     * A static factory that returns a (0, 0)
     *new point
     * @return a new (0, 0) point
     * */
    public static Point getZeroPoint() {
        return new Point();
    }

    /**
     * A static factory that returns a random point
     * between 0-100
     * @return a random point between 0-100
     */
    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextDouble() * 100);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String pointToString( ) {
        return "(" + x + ")";
    }
}
