import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p2a = new Point2D();
        System.out.println("Point2D default: " + p2a);
        Point2D p2b = new Point2D(1.5f, 2.5f);
        System.out.println("Point2D custom: " + p2b);
        System.out.println("Point2D array [x, y]: " + Arrays.toString(p2b.getXY()));

        Point3D p3a = new Point3D();
        System.out.println("Point3D default: " + p3a);
        Point3D p3b = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D custom: " + p3b);
        System.out.println("Point3D array [x, y, z]: " + Arrays.toString(p3b.getXYZ()));
    }
}
