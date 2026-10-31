import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println("Circle 1 (Default): " + c1);

        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println("Circle 2 (Coordinates): " + c2);

        MyPoint p = new MyPoint(1, 1);
        MyCircle c3 = new MyCircle(p, 10);
        System.out.println("Circle 3 (MyPoint): " + c3);

        c1.setRadius(4);
        c1.setCenter(new MyPoint(2, 2));
        System.out.println("Circle 1 sau khi setRadius & setCenter: " + c1);
        System.out.println("Radius của c1: " + c1.getRadius());
        System.out.println("Center của c1: " + c1.getCenter());

        c1.setCenterX(10);
        c1.setCenterY(20);
        System.out.println("Circle 1 sau khi setCenterX/Y: " + c1);
        System.out.println("Center X: " + c1.getCenterX() + ", Center Y: " + c1.getCenterY());

        c1.setCenterXY(0, 0);
        System.out.println("Circle 1 sau khi setCenterXY(0,0): " + c1);
        System.out.println("Center XY: " + Arrays.toString(c1.getCenterXY()));

        System.out.printf("Diện tích Circle 2 (getArea): %.2f%n", c2.getArea());
        System.out.printf("Chu vi Circle 2 (getCircumference): %.2f%n", c2.getCircumference());

        MyCircle c4 = new MyCircle(0, 0, 2);
        MyCircle c5 = new MyCircle(3, 4, 3);
        System.out.printf("Khoảng cách giữa tâm c4 và c5 (distance): %.2f%n", c4.distance(c5));
    }
}
