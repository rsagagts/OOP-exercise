public class TestShape {
    public static void main(String[] args) {
        // Test Shape
        Shape s1 = new Shape();
        System.out.println("s1: " + s1);
        s1.setColor("blue");
        s1.setFilled(false);
        System.out.println("s1 updated -> color=" + s1.getColor() + ", filled=" + s1.isFilled() + " | " + s1);

        Shape s2 = new Shape("yellow", true);
        System.out.println("s2: " + s2);

        // Test Circle
        Circle c1 = new Circle();
        System.out.println("c1: " + c1 + " | area=" + c1.getArea() + ", perimeter=" + c1.getPerimeter());

        Circle c2 = new Circle(2.5, "purple", false);
        c2.setRadius(3.0);
        System.out.println("c2: " + c2 + " | radius=" + c2.getRadius() + ", area=" + c2.getArea());

        // Test Rectangle
        Rectangle r1 = new Rectangle();
        System.out.println("r1: " + r1 + " | area=" + r1.getArea() + ", perimeter=" + r1.getPerimeter());

        Rectangle r2 = new Rectangle(4.0, 6.0, "orange", true);
        r2.setWidth(5.0);
        r2.setLength(8.0);
        System.out.println("r2: " + r2 + " | w=" + r2.getWidth() + ", l=" + r2.getLength() + ", area=" + r2.getArea());

        // Test Square (kiểm tra giữ cạnh vuông khi gọi setWidth / setLength / setSide)
        Square sq1 = new Square();
        System.out.println("sq1: " + sq1);

        Square sq2 = new Square(4.0, "black", true);
        System.out.println("sq2 initial: " + sq2 + " | area=" + sq2.getArea() + ", perimeter=" + sq2.getPerimeter());

        sq2.setWidth(7.0);
        System.out.println("sq2 after setWidth(7.0): side=" + sq2.getSide() + " | " + sq2);

        sq2.setLength(9.0);
        System.out.println("sq2 after setLength(9.0): side=" + sq2.getSide() + " | " + sq2);

        sq2.setSide(2.0);
        System.out.println("sq2 after setSide(2.0): side=" + sq2.getSide() + ", area=" + sq2.getArea());
    }
}
