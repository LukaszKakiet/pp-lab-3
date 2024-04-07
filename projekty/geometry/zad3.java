import geometry.Point;
import geometry.ColoredCircle;
public class zad3 {
    public static void main(String[] args) {
        Point center = new Point(3.0, 4.0);
        double radius = 5.0;
        String color = "blue";
        ColoredCircle coloredCircle = new ColoredCircle(center, radius, color);
        System.out.println("Właściwości kolorowego koła:");
        System.out.println("Środek koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + coloredCircle.getRadius());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
        System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole koła: " + coloredCircle.getArea());
    }
}