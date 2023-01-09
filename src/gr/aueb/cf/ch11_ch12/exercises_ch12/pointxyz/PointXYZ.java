package gr.aueb.cf.ch11_ch12.exercises_ch12.pointxyz;

/**
 * Class PointXYZ represents <i>points</i> in a 3D space,
 * where <b>x</b>, <b>y</b>, <b>z</b> are coordinates
 * in an integer form. All points in the form of (x, y, z)
 * coordinates, can be implemented as instances of the class.
 */
public class PointXYZ {
    private int x;
    private int y;
    private int z;

    /**
     * Initializes a new 3D point with (0, 0, 0)
     * coordinates
     */
    public PointXYZ() {}

    /**
     * Creates a new 3D Point with any given (x, y, z),
     * coordinates.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /**
     * Returns the ASCII value of a char, to be used as a coordinate.
     * There's no meaning to this, it just seemed fun.😊😊😊
     *
     * @param ch Char whose ASCII value we want to take as a point.
     * @return  Char's ASCII value.
     */
    public static int charToPoint(char ch) {
        return ch;
    }

    /**
     * All the values of the point's coordinates.
     *
     * @return All the coordinates in a String [x, y, z].
     */
    public String convertToString() {
        return "["+ x + ", " + y + ", " + z + "]";
    }
}
