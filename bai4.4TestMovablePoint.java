import java.util.Arrays;

public class TestMovablePoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("p1 default: " + p1);
        p1.setXY(1.5f, 2.5f);
        System.out.println("p1 after setXY: " + p1 + ", getXY: " + Arrays.toString(p1.getXY()));

        Point p2 = new Point(3.0f, 4.0f);
        System.out.println("p2: x=" + p2.getX() + ", y=" + p2.getY());

        MovablePoint mp1 = new MovablePoint();
        System.out.println("mp1 default: " + mp1);
        mp1.setSpeed(1.0f, 2.0f);
        System.out.println("mp1 speed: " + Arrays.toString(mp1.getSpeed()));
        mp1.move();
        System.out.println("mp1 after 1st move: " + mp1);

        MovablePoint mp2 = new MovablePoint(2.0f, 3.0f, 0.5f, 1.5f);
        System.out.println("mp2 before move: " + mp2);
        mp2.move().move();
        System.out.println("mp2 after 2 moves (chained): " + mp2);

        MovablePoint mp3 = new MovablePoint(-1.0f, -2.0f);
        mp3.setXY(5.0f, 6.0f);
        System.out.println("mp3 before move: " + mp3);
        mp3.move();
        System.out.println("mp3 after move: " + mp3);
    }
}
