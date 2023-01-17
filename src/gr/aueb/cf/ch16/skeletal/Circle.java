package gr.aueb.cf.ch16.skeletal;

public class Circle extends AbstractShape implements ICircle, ITwoDimensional {
        private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
