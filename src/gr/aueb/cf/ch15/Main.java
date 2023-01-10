package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
//        Point p2 = new Point2D(10, 10);
        Point2D p2 = new Point2D(10, 10);
        Point p3 = new Point3D(10, 11, 12);

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);
        
//        ((Point2D) p2).setY(12);
        p2.setY(12);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }

    public static void doPrint(Point point) {
        System.out.println(point.toString());
    }
}
