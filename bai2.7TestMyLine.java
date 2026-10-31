import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 4, 6);
        System.out.println("Line 1: " + line1);

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("Line 2: " + line2);

        line1.setBegin(new MyPoint(2, 3));
        line1.setEnd(new MyPoint(5, 7));
        System.out.println("Line 1 sau khi setBegin & setEnd: " + line1);
        System.out.println("Line 1 begin point: " + line1.getBegin());
        System.out.println("Line 1 end point: " + line1.getEnd());

        line1.setBeginX(10);
        line1.setBeginY(20);
        line1.setEndX(30);
        line1.setEndY(40);
        System.out.println("Line 1 sau khi set X, Y lẻ: " + line1);
        System.out.println("Begin X: " + line1.getBeginX() + ", Begin Y: " + line1.getBeginY());
        System.out.println("End X: " + line1.getEndX() + ", End Y: " + line1.getEndY());

        line1.setBeginXY(0, 0);
        line1.setEndXY(3, 4);
        System.out.println("Line 1 sau khi setBeginXY(0,0) và setEndXY(3,4): " + line1);
        System.out.println("Begin XY: " + Arrays.toString(line1.getBeginXY()));
        System.out.println("End XY: " + Arrays.toString(line1.getEndXY()));

        System.out.printf("Độ dài Line 1 (getLength): %.2f%n", line1.getLength());
        System.out.printf("Góc nghiêng Line 1 theo Radian (getGradient): %.4f rad%n", line1.getGradient());
    }
}
