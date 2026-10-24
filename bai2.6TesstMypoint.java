public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(5, 6);

        System.out.println("Toạ độ p1: " + p1);
        System.out.println("Khoảng cách p1 tới (5, 6): " + p1.distance(5, 6));
        System.out.println("Khoảng cách p1 tới p2: " + p1.distance(p2));
        System.out.println("Khoảng cách p1 tới gốc (0,0): " + p1.distance());

        // Tạo mảng 10 điểm từ (1,1) tới (10,10)
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
            System.out.println("Điểm " + (i + 1) + ": " + points[i]);
        }
    }
}
