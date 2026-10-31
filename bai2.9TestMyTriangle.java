public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 0, 4, 3, 0);
        System.out.println("Triangle 1: " + t1);
        System.out.printf("Chu vi Triangle 1: %.2f%n", t1.getPerimeter());
        System.out.println("Loại Triangle 1: " + t1.getType());

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(2, (int)(2 * Math.sqrt(3)));
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println("\nTriangle 2: " + t2);
        System.out.printf("Chu vi Triangle 2: %.2f%n", t2.getPerimeter());
        System.out.println("Loại Triangle 2: " + t2.getType());

        MyTriangle t3 = new MyTriangle(0, 0, 2, 4, 4, 0);
        System.out.println("\nTriangle 3: " + t3);
        System.out.printf("Chu vi Triangle 3: %.2f%n", t3.getPerimeter());
        System.out.println("Loại Triangle 3: " + t3.getType());
    }
}
