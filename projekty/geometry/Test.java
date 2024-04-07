import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;
public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(new Point(0, 0), 5);
        circles[1] = new ColoredCircle(new Point(0, 0), 7, "blue");
        for (Circle circle : circles) {
            System.out.println("Pole koła: " + circle.calculateArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła: " + coloredCircle.getColor());
            }
        }
    }
}