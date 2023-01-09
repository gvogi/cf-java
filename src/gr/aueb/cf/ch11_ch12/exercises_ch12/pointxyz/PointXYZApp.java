package gr.aueb.cf.ch11_ch12.exercises_ch12.pointxyz;

import gr.aueb.cf.ch11_ch12.exercises_ch12.pointxyz.PointXYZ;

public class PointXYZApp {

    public static void main(String[] args) {
        PointXYZ pointXYZ1 = new PointXYZ();
        PointXYZ pointXYZ2 = new PointXYZ(7, 5, 9);
        PointXYZ pointXYZ3 = new PointXYZ(PointXYZ.charToPoint('C'), PointXYZ.charToPoint('F'), 3);

        pointXYZ1.setX(5);
        pointXYZ1.setY(6);
        pointXYZ1.setZ(2);

        System.out.println(pointXYZ1.convertToString());
        System.out.println(pointXYZ2.convertToString());
        System.out.println(pointXYZ3.convertToString());
    }
}
